package com.tbz.shop.product.cd;

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
@RequestMapping("/CDs")
public class CDWeb {
    @Autowired
    private CDService service;
    @GetMapping
    public ResponseEntity<List<CD>> allCDs(){
        return ResponseEntity.ok().body(service.getAllCDs());
    }
    @GetMapping("/{cdId}")
    public ResponseEntity<CD> oneCD(@PathVariable("cdId") Integer id) throws IdNotFoundException {
        CD cd = service.getOneCD(id);
        return new ResponseEntity<>(cd, HttpStatus.OK);
    }
    @ExceptionHandler(IdNotFoundException.class)
    public ResponseEntity<String> handlerNoSuchReviewException(IdNotFoundException re) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(re.getMessage());
    }
}
