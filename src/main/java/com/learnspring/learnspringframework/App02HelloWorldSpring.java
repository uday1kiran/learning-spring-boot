package com.learnspring.learnspringframework;

import com.learnspring.learnspringframework.game.GameRunner;
import com.learnspring.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        //1: Launch a Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        //2: Configure the things that we want Spring to manage
        //HellowWorldConfiguration -  @Configuration
        //Bean - name

        System.out.println(context.getBean("name"));//the method name in context class
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address"));
    }
}
