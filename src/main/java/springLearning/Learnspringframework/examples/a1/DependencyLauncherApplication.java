package springLearning.Learnspringframework.examples.a1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("springLearning.Learnspringframework.game")
public class DependencyLauncherApplication {
    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {

//            context.getBean(GamingConsole.class).up();
//            context.getBean(GameRunner.class).run();
        }

    }
}
