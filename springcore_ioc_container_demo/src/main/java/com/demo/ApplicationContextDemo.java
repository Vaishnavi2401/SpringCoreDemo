package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.services.PGCPDC;

public class ApplicationContextDemo {
    public static void main(String[] args) {
        // System.out.println("Hello world!");

        ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
        PGCPDC p = container.getBean(PGCPDC.class);

        boolean status = p.buyTheCourse(2500.00);

        if (status) {

            System.out.println("Course enrolled successfully");
            
        } else{
            System.out.println("Failed to buy the course");
        }
    }
}