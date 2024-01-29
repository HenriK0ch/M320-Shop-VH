package com.tbz.shop.order.payment.prepaidcard;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
@EnableJpaRepositories
@Repository
public interface PrepaidCardRepository extends JpaRepository<PrepaidCard, Integer> {
}
