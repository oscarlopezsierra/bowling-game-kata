package es.ricoperez.bowlinggamekata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    Game game;

    @BeforeEach
    public void setUp() {
        game = new Game();
    }

    @Test
    public void theScoreShouldBeZeroBeforeAnyRoll() {
        assertThat(game.score()).isEqualTo(0);
    }

    @Test
    public void theScoreShouldBeZeroAfterAllGutterRolls() {
        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }
        assertThat(game.score()).isEqualTo(0);
    }

}
