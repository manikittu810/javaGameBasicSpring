package springLearning.Learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springLearning.Learnspringframework.game.GameRunner;
import springLearning.Learnspringframework.game.GamingConsole;
import springLearning.Learnspringframework.game.Pacman;

public class App3GamingSpringBeans {
    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext(GamingConfiguration.class)) {

            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }

    }
}
