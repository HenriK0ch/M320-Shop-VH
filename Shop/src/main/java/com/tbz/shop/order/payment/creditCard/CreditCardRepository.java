package com.tbz.shop.order.payment.creditcard;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
@EnableJpaRepositories
@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard, Integer> {
}
