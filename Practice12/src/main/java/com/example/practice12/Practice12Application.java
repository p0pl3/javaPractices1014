package com.example.practice12;

import com.example.practice12.components.HashCoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Practice12Application implements CommandLineRunner {

    @Autowired
    private HashCoder coder;

    public static void main(String[] args) {
        SpringApplication.run(Practice12Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        coder.run(args[0], args[1]);

    }
}
