package com.example.java_pr10.Beans;

import org.springframework.stereotype.Component;

@Component("Senior")
public class Senior implements Programmer{
    @Override
    public void doCoding() {
        System.out.println("Senior");
    }
}
