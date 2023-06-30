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

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            game.roll(pins);
        }
    }

    @Test
    public void theScoreShouldBeZeroBeforeAnyRoll() {
        assertThat(game.score()).isEqualTo(0);
    }

    @Test
    public void theScoreShouldBeZeroAfterAllGutterRolls() {
        rollMany(20, 0);
        assertThat(game.score()).isEqualTo(0);
    }

    @Test
    public void theScoreShouldBeTwentyAfterAllOnes() {
        rollMany(20, 1);
        assertThat(game.score()).isEqualTo(20);
    }

}
