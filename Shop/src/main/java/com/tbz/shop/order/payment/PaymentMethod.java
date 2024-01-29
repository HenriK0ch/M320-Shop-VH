package com.tbz.shop.order.payment;

import jakarta.persistence.*;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "PaymentMethods")
public class PaymentMethod {
    @Id
    @Column(name = "paymentMethodId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer paymentMethodId;
    @Column(name = "name")
    private String name;

    @Column(name = "fees")
    private Float fees;

    public PaymentMethod() {
    }

    public PaymentMethod(String name, Float fees) {
        this.name = name;
        this.fees = fees;
    }
}
