class Scratch {
    public static void main(String[] args) {
        System.out.println(wordScore("train"));
    }
    static int HAND_SIZE = 10;
    static final int[] SCRABBLE_LETTER_VALUES = { 1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3,
            1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10 };


    public static int wordScore(String word) {
        //// Replace the following statement with your code
        int score = 0;
        for (int i = 0; i < word.length(); i++) {
            int wordIndex = (int) (word.charAt(i) - 'a');
            score += SCRABBLE_LETTER_VALUES[wordIndex];
        }
        score *= word.length();
        if (MyString.subsetOf("runi", word))
            score += 1000;
        if (word.length() == HAND_SIZE)
            score += 50;

        return score;
    }
}