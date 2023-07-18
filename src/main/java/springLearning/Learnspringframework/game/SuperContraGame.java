package springLearning.Learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole{

        public void up(){
            System.out.println("up");
        }
        public void down(){
            System.out.println("Go down");
        }
        public void right(){
            System.out.println("shoot right");
        }
        public void left(){
            System.out.println("shoot left");
        }
}
