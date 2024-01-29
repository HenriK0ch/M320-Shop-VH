package com.tbz.shop.product.book;

import com.tbz.shop.IdNotFoundException;
import com.tbz.shop.product.Product;
import com.tbz.shop.product.cd.CD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
    public Book getOneBook(Integer id) throws IdNotFoundException {
        return bookRepository.findById(id).orElseThrow(() -> new IdNotFoundException("ID "+ id +" not found"));
    }
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }
}
