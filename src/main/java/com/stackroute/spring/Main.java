package com.stackroute.spring;

import com.stackroute.spring.beans.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {


        ApplicationContext applicationContext3=new ClassPathXmlApplicationContext("beans.xml");

        Movie movie=(Movie)applicationContext3.getBean("movie4");

        System.out.println(movie.toString());


    }
}