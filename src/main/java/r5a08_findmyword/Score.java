package r5a08_findmyword;

public class Score {
    private String word;
    private Letter result;
    private Letter[] results;
    private int position;

    public Score(){
    }

    public Score(String word){

        this.word = word;
        this.position = 0;
        this.results = new Letter[word.length()];
    }

    public void assess(String attempt) {
        for (position = 0; position < word.length(); position++) {
            char correctLetter = word.charAt(position);
            char attemptLetter = attempt.charAt(position);

            if (correctLetter == attemptLetter) {
                results[position] = Letter.CORRECT;
            } else if (word.indexOf(attemptLetter) != -1) {
                results[position] = Letter.PART_CORRECT;
            } else {
                results[position] = Letter.INCORRECT;
            }
        }
    }


    private void evaluateLetter(int index, String attempt) {
        if (word.charAt(index) == attempt.charAt(index)) {
            result = Letter.CORRECT;
        } else {
            result = Letter.INCORRECT;
        }
    }

    public Letter letter(int i) {
        return results[i];
    }


}