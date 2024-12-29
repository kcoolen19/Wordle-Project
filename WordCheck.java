import java.util.Random;

public class WordCheck {
    public static final String GREEN_BACKGROUND = "\u001B[42m";
    public static final String YELLOW_BACKGROUND = "\u001B[43m";
    public static final String GREY_BACKGROUND = "\u001B[47m";
    public static final String RESET_BACKGROUND = "\u001B[0m";
    public static final int WORD_LENGTH = 5;

    public String checkWord(String guess, String target, WordleList wordleList) {
        StringBuilder checkWord = new StringBuilder();
        for (int i = 0; i < WORD_LENGTH; i++) {
            if (guess.charAt(i) == target.charAt(i)) {
                checkWord.append(GREEN_BACKGROUND).append(guess.charAt(i)).append(RESET_BACKGROUND);
            } 
            else if (wrongPosition(guess.charAt(i),i,target)) {
                checkWord.append(YELLOW_BACKGROUND).append(guess.charAt(i)).append(RESET_BACKGROUND);   
            }
            else {
                checkWord.append(GREY_BACKGROUND).append(guess.charAt(i)).append(RESET_BACKGROUND);
            }
        }
        return checkWord.toString();
    }

    public boolean wrongPosition(char currentLetter, int currentIndex, String target) {
        for (int i = 0; i < target.length(); i++) {
            if (currentLetter == target.charAt(i) && currentIndex != i) {
                return true;
            }
        }
        return false;
    }

    public String getAnswer(WordleList wordleList) {
        Random random = new Random();
        int randomIndex = random.nextInt(wordleList.getWords().length);
        String correctWord = wordleList.getWords()[randomIndex];
        return correctWord;
    }
}
