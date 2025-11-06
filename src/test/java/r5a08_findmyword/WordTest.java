package r5a08_findmyword;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordTest {

    @Test
    public void should_check_one_incorrect_letter() {
        Word word = new Word("E");
        Score score = word.guess("B");

        assertLetterEquals(Letter.INCORRECT, score, 0);
    }

    @Test
    public void should_check_one_correct_letter() {
        Word word = new Word("E");
        Score score = word.guess("E");

        assertLetterEquals(Letter.CORRECT, score, 0);
    }

    @Test
    public void should_check_multiple_letters() {
        Word word = new Word("TEST");
        Score score = word.guess("TOTO");

        Assertions.assertEquals(Letter.CORRECT, score.letter(0));
        Assertions.assertEquals(Letter.INCORRECT, score.letter(1));
        Assertions.assertEquals(Letter.PART_CORRECT, score.letter(2));
        Assertions.assertEquals(Letter.INCORRECT, score.letter(3));
    }

    private void assertLetterEquals(Letter expected, Score score, int index) {
        Letter actual = score.letter(index);
        Assertions.assertEquals(expected, actual);
    }
}
