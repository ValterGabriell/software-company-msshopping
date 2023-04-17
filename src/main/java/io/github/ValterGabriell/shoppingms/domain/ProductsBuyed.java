package io.github.ValterGabriell.shoppingms.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class ProductsBuyed {
    @Id
    private String buyId;
    @Column(nullable = false)
    private String productName;

    @Temporal(value = TemporalType.DATE)
    private LocalDate buyDay;
    @Column(nullable = false)
    private int numberOfInstallments;

    @Column(nullable = false)
    private BigDecimal productValue;

    @Column(nullable = false)
    private BigDecimal installmentsValue;


    private String cardCpf;

    public ProductsBuyed() {
    }

    public ProductsBuyed(LocalDate buyDay) {
        this.buyDay = buyDay;
    }

    public LocalDate getBuyDay() {
        return buyDay;
    }

    public String getBuyId() {
        return buyId;
    }

    public void setBuyId(String buyId) {
        this.buyId = buyId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getNumberOfInstallments() {
        return numberOfInstallments;
    }

    public void setNumberOfInstallments(int numberOfInstallments) {
        this.numberOfInstallments = numberOfInstallments;
    }


    public void setBuyDay(LocalDate buyDay) {
        this.buyDay = buyDay;
    }

    public String getCardCpf() {
        return cardCpf;
    }

    public void setCardCpf(String cardNumber) {
        this.cardCpf = cardNumber;
    }



    public BigDecimal getProductValue() {
        return productValue;
    }

    public void setProductValue(BigDecimal productValue) {
        this.productValue = productValue;
    }

    public BigDecimal getInstallmentsValue() {
        return installmentsValue;
    }

    public void setInstallmentsValue(BigDecimal installmentsValue) {
        this.installmentsValue = installmentsValue;
    }

}
