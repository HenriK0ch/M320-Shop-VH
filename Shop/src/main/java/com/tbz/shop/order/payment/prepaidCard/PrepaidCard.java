package com.tbz.shop.order.payment.prepaidcard;

import com.tbz.shop.order.payment.PaymentMethod;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class PrepaidCard extends PaymentMethod {
    @Column(name = "limite")
    private Integer limite;

    public PrepaidCard(Integer limite) {
        this.limite = limite;
    }

    public PrepaidCard(String name, Float fees, Integer cardBalance) {
        super(name, fees);
        this.limite = cardBalance;
    }

    public Integer getLimite() {
        return limite;
    }

    public void setLimite(Integer limite) {
        this.limite = limite;
    }
}
