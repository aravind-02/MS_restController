package com.example.swaggertest.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "DashboardView")
@NoArgsConstructor
@AllArgsConstructor
public class DashboardView {
    @Id
    private String serviceid;
    private String appid;
    private String userid;
    private String dashboardname;
    private LocalDateTime createdtime;
}
