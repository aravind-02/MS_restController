package com.example.swaggertest.Repositories;

import com.example.swaggertest.models.DashboardView;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DashboardRepository extends MongoRepository<DashboardView,String> {
    public Optional<DashboardView> findByUserid(String userid);
}
