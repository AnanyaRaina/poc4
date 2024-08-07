package com.javaspring.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javaspring.Entity.User;

public interface UserRepository extends MongoRepository<User, Long> {

}
