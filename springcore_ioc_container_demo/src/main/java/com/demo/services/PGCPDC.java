package com.demo.services;

public class PGCPDC {

    private ICourse course;

    public PGCPDC(ICourse course){
        System.out.println("Constructor Injection");
        this.course = course;
    }

    public PGCPDC(){
        System.out.println("PGCPDC Bean created");
    }

    public void setCourse(ICourse course) {
        this.course = course;
    }

    public boolean buyTheCourse(Double amount){
        return course.getTheCourse(amount);
    }
    
}
