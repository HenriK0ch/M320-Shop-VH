package com.tbz.shop.order.payment.prepaidCard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PrepaidCardService {
    @Autowired
    private PrepaidCardRepository prepaidCardRepository;

    public List<PrepaidCard> getAllPrepaidCards(){
        return prepaidCardRepository.findAll();
    }
}
