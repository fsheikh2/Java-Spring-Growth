package config;

import beans.Parrot;
import beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot1(){
        Parrot parrot = new Parrot();
        parrot.setName("Koko");
        return parrot;
    }

    @Bean
    public Parrot parrot2(){
        Parrot parrot = new Parrot();
        parrot.setName("Miki");
        return parrot;
    }

    @Bean
    public Person person(Parrot parrot2){
        Person person = new Person(parrot2);
        person.setName("Ella");
        return person;
    }
}
