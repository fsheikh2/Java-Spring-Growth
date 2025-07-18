package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
* The purpose of this example is to show how we can pass a bean in the spring context through the parameter
* of another @Bean method that creates and adds another bean to the context. In the ProjectConfig class, the
* @Bean method to make a person bean in the context takes a Parrot as a parameter and spring provides that
* parrot from its own context.
* */

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        Parrot parrot = context.getBean(Parrot.class);

        System.out.println("Person's name: " + person.getName());

        System.out.println("Parrot's name: " + parrot.getName());

        System.out.println("Person's parrot: " + person.getParrot());
    }
}