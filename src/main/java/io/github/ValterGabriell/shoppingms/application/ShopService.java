package io.github.ValterGabriell.shoppingms.application;

import io.github.ValterGabriell.shoppingms.application.domain.ProductsBuyed;
import io.github.ValterGabriell.shoppingms.application.domain.dto.CommonResponse;
import io.github.ValterGabriell.shoppingms.application.domain.dto.NewAccountCardLimit;
import io.github.ValterGabriell.shoppingms.application.domain.dto.BuyRequest;
import io.github.ValterGabriell.shoppingms.infra.repository.ProductBuyedRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class ShopService {

    private final ProductBuyedRepository productBuyedRepository;

    /**
     * method to save product which was buyed and return the new card limit to card ms
     * @param buyRequest current product which was buyed received from card ms
     * @return new account card limit
     */
    public NewAccountCardLimit shopSomething(BuyRequest buyRequest) {

        ProductsBuyed productsBuyed = new ProductsBuyed(LocalDate.now());

        productsBuyed.setProductName(buyRequest.getProduct());
        productsBuyed.setNumberOfInstallments(buyRequest.getNumberOfInstallments());
        productsBuyed.setProductValue(buyRequest.getProductValue());

        BigDecimal installmentsValue = BigDecimal.valueOf(productsBuyed.getProductValue().doubleValue() / buyRequest.getNumberOfInstallments());
        productsBuyed.setInstallmentsValue(installmentsValue);
        productsBuyed.setBuyId(buyRequest.getProtocol());
        productsBuyed.setCardCpf(buyRequest.getIdentifier());
        productBuyedRepository.save(productsBuyed);

        NewAccountCardLimit newAccountCardLimit = buyRequest.getAccountCard();
        BigDecimal newCurrentLimit = newAccountCardLimit.getCurrentLimit().subtract(buyRequest.getProductValue());
        newAccountCardLimit.setCurrentLimit(newCurrentLimit);
        return newAccountCardLimit;
    }


    /**
     * find product buyed by protocol number
     * @param protocol id of product
     * @return product expected
     */
    public CommonResponse<ProductsBuyed> getProductBuyedByProtocol(String protocol) {
        Optional<ProductsBuyed> productsBuyed = productBuyedRepository.findById(protocol);
        CommonResponse<ProductsBuyed> commonResponse = new CommonResponse<>();
        if (productsBuyed.isPresent()) {
            commonResponse.setMessage("Tudo certo!");
            commonResponse.setData(productsBuyed.get());
            return commonResponse;
        } else {
            commonResponse.setMessage("produto nao encontrato");
        }
        return commonResponse;
    }

}
