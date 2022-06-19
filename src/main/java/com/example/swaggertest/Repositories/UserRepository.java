package com.example.swaggertest.Repositories;

import com.example.swaggertest.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
    public User findByEmailAndName(String email, String name);
    public User findByName(String name);
    public Optional<User> findById(String id);
}
