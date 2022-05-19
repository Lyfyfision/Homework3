import java.util.Scanner;

public class Answers {
    int correctCount = 0, wrongCount = 0;
    protected final String FIRST_ANSWERS = "1) 214, 2) 365, 3) 456, 4) 9078";
    protected final String SECOND_ANSWERS = "1) Война и мир, 2) Муму, 3) Портрет Дориана Грея";
    protected final String THIRD_ANSWERS = "1) 1917, 2) 1743, 3) 2000, 4) 2134";

    protected final int[] CORRECT_ANSWERS = {2, 3, 1};

    protected void inputAnswer() {
        int correctCount = 0, wrongCount = 0;
        Scanner scan = new Scanner(System.in);
        int inputAnswer = scan.nextInt();

        for (int i = 0; i < 3; i++) {
            if (inputAnswer == 2) {
                System.out.println("Правильно");
                correctCount++;
                continue;
            }
        }
    }

    protected void showResult() {

    }
}
