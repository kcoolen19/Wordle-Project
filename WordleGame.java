import java.util.Random;
import java.util.Scanner;

public class WordleGame {

    private static final int TOTAL_ATTEMPTS = 6;


    public void gameStart() {
        WordCheck wordCheck = new WordCheck();
        WordleList wordleList = new WordleList();
        WordValidator wordValidator = new WordValidator();
        Scanner prompt = new Scanner(System.in);
        int tries = 0;

        while (tries < TOTAL_ATTEMPTS) {
            String guessWord = wordValidator.wordValidator();
            tries++;
        }
    }

    public String getAnswer(WordleList wordleList) {
        Random random = new Random();
        int randomIndex = random.nextInt(wordleList.getWords().length);
        String correctWord = wordleList.getWords()[randomIndex];
        return correctWord;
    }
}
