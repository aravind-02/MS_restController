package com.example.swaggertest.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "TradeBooking")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TradeBooking {
    @Id
    private String serviceid;
    private String appid;
    private String userid;
    private String tradename;
//    private List<String> tradeslots;
    private LocalDateTime createdtime;
}
