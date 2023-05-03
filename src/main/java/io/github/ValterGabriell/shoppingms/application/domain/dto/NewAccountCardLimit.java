package io.github.ValterGabriell.shoppingms.application.domain.dto;

import java.math.BigDecimal;

public class NewAccountCardLimit {

    private Long idClientCard;
    private String identifier;

    private BigDecimal currentLimit;

    private BigDecimal cardLimit;


    public BigDecimal getCurrentLimit() {
        return currentLimit;
    }

    public void setCurrentLimit(BigDecimal currentLimit) {
        this.currentLimit = currentLimit;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
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

    @Override
    public String toString() {
        return "NewAccountCardLimit{" +
                "idClientCard=" + idClientCard +
                ", identifier ='" + identifier + '\'' +
                ", currentLimit=" + currentLimit +
                ", cardLimit=" + cardLimit +
                '}';
    }
}
