package com.example.swaggertest.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "WireTrade")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WireTrade {
    @Id
    private String serviceid;
    private String appid;
    private String userid;
    private String WireTradeName;
    private LocalDateTime createdTime;
}
