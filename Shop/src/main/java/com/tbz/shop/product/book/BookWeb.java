package com.tbz.shop.product.book;

import com.tbz.shop.IdNotFoundException;
import com.tbz.shop.product.cd.CD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping
    public ResponseEntity<Book> createCD(@RequestBody Book book) {
        Book createdBook = service.createBook(book);
        return new ResponseEntity<>(createdBook, HttpStatus.CREATED);
    }
    @ExceptionHandler(IdNotFoundException.class)
    public ResponseEntity<String> handlerNoSuchReviewException(IdNotFoundException re) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(re.getMessage());
    }
}
