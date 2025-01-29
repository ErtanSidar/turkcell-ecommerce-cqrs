package com.turkcell.ecommerce.cqrs.persistance.product;

import com.turkcell.ecommerce.cqrs.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}
