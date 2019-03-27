package com.ch.webservicetest.controller;

import com.ch.webservicetest.pojo.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author ch
 * @data 2019/3/27 - 8:57
 */

@RestController
public class GetController {

    @RequestMapping(value = "/hello/{id}/{name}",method = RequestMethod.GET)
    public String sayHello(@PathVariable("id") Integer id,@PathVariable("name") String name){
        return "id:"+id+" name:"+name;
    }

    @PostMapping(value = "testpost")
    public String postRequest(@RequestParam String name,@RequestParam String password){
        System.out.println(name +":"+ password);
        return name +":"+ password;
    }

    @PostMapping("register")
    public String registerUser(@RequestBody User user){
        return user.toString();
    }
}
