package inhatc.cse.first_spring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private GamingConsole game;

    // @Qualifier가 @Primary 보다 우선순위가 높다!!
    public GameRunner(@Qualifier("PackManGameQualifier") GamingConsole game) {
        super();
        this.game = game;
    }

    public void run() {
        System.out.println("Running game : " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }


}
