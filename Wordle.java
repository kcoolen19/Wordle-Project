import java.util.Scanner;

public class Wordle {

    public static final int WORD_LENGTH = 5;
    public static final String GREEN_BACKGROUND = "\u001B[32m";
    public static final String RED_BACKGROUND = "\u001B[41m";
    public static final String RESET_BACKGROUND = "\u001B[0m"; 
    public static void main(String[] args) {
        String answer = "place";
        Scanner prompt = new Scanner(System.in);
        
        String result;
        do {
            System.out.print("Enter a 5-letter word: ");
            result = prompt.next();
        } while (result.length() != WORD_LENGTH);

        int attempts = 6;
        for (int tries = 1; tries <= attempts; tries++) {
            int sameLetters = compareLetters(result, answer);
            
            if (sameLetters == WORD_LENGTH) {
                System.out.println("Congratulations! You've guessed the word!");
                break;
            } else {
                System.out.printf("Attempt %d: %d letters correct.\n", tries, sameLetters);
                System.out.print("Enter another word: ");
                result = prompt.next();
            }
        }
        prompt.close();
    }

    public static int compareLetters(String word, String answer) {
        int sameLetters = 0;
        StringBuilder answerString = new StringBuilder();

        for (int i = 0; i < WORD_LENGTH; i++) {
            if (word.charAt(i) == answer.charAt(i)) {
                answerString.append(GREEN_BACKGROUND).append(word.charAt(i));
                sameLetters++;
            } else {
                answerString.append(RED_BACKGROUND).append(word.charAt(i));
            }
        }
        System.out.println("Feedback: " + answerString);
        return sameLetters;
    }
}
