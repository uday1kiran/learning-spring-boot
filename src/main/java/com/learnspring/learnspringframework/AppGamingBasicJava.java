package com.learnspring.learnspringframework;

import com.learnspring.learnspringframework.game.GameRunner;
import com.learnspring.learnspringframework.game.MarioGame;
import org.springframework.boot.SpringApplication;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var marioGame = new MarioGame();// ctrl+1 will give option to create class.sub package: game;
        var gameRunner = new GameRunner(marioGame);//package: game
        gameRunner.run();//ctrl+1
    }
}
