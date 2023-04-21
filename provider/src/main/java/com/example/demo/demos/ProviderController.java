package com.example.demo.demos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @功能：
 * @作者：H
 * @date： 2023-4-21
 */

@RestController
public class ProviderController {

    Logger logger= LoggerFactory.getLogger(ProviderController.class);


    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String hi(@RequestParam(value = "name",defaultValue = "forezp",required = false)String name){

        return "hello " + name + ", i'm provider ,my port:" + port;
    }
}
