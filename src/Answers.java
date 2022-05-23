import java.util.Scanner;

public class Answers {

    private final int[] CORRECT_ANSWERS_ARRAY = {2, 3, 1};
    private int correctCount = 0, wrongCount = 0;

    protected void inputAnswer(int questionCounter) {
        Scanner scan = new Scanner(System.in);
        int inputAnswer = scan.nextInt();
        if (questionCounter == 0 & inputAnswer == CORRECT_ANSWERS_ARRAY[0]) {
            System.out.println("Правильно");
            correctCount++;
            return;
        } else if (questionCounter == 1 & inputAnswer == CORRECT_ANSWERS_ARRAY[1]) {
            System.out.println("Правильно");
            correctCount++;
            return;
        } else if (questionCounter == 2 & inputAnswer == CORRECT_ANSWERS_ARRAY[2]) {
            System.out.println("Правильно");
            correctCount++;
            return;
        } else {
            System.out.println("Неправильно");
            wrongCount++;
            return;
        }
    }

    protected void showResult() {
        System.out.println("Результат: правильно - " + correctCount + ", неправильно - " + wrongCount);
    }

}
