package org.launchcode.bigfunday.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
//    @GetMapping
//    @ResponseBody
//    public String hello() {
//        return "Hello, have a nice day!";
//    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye() {
        return "Goodbye, Have a really big fun day!";
    }

    @GetMapping("hello") //lives @ /hello?name=LaunchCode
    @ResponseBody
    public String helloQuery(@RequestParam String name){
        return "Hello, Are you having a big fun day "+ name + "?";
    }
}
