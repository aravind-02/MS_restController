package com.example.swaggertest.Controllers;


import com.example.swaggertest.Repositories.StatusRepository;
import com.example.swaggertest.Repositories.UserRepository;
import com.example.swaggertest.models.Status;
import com.example.swaggertest.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/status")
@CrossOrigin
public class StatusController {
    @Autowired
    private StatusRepository statusRepository;
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/putstatus")
    public Status PutStatus(@RequestBody Status status){
        return statusRepository.save(status);
    }
    @GetMapping("/getstatus")
    public Status GetStatus(@RequestParam(name = "appid") String appid, @RequestParam(name = "userid") String userid){
        System.out.println(appid);
        System.out.println(userid);
        Status status = statusRepository.findByUidAndAppName(userid,appid);

        User user =  userRepository.findByName(appid);
        return status;
    }
    @GetMapping("/getstatus/all")
    public List<Status> GetAllStatus(){
        return statusRepository.findAll();
    }
}
