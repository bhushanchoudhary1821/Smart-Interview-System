package com.smartinterview.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.smartinterview.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}