package io.github.ValterGabriell.shoppingms.domain.dto;

import java.math.BigDecimal;

public class BuyResponse {

    private Long idClientCard;
    private String cpf;

    private BigDecimal currentLimit;

    private BigDecimal cardLimit;


    public BigDecimal getCurrentLimit() {
        return currentLimit;
    }

    public void setCurrentLimit(BigDecimal currentLimit) {
        this.currentLimit = currentLimit;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Long getIdClientCard() {
        return idClientCard;
    }

    public void setIdClientCard(Long idClientCard) {
        this.idClientCard = idClientCard;
    }

    public BigDecimal getCardLimit() {
        return cardLimit;
    }

    public void setCardLimit(BigDecimal cardLimit) {
        this.cardLimit = cardLimit;
    }
}
