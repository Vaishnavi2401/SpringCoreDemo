package com.demo;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.demo.services.PGCPDC;

public class BeanFactoryDemo {

    public static void main(String[] args) {

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);

        reader.loadBeanDefinitions("applicationconfig.xml");
        PGCPDC p = beanFactory.getBean(PGCPDC.class);

        Boolean status = p.buyTheCourse(2500.0);
         if (status) {

            System.out.println("Course enrolled successfully");
            
        } else{
            System.out.println("Failed to buy the course");
        }

    }
    
}
