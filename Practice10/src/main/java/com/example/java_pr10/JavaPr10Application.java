package com.example.java_pr10;

import com.example.java_pr10.Beans.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class JavaPr10Application {

    public static void main(String[] args) {
        SpringApplication.run(JavaPr10Application.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Programmer programmer = context.getBean(Junior.class);
        programmer.doCoding();

        programmer = context.getBean(Middle.class);
        programmer.doCoding();

        programmer = context.getBean(Senior.class);
        programmer.doCoding();

    }

}
