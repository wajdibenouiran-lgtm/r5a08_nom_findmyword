package r5a08_findmyword;

public class Word {
    private String word;

    public Word() {}

    public Word(String word) {
        this.word = word;
    }

    public Score guess(String attempt) {
        Score score = new Score(word);
        score.assess(attempt);
        return score;
    }
}
