package com.example.swaggertest.Controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/vibe}")
@CrossOrigin
public class DemoMainController {

    @RequestMapping(value = "/getdemodata/{serviceref}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public String getdemodata(@PathVariable String serviceref,@RequestParam(name = "appid") String appid, @RequestParam(name = "userid") String userid){
        String uri = "http://localhost:8080/demodata/"+serviceref+"?appid="+appid +"&userid=" + userid;
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class,RequestMethod.GET);
        return result;
    }
}
