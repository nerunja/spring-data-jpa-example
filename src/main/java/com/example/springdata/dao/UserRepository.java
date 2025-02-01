package com.example.springdata.dao;

import com.example.springdata.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query methods can be added here
    Optional<User> findByEmail(String email);
}