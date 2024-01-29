package com.tbz.shop.product.book;

import com.tbz.shop.IdNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookWeb {
    @Autowired
    private BookService service;
    @GetMapping
    public ResponseEntity<List<Book>> allBooks(){

        return ResponseEntity.ok().body(service.getAllBooks());
    }
    @GetMapping("/{bookId}")
    public ResponseEntity<Book> oneCD(@PathVariable("bookId") Integer id) throws IdNotFoundException {
        Book book = service.getOneBook(id);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }
    @ExceptionHandler(IdNotFoundException.class)
    public ResponseEntity<String> handlerNoSuchReviewException(IdNotFoundException re) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(re.getMessage());
    }
}
