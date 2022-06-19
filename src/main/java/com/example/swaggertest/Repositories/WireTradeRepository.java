package com.example.swaggertest.Repositories;

import com.example.swaggertest.models.WireTrade;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WireTradeRepository extends MongoRepository<WireTrade,String> {
    public Optional<WireTrade> findByUserid(String userid);
}
