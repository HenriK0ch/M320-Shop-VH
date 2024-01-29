package com.tbz.shop.order;

import com.tbz.shop.IdNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

        public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }
    public Order getOneOrder(Integer id) throws IdNotFoundException {
        return orderRepository.findById(id).orElseThrow(() -> new IdNotFoundException("ID "+ id +" not found"));
    }
}
