package com.cybertek.services;

import com.cybertek.interfaces.Course;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : 30");
    }

    public void myInitMethod(){
        System.out.println("Executing init method.");
    }

    public void myDestroyMethod(){
        System.out.println("Executing destroy method");    }
}
