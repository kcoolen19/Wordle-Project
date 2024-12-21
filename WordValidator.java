import java.util.Scanner;

public class WordValidator {
    public static final int WORD_LENGTH = 5;
    public static final String PROMPT_STATEMENT = "Enter word: ";
    public static final String WRONG_PROMPT = "Word entered is not of the correct length!";
    public static final String REGULAR_EXPRESSION = "[a-zA-Z]+";

    public boolean wordValid(String word) {
        boolean condition = word != null && word.length() == WORD_LENGTH && word.matches(REGULAR_EXPRESSION);
        return condition;
    }

    public String wordValidator() {
        Scanner prompt = new Scanner(System.in);
        String inputWord = "";
        boolean isValid = false;
        while (!isValid) {
            System.out.print(PROMPT_STATEMENT);
            inputWord = prompt.next();
            isValid = wordValid(inputWord);
            if (!isValid) {
                System.out.println(WRONG_PROMPT);
            }
        }
        prompt.close();
        return inputWord;
    }
}
