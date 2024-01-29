package com.tbz.shop.order.payment.creditcard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CreditCardService {
    @Autowired
    private CreditCardRepository creditCardRepository;

    public List<CreditCard> getAllCreditCards(){
        return creditCardRepository.findAll();
    }
}
