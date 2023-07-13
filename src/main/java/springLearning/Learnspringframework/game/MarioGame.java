package springLearning.Learnspringframework.game;

public class MarioGame implements GamingConsole {
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("Go into a hole");
    }
    public void right(){
        System.out.println("run front");
    }
    public void left(){
        System.out.println("run back");
    }
}
