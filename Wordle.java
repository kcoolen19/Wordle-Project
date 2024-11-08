import java.util.Arrays;
import java.util.Scanner;

public class Wordle {

    public static final int WORD_LENGTH = 5;

    public static void main(String[] args) {
        String answer = "place";
        Scanner prompt = new Scanner(System.in);
        System.out.println("Enter word: ");
        String result = prompt.next(); 
        if (result.length() != WORD_LENGTH) {
            System.out.println("Enter word: ");
            result = prompt.next();
        }
        compareLetters(result, answer);
    }
    
    public static void compareLetters(String word, String answer) {
        char[] wordCharacters = word.toCharArray();
        char[] answerCharacters = answer.toCharArray();
    }
}
