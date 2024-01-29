package com.tbz.shop.product;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@Table(name = "product")
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "productId", nullable = false)
    private Integer productId;

    @Column(name = "name")
    private String name;

    @Column(name = "productDescription")
    private String productDescription;

    @Column(name = "price")
    private Integer price;

    public Product() {
    }

    public Integer getProductId() {
        return productId;
    }
    public Product(Integer productId, String name, String productDescription, Integer price) {
        productId = productId;
        this.name = name;
        this.productDescription = productDescription;
        this.price = price;
    }

    public void setProductId(Integer productId) {
        productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
