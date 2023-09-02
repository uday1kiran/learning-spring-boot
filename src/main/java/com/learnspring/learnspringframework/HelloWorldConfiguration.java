package com.learnspring.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person(String name,int age){
//setter and getter automatically created
};

record Address(String firstLine,String city){
//setter and getter automatically created
};
@Configuration
public class HelloWorldConfiguration {
    //we can define beans inside this Configuration class
    @Bean
    public String name(){
        return "User1";
    }

    @Bean
    public int age(){
        return 15;
    }

    @Bean
    public Person person(){
        return new Person("Ravi",20);
    }

    @Bean
    public Address address(){
        return new Address("Baker Street","London");
    }
}
