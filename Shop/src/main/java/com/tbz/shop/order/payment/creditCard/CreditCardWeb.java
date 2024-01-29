package com.tbz.shop.order.payment.creditCard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/CreditCards")
public class CreditCardWeb {
    @Autowired
    private CreditCardService creditCardService;
    @GetMapping
    public ResponseEntity<List<CreditCard>> allCreditCards(){
        return ResponseEntity.ok().body(creditCardService.getAllCreditCards());
    }
}
