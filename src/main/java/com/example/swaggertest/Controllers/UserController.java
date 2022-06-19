package com.example.swaggertest.Controllers;

import com.example.swaggertest.Repositories.UserRepository;
import com.example.swaggertest.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public List<User> GetUsers(){

        return userRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
        public User GetUser(@PathVariable String id){
         System.out.println(id);
          return userRepository.findById(id).orElse(null);
//        User user = userRepository.findById(id).orElse(null);
//        String s = "&userid=" + user.getName();
//        String uri = "http://localhost:8080/status/getstatus?appid="+user.getEmail() +s;
//        RestTemplate restTemplate = new RestTemplate();
//        String result = restTemplate.getForObject(uri, String.class,RequestMethod.GET);
//        return result;
    }

    @GetMapping(value = "/{email}/{name}",produces = MediaType.APPLICATION_JSON_VALUE)
    public String GetUser(@PathVariable String email,@PathVariable String name){
//        User user =  userRepository.findByEmailAndName(email, name);
//        String id = user.getId();
//        System.out.println(id);
        String uri = "http://localhost:8080/status/getstatus?appid="+email +"&userid=" + name;
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class,RequestMethod.GET);
        return result;
    }

    @PostMapping("/")
    public User PostUser(@RequestBody User user){
        return userRepository.save(user);
    }
    @PutMapping("/")
    public User putUser(@RequestBody User user){
        User olduser = userRepository.findById(user.getId()).orElse(null);
        olduser.setName(user.getName());
        olduser.setEmail(user.getEmail());
        olduser.setPassword(user.getPassword());
        return userRepository.save(olduser);
    }
    @DeleteMapping("/{id}")
    public String DeleteUser(@PathVariable String id){
        userRepository.deleteById(id);
        return id;
    }
}
