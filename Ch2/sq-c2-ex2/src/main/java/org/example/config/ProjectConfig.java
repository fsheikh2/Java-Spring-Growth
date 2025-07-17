package org.example.config;

import org.example.main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    @Primary
    Parrot parrot() {
        var p = new Parrot("Miki");
        return p;
    }

    @Bean
    Parrot parrot1(){
        var p = new Parrot("Koko");
        return p;
    }
    @Bean
    Parrot parrot2(){
        var p = new Parrot("Kiki");
        return p;
    }

    @Bean
    Parrot parrot3(){
        var p = new Parrot("Riki");
        return p;
    }

    @Bean
    String hello(){
        return "hello";
    }

    @Bean
    Integer ten(){
        return 10;
    }
}
