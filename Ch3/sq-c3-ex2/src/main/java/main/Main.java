package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
* The purpose of this example is to show how to use an @Bean method to wire one bean in the Spring context
* to the field of another bean in the context that needs it. Here we have two beans in the context, a Person
* and a Parrot, with the person having a parrot. The person's parrot is the same parrot bean that's in the context.
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