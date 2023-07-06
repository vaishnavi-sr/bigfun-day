package org.launchcode.bigfunday.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
//    @GetMapping
//    @ResponseBody
//    public String hello() {
//        return "Hello, have a nice day!";
//    }

    // Handles requests of the form /hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello, " + name + "!. Hello, Are you having a big fun day "+ name + "?. Goodbye, Have a really big fun day!";
    }

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

    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("form")
    public String helloForm() {
        return "form";
    }
}
