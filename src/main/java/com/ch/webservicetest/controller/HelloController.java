package com.ch.webservicetest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ch
 * @data 2019/3/20 - 22:09
 */

@RestController
public class HelloController {


    //@Value("${person.lastName}")
    @Value("${person.last-name}")
    private String name;

    @RequestMapping("hello")
    public String hello(){
        return "Hello "+name;
    }
}
