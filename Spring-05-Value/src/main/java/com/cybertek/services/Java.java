package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Java implements Course {
    @Value("JD1")
    private String batch;
    @Value("${instructor}")
    private String instructor;
    @Value("${days}")
    private String[] days;

//    @Autowired
//    @Qualifier("officeHours")


    @Override
    public String toString() {
        return "Java{" +
                "batch='" + batch + '\'' +
                ", instructor='" + instructor + '\'' +
                ", days=" + Arrays.toString(days) +
                '}';
    }

    @Autowired
    private OfficeHours officeHours;

    @Autowired
    public Java(@Qualifier("officeHours") ExtraSessions extraSessions) {
        this.officeHours = officeHours;
    }

    @Override
    public void getTeachingHours(){
        System.out.println("Weekly teaching hours: " + (20+ officeHours.getHours()));
    }
}