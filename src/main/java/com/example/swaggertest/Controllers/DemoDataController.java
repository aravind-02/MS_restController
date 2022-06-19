package com.example.swaggertest.Controllers;

import com.example.swaggertest.Repositories.DashboardRepository;
import com.example.swaggertest.Repositories.TradeBookingRepository;
import com.example.swaggertest.Repositories.WireTradeRepository;
import com.example.swaggertest.models.DashboardView;
import com.example.swaggertest.models.TradeBooking;
import com.example.swaggertest.models.WireTrade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demodata")
public class DemoDataController {
    @Autowired
    private TradeBookingRepository tradeBookingRepository;
    @Autowired
    private DashboardRepository dashboardRepository;
    @Autowired
    private WireTradeRepository wireTradeRepository;

    @GetMapping("/tradebookings")
    public TradeBooking getTradeBooking(@RequestParam(name = "appid") String appid, @RequestParam(name = "userid") String userid){
        return tradeBookingRepository.findByUserid(userid).orElse(tradeBookingRepository.findByUserid("default").orElse(null));
    }
    @GetMapping("/wiretrade")
    public WireTrade getWireTrade(@RequestParam(name = "appid") String appid, @RequestParam(name = "userid") String userid){
        return wireTradeRepository.findByUserid(userid).orElse(wireTradeRepository.findByUserid("default").orElse(null));
    }
    @GetMapping("/dashboard")
    public DashboardView getDashboardView(@RequestParam(name = "appid") String appid, @RequestParam(name = "userid") String userid){
        return dashboardRepository.findByUserid(userid).orElse(dashboardRepository.findByUserid("default").orElse(null));
    }
    @PostMapping("/puttrade")
    public TradeBooking putTradeBooking(@RequestBody TradeBooking trade){
        return tradeBookingRepository.save(trade);
    }
    @PostMapping("/putwiredtrade")
    public WireTrade putWiredTrade(@RequestBody WireTrade wire){
        return  wireTradeRepository.save(wire);
    }
    @PostMapping("/putdashboard")
    public DashboardView putDashboardView(@RequestBody DashboardView dash){
        return dashboardRepository.save(dash);
    }
}
