package com.cybertek.controller;

import com.cybertek.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/register")
    public String showForm(Model model){

        model.addAttribute("mentor", new Mentor());

        List<String> batchList = Arrays.asList("B7","B8","B9","B10","B11","B12","B13","B14","B15");
        model.addAttribute("batchList",batchList);

        return "mentor/mentor-register";
    }

    @PostMapping("/confirm")
    public String submitForm(){
        return "mentor/mentor-confirmation";
    }


//    Mentor mentor = new Mentor("Michael", "Remerscheid", "michael.remerscheid@email.com",
//            "MALE", false,"B15","monkey co.");




}
