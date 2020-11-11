package com.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping
    public String getRequestMapping(){

        return "home";
    }

    @RequestMapping("/mike")
    public String getRequestMapping2(){

        return "nothome";
    }
    @RequestMapping("/moogii")
    public String getRequestMapping3(){

        return "work";
    }

}