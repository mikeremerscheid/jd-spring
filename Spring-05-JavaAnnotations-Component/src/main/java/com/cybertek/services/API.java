package com.cybertek.services;

import com.cybertek.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class API  implements Course {

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: 10");
    }

    public void myInitMethod(){
        System.out.println("Executing init method.");
    }

    public void myDestroyMethod(){
        System.out.println("Executing destroy method");    }
}
