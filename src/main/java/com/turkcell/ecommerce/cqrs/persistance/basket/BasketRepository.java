package com.turkcell.ecommerce.cqrs.persistance.basket;

import com.turkcell.ecommerce.cqrs.domain.entity.Basket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BasketRepository extends JpaRepository<Basket, UUID> {
}
