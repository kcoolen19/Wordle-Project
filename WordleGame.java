import java.util.Scanner;

public class WordleGame {

    private static final int TOTAL_ATTEMPTS = 6;
    private static final String WIN_STATEMENT = "You guessed the word correctly!";
    private static final String END_GAME_STATEMENT = "Game over! \nThe correct answer is ";


    public void gameStart() {
        WordCheck wordCheck = new WordCheck(); 
        WordleList wordleList = new WordleList();
        WordValidator wordValidator = new WordValidator();
        Scanner scanner = new Scanner(System.in);
        int tries = 0;
        String correctAnswer = wordCheck.getAnswer(wordleList);
        while (tries < TOTAL_ATTEMPTS) {
            String guessWord = wordValidator.wordValidator(scanner);
            tries++;
            if (guessWord.equalsIgnoreCase(correctAnswer)) {
                System.out.println(WIN_STATEMENT + " " + guessWord);
                break;
            } else {
                System.out.println(wordCheck.checkWord(guessWord, correctAnswer));
            }
        }
        if (tries == TOTAL_ATTEMPTS) {
            System.out.println(END_GAME_STATEMENT + correctAnswer);
        }
        scanner.close();
    }

    public static void main(String[] args) {
        WordleGame wordleGame = new WordleGame();
        wordleGame.gameStart();
    }
}
