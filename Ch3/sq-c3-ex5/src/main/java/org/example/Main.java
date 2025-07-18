package org.example;

import beans.Person;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
* The purpose of this example is to show another way to autowire beans while using stereotype annotations.
* Like in ex4, both Person and Parrot are marked as components of the spring context, so an instance of each
* is added to the context. Here, the Person class has a constructor which takes a Parrot as a parameter and
* that constructor is marked with @AutoWired. This tells Spring to provide a value for that parameter from
* its context when the person bean is made.
*
* This is an example of constructor injection.
* */
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person p = context.getBean(Person.class);

        System.out.println("Person's name: " + p.getName());
        System.out.println("Person's parrot: " + p.getParrot());
    }
}