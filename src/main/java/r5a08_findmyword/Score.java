package r5a08_findmyword;

public class Score {
    private final String word;
    private final Letter[] results;

    public Score(String word) {
        this.word = word;
        this.results = new Letter[word.length()];
    }

    public void assess(String attempt) {
        for (int i = 0; i < word.length(); i++) {
            char correctLetter = word.charAt(i);
            char attemptLetter = attempt.charAt(i);

            if (correctLetter == attemptLetter) {
                results[i] = Letter.CORRECT;
            } else if (word.indexOf(attemptLetter) != -1) {
                results[i] = Letter.PART_CORRECT;
            } else {
                results[i] = Letter.INCORRECT;
            }
        }
    }

    public Letter letter(int index) {
        return results[index];
    }
}
