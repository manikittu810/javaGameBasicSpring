package springLearning.Learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springLearning.Learnspringframework.game.GameRunner;
import springLearning.Learnspringframework.game.GamingConsole;
import springLearning.Learnspringframework.game.Pacman;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game(){
        var game = new Pacman();
        return game;
    }
    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
}
