package com.tbz.shop.order.payment.creditcard;

import com.tbz.shop.order.payment.PaymentMethod;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class CreditCard extends PaymentMethod {
    @Column(name = "cardBalance")
    private Integer cardBalance;

    public CreditCard(Integer cardBalance) {
        this.cardBalance = cardBalance;
    }

    public CreditCard(String name, Float fees, Integer cardBalance) {
        super(name, fees);
        this.cardBalance = cardBalance;
    }

    public Integer getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(Integer cardBalance) {
        this.cardBalance = cardBalance;
    }
}
