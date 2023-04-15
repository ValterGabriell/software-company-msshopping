package io.github.ValterGabriell.shoppingms.domain.dto;

import java.math.BigDecimal;

public class RequestShop {
    private BigDecimal buyValue;
    private String product;
    private int numberOfInstallments;

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public RequestShop() {
    }

    public int getNumberOfInstallments() {
        return numberOfInstallments;
    }

    public void setNumberOfInstallments(int numberOfInstallments) {
        this.numberOfInstallments = numberOfInstallments;
    }

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

    @Override
    public String toString() {
        return "RequestShop{" +
                "buyValue=" + buyValue +
                ", product='" + product + '\'' +
                ", numberOfInstallments=" + numberOfInstallments +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
