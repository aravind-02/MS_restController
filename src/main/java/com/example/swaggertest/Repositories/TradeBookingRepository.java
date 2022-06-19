package com.example.swaggertest.Repositories;

import com.example.swaggertest.models.TradeBooking;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TradeBookingRepository extends MongoRepository<TradeBooking,String> {
    public Optional<TradeBooking> findByUserid(String userid);
}
