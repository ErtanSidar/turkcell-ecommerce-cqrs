package com.turkcell.ecommerce.cqrs.persistance.category;

import com.turkcell.ecommerce.cqrs.domain.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {

}
