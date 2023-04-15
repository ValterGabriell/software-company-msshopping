package io.github.ValterGabriell.shoppingms.domain;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

@Service
public class ShopService {



    public void shopSomething(){
//        BuyResponse buyResponse = new BuyResponse();
//        AccountCard accountCard = accountCardRepository.findByCpf(buyRequest.getCpf());
//
//        BigDecimal currentAccountCardLimit = accountCard.getCurrentLimit();
//        if (currentAccountCardLimit.intValue() >= buyRequest.getBuyValue().intValue()) {
//
//            ProductsBuyed productsBuyed = new ProductsBuyed(LocalDate.now());
//            productsBuyed.setProductName(buyRequest.getProduct());
//            productsBuyed.setNumberOfInstallments(buyRequest.getNumberOfInstallments());
//            productsBuyed.setProductValue(buyRequest.getBuyValue());
//            BigDecimal installmentsValue = BigDecimal.valueOf(productsBuyed.getProductValue().doubleValue() / buyRequest.getNumberOfInstallments());
//            productsBuyed.setInstallmentsValue(installmentsValue);
//            productsBuyed.setBuyId(UUID.randomUUID().toString());
//            productsBuyed.setAccountCard(accountCard);
//
//            ArrayList<ProductsBuyed> productsBuyedsList = new ArrayList<>();
//            productsBuyedsList.add(productsBuyed);
//
//            BigDecimal newCurrentLimit = currentAccountCardLimit.subtract(buyRequest.getBuyValue());
//            accountCard.setCurrentLimit(newCurrentLimit);
//            accountCard.setProductsBuyeds(productsBuyedsList);
//
//            buyResponse.setMessage("compra com sucesso efetuada no valor R$: " + buyRequest.getBuyValue());
//            buyResponse.setNewLimite(accountCard.getCurrentLimit());
//            buyResponse.setInstallmentValue(installmentsValue);
//            buyResponse.setNumberOfInstallment(buyRequest.getNumberOfInstallments());
//            buyResponse.setProduct(productsBuyed.getBuyId());
//
//
//            accountCardRepository.save(accountCard);
//        } else {
//            buyResponse.setMessage("compra negada por falta de limite");
//        }
//
//        return buyResponse;
    }

}
