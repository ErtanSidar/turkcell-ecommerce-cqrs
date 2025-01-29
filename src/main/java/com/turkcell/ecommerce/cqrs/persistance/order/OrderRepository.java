package com.turkcell.ecommerce.cqrs.persistance.order;

import com.turkcell.ecommerce.cqrs.domain.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {
}
