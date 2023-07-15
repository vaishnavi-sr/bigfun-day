package org.launchcode.bigfunday.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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

//    @GetMapping("fun-list")
//    public String funList(Model model){
//        List<String> names = new ArrayList<>();
//        names.add("Great day!");
//        names.add("Super day!");
//        names.add("Fantastic day!");
//        model.addAttribute("names",names);
//        return "funList";

    @GetMapping("num-list")
    public String numList(Model model){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        model.addAttribute("numbers",numbers);
        return "numberList";
        }
}
