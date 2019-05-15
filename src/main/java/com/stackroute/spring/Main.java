package com.stackroute.spring;


import com.stackroute.spring.beans.Actor;

import com.stackroute.spring.beans.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = (Movie) context.getBean("movie");

        Movie movie1 = (Movie) context.getBean("movie1");

        System.out.println(movie == movie1); // singleton scope (default) returns true, 'prototype' returns false


        System.out.println(movie.welcomeMsg() + "\nMovie name : " + movie.getMovieName() + "\nActor Name : " + movie.getActorNAme() + "\nGenre : " + movie.getGenre());

        System.out.println(movie1.welcomeMsg() + "\nMovie name : " + movie1.getMovieName() + "\nActor Name : " + movie1.getActorNAme() + "\nGenre : " + movie1.getGenre());

        Actor actor = (Actor) context.getBean("actor");


        //System.out.println(movie == movie1); // singleton scope (default) returns true, 'prototype' returns false


        System.out.println(actor.welcomeMsg() + "\nActor name : " + actor.getActorName() + "\nGender : " + actor.getGender() + "\nAge : " + actor.getAge());

    }


}
