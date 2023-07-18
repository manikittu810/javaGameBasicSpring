package springLearning.Learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component  //Every time here in this program the auto wiring is happening through constructor injection
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
