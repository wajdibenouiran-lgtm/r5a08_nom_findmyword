package r5a08_findmyword;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class WordTest {
    @Test
    public void should_check_one_incorrect_letter(){
        // Arrange
        Word word = new Word("E");

        // Act
        Score score = word.guess("B");

        // Assert
        assertLetterEquals(Letter.INCORRECT, score, 0);
    }

    @Test
    public void should_check_one_correct_letter(){
        Word word = new Word("E");

        Score score = word.guess("E");

        assertLetterEquals(Letter.CORRECT, score, 0);
    }

    private void assertLetterEquals(Letter expected, Score score, int index) {
        Letter actual = score.letter(index);
        Assertions.assertEquals(expected, actual);
    }

}

