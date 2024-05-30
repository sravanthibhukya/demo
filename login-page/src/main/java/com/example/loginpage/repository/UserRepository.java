package com.example.loginpage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.loginpage.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
