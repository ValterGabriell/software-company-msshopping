package io.github.ValterGabriell.shoppingms.application;

import io.github.ValterGabriell.shoppingms.application.domain.ProductsBuyed;
import io.github.ValterGabriell.shoppingms.application.domain.dto.CommonResponse;
import io.github.ValterGabriell.shoppingms.application.domain.dto.BuyResponse;
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

    public BuyResponse shopSomething(BuyRequest buyRequest) {
        log.info("recebido: " + buyRequest.getProtocol());
        BuyResponse buyResponse = buyRequest.getAccountCard();
        ProductsBuyed productsBuyed = new ProductsBuyed(LocalDate.now());

        productsBuyed.setProductName(buyRequest.getProduct());
        productsBuyed.setNumberOfInstallments(buyRequest.getNumberOfInstallments());
        productsBuyed.setProductValue(buyRequest.getBuyValue());

        BigDecimal installmentsValue = BigDecimal.valueOf(productsBuyed.getProductValue().doubleValue() / buyRequest.getNumberOfInstallments());
        productsBuyed.setInstallmentsValue(installmentsValue);
        productsBuyed.setBuyId(buyRequest.getProtocol());
        productsBuyed.setCardCpf(buyRequest.getCpf());

        BigDecimal newCurrentLimit = buyResponse.getCurrentLimit().subtract(buyRequest.getBuyValue());
        buyResponse.setCurrentLimit(newCurrentLimit);

        productBuyedRepository.save(productsBuyed);

        return buyResponse;
    }


    public CommonResponse<ProductsBuyed> getProductBuyedByProtocol(String protocol) {
        Optional<ProductsBuyed> productsBuyed = productBuyedRepository.findById(protocol);
        CommonResponse<ProductsBuyed> commonResponse = new CommonResponse<>();
        if (productsBuyed.isPresent()) {
            commonResponse.setMessage("Tudo certo!");
            commonResponse.setData(productsBuyed.get());
            return commonResponse;
        } else {
            log.error("produto nao encontrato");
            commonResponse.setMessage("produto nao encontrato");
        }
        return commonResponse;
    }

}
