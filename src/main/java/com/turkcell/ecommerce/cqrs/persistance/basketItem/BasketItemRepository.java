package com.turkcell.ecommerce.cqrs.persistance.basketItem;

import com.turkcell.ecommerce.cqrs.domain.entity.BasketItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BasketItemRepository extends JpaRepository<BasketItem, UUID> {
}
