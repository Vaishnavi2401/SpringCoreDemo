package com.demo.services;

public class Java implements ICourse {

    public Java(){
        System.out.println("Java Constructor Called");
    }

    @Override
    public boolean getTheCourse(Double amount) {
        System.out.println("Java course is enrolled successfully with amount " + amount);
        return true;
    }
    
}
