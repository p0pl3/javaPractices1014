package com.example.java_pr10.Beans;

import org.springframework.stereotype.Component;

@Component("Junior")
public class Junior implements Programmer {
    @Override
    public void doCoding() {
        System.out.println("Junior");
    }
}
