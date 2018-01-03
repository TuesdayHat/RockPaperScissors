import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

    @Test
    public void runRockPaperScissors_returnsPaperBeatsRock_true() throws Exception {
        models.RockPaperScissors testRockPaperScissors = new models.RockPaperScissors();
        Boolean expected = true;
        assertEquals(expected, testRockPaperScissors.runRockPaperScissors("Paper", "Rock"));
    }
}
