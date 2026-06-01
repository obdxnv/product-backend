package com.ulmo.backend.repository;

import com.ulmo.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository
        extends JpaRepository<User, Long> {
}