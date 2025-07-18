package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
* The purpose of this example is to show how to autowire a bean while using stereotype annotations.
* We've marked Person and Parrot as components for the spring context and used @Autowired on the Parrot
* field in the Person class. This tells Spring to provide the Person bean with a Parrot bean from the
* context.
* */

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person p = context.getBean(Person.class);

        System.out.println("Person's name: " + p.getName());
        System.out.println("Person's parrot: " + p.getParrot());
    }
}