package r5a08_findmyword;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordTest {

    @Test
    void should_check_one_correct_letter() {
        Word word = new Word("A");
        Score score = word.guess("A");
        Letter expected = Letter.CORRECT;
        Letter actual = score.letter(0);

        assertEquals(expected, actual);
    }
}
