package springLearning.Learnspringframework;

import springLearning.Learnspringframework.game.GameRunner;
import springLearning.Learnspringframework.game.Pacman;

public class app01GamingBasicJava {
    public static void main(String[] args) {

//        var game=new MarioGame(); //1: object creation
//        var game=new SuperContraGame();
        var game =new Pacman(); // 1 :
        var gameRunner = new GameRunner(game); //2:object creation + wiring of dependencies.
        //Game dependency of GameRunner, here above we are injecting the game into the GameRunner.

        gameRunner.run();
    }
}
