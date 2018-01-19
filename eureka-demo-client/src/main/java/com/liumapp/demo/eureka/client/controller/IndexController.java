package com.liumapp.demo.eureka.client.controller;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by liumapp on 1/19/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@RestController
public class IndexController {

//    @Autowired
//    private DiscoveryClient client;

    @RequestMapping("/")
    public String index () {
        return "Hello World";
    }

}
