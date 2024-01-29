package com.tbz.shop.order;

import com.tbz.shop.IdNotFoundException;
import com.tbz.shop.product.book.Book;
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
@RequestMapping("orders")
public class OrderWeb {
    @Autowired
    private OrderService orderService;
    @GetMapping
    public ResponseEntity<List<Order>> allPrepaidCards(){
        return ResponseEntity.ok().body(orderService.getAllOrders());
    }
    @GetMapping("/{orderId}")
    public ResponseEntity<Order> oneCD(@PathVariable("orderId") Integer id) throws IdNotFoundException {
        Order order = orderService.getOneOrder(id);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }
    @ExceptionHandler(IdNotFoundException.class)
    public ResponseEntity<String> handlerNoSuchReviewException(IdNotFoundException re) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(re.getMessage());
    }
}
