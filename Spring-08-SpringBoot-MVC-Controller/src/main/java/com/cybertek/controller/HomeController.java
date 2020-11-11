package com.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping
    public String getRequestMapping(){

        return "home";
    }

    @GetMapping("/mike")
    public String getRequestMapping2(){

        return "nothome";
    }
    @GetMapping("/moogii")
    public String getRequestMapping3(){

        return "work";
    }

    @PostMapping
    public String postMapping(){
        return "home";
    }

    @GetMapping("/home/{name}/{email}")
    public String pathVariable(@PathVariable("name") String name, @PathVariable("email") String email){
        System.out.println("name is: " + name   );
        System.out.println("email is: " + email   );

        return "home";
    }

    @GetMapping("/home/course")
    public String requestParamEx(@RequestParam("course") String course){
        System.out.println("name is: " + course);
        return "home";
    }

    @GetMapping(value="/course")
    public String requestParam2(@RequestParam(value = "name", required = false, defaultValue= "Cybertek") String name){
        System.out.println("name is: " + name);
        return "home";
    }



}
