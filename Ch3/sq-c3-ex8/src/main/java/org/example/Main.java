package org.example;

import beans.Person;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
* The purpose of this example is to show another way to choose between multiple beans that is a dependency
* for another bean. Similar to the difference between examples 6 and 7, instead of using the name of the
* bean as the parameter in the constructor, we can use the @Qualifier annotation instead.
* */

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person p = context.getBean(Person.class);
        System.out.println("Person name: " + p.getName());
        System.out.println("Parrot name: " + p.getParrot());
    }
}