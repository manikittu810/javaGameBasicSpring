package springLearning.Learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springLearning.Learnspringframework.game.GameRunner;
import springLearning.Learnspringframework.game.GamingConsole;

@Configuration
@ComponentScan("springLearning.Learnspringframework.game")
public  class GamingAppLauncherApplication {
    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {

            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }

    }
}



