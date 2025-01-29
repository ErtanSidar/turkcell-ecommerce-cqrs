package com.turkcell.ecommerce.cqrs.persistance.user;

import com.turkcell.ecommerce.cqrs.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
