package com.demo.services;

public class SpringBoot implements ICourse {

    public SpringBoot(){
        System.out.println("SpringBoot Constructor called");
    }

    @Override
    public boolean getTheCourse(Double amount) {
         System.out.println("SpringBoot course is enrolled successfully with amount " + amount);
        return true;
    }
    
}
