package com.example.java_pr10.Beans;

import org.springframework.stereotype.Component;

@Component("Middle")
public class Middle implements Programmer{
    @Override
    public void doCoding() {
        System.out.println("Middle");
    }
}
