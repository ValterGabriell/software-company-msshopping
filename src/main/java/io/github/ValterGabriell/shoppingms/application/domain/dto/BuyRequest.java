package io.github.ValterGabriell.shoppingms.application.domain.dto;

import java.math.BigDecimal;

public class BuyRequest {
    private BigDecimal productValue;
    private String product;
    private int numberOfInstallments;

    private String protocol;

    private NewAccountCardLimit accountCard;

    private String identifier;

    public BigDecimal getProductValue() {
        return productValue;
    }

    public void setBuyValue(BigDecimal buyValue) {
        this.productValue = buyValue;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getNumberOfInstallments() {
        return numberOfInstallments;
    }

    public void setNumberOfInstallments(int numberOfInstallments) {
        this.numberOfInstallments = numberOfInstallments;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public NewAccountCardLimit getAccountCard() {
        return accountCard;
    }

    public void setAccountCard(NewAccountCardLimit accountCard) {
        this.accountCard = accountCard;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
