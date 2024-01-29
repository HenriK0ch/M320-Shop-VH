package com.tbz.shop.order.payment.prepaidCard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/PrepaidCards")
public class PrepaidCardWeb {
    @Autowired
    private PrepaidCardService prepaidCardService;
    @GetMapping
    public ResponseEntity<List<PrepaidCard>> allPrepaidCards(){
        return ResponseEntity.ok().body(prepaidCardService.getAllPrepaidCards());
    }
}
