package com.example.swaggertest.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
public class User {
    @Id
    private  String id;
    private String name;
    private String email;
    private String password;

    public User() {

    }
}
