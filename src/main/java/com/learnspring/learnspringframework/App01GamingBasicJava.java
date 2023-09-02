package com.learnspring.learnspringframework;

import com.learnspring.learnspringframework.game.GameRunner;
import com.learnspring.learnspringframework.game.PacmanGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        //var marioGame = new MarioGame();// ctrl+1 will give option to create class.sub package: game;
        var game = new PacmanGame(); //MarioGame(); //SuperContraGame();

        var gameRunner = new GameRunner(game);//package: game
        //object creation + wiring of dependencies
        //game is a dependency of gamerunner
        gameRunner.run();//ctrl+1
    }
}
