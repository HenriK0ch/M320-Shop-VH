package com.tbz.shop.product.cd;


import com.tbz.shop.product.Product;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class CD extends Product {
    @Column(name = "length")
    private Float length;

    @Column(name = "genre")
    private String genre;
    public CD(Integer productId, String name, String productDescription, Integer price) {
        super(productId, name, productDescription, price);
    }

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }
}
