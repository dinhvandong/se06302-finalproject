package com.btec.ecommerce_online.repositories;

import com.btec.ecommerce_online.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    // Custom query methods (optional)
    User findByEmail(String email);
    boolean existsByEmail(String email);
}