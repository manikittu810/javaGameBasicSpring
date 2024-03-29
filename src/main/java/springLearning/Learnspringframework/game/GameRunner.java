package springLearning.Learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
@Component

public class GameRunner {
   private GamingConsole game;
    public GameRunner(@Qualifier("SuperContraGameQualifier") GamingConsole game)
    {
        this.game=game;
    }

    public void run() {
        System.out.println("Running the game :........" + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}

