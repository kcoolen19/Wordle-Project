import java.util.Random;

public class WordCheck {
    public static final String GREEN_BACKGROUND = "\u001B[42m";
    public static final String RED_BACKGROUND = "\u001B[41m";
    public static final String RESET_BACKGROUND = "\u001B[0m";
    public static final int WORD_LENGTH = 5;

    public String checkWord(String guess, String target) {
        StringBuilder checkWord = new StringBuilder();
        for (int i = 0; i < WORD_LENGTH; i++) {
            if (guess.charAt(i) == target.charAt(i)) {
                checkWord.append(GREEN_BACKGROUND).append(guess.charAt(i)).append(RESET_BACKGROUND);
            } else {
                checkWord.append(RED_BACKGROUND).append(guess.charAt(i)).append(RESET_BACKGROUND);
            }
        }
        return checkWord.toString();
    }

    public String getAnswer(WordleList wordleList) {
        Random random = new Random();
        int randomIndex = random.nextInt(wordleList.getWords().length);
        String correctWord = wordleList.getWords()[randomIndex];
        return correctWord;
    }
}
