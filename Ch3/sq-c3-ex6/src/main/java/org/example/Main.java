package org.example;

import beans.Person;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
* The purpose of this exercise is to show how to wire a bean when we have multiple beans of the needed
* type.
* */
public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person p = context.getBean(Person.class);
        System.out.println("Person name: " + p.getName());
        System.out.println("Parrot name: " + p.getParrot());
    }
}