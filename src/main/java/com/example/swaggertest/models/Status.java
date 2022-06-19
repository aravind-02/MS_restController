package com.example.swaggertest.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Status")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Status {
    private String appName;
    @Id
    private String uid;
    private Boolean isDemoOn;
}
