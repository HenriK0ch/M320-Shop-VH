package com.tbz.shop.product.book;

import com.tbz.shop.product.Product;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Book extends Product{
    @Column(name = "pages")
    private Integer pages;

    @Column(name = "genre")
    private String genre;
    public Book(Integer productId, String name, String productDescription, Integer price) {
        super(productId, name, productDescription, price);
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
