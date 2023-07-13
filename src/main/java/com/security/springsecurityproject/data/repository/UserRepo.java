package com.security.springsecurityproject.data.repository;

import com.security.springsecurityproject.data.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepo extends MongoRepository<User, Long> {
    Optional<User> findUserByEmailIgnoreCase(String email);
    boolean existsUserByEmailIgnoreCase(String email);
}
