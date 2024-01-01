package com.shortifyMe.shortifyMe.repository;

import com.shortifyMe.shortifyMe.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
