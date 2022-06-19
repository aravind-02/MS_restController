package com.example.swaggertest.Repositories;

import com.example.swaggertest.models.Status;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends MongoRepository<Status,String> {
    public Status findByUidAndAppName(String uid,String appname);
}
