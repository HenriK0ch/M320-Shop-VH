package com.tbz.shop.order;

import com.tbz.shop.order.payment.PaymentMethod;
import com.tbz.shop.product.Product;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "order")
public class Order {
    @Id
    @Column(name = "orderId")
    private Integer orderId;
    @ManyToOne
    @JoinColumn(name = "payment_method_id")
    private PaymentMethod paymentMethodId;
    @ManyToMany
    @JoinTable(
            name = "order_products",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products;
    @Column(name = "total")
    private Integer total;
}
