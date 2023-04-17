package io.github.ValterGabriell.shoppingms.domain.dto;

import java.math.BigDecimal;

public class BuyRequest {
    private BigDecimal buyValue;
    private String product;
    private int numberOfInstallments;

    private String protocol;

    private BuyResponse accountCard;

    private String cpf;

    public BigDecimal getBuyValue() {
        return buyValue;
    }

    public void setBuyValue(BigDecimal buyValue) {
        this.buyValue = buyValue;
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

    public BuyResponse getAccountCard() {
        return accountCard;
    }

    public void setAccountCard(BuyResponse accountCard) {
        this.accountCard = accountCard;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
