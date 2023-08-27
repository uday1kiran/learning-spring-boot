package com.learnspring.learnspringframework;

import com.learnspring.learnspringframework.game.GameRunner;
import com.learnspring.learnspringframework.game.MarioGame;
import com.learnspring.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        //var marioGame = new MarioGame();// ctrl+1 will give option to create class.sub package: game;
        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(superContraGame);//package: game
        gameRunner.run();//ctrl+1
    }
}
