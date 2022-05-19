import java.util.Scanner;

public class Questions extends Answers {

    protected final String FIRST_QUESTION = "1. Сколько дней в году?";
    protected final String SECOND_QUESTION = "2. Автором какой книги является Оскар Уайльд?";
    protected final String THIRD_QUESTION = "3. В каком году произошла Октябрьская революция?";

    protected void showQuestion (int num) {
        if (num == 0) {
            System.out.println(FIRST_QUESTION);
            System.out.println(FIRST_ANSWERS);
            System.out.println("Ваш ответ: ");
        } else if (num == 1) {
            System.out.println(SECOND_QUESTION);
            System.out.println(SECOND_ANSWERS);
            System.out.println("Ваш ответ: ");
        } else if (num == 2) {
            System.out.println(THIRD_QUESTION);
            System.out.println(THIRD_ANSWERS);
            System.out.println("Ваш ответ: ");
        }
    }

    protected void inputResult() {
        int correctCount = 0, wrongCount = 0;
        Scanner scan = new Scanner(System.in);
        int inputAnswer = scan.nextInt();
            if (i == 0 & inputAnswer == CORRECT_ANSWERS[0]) {
                System.out.println("Правильно");
                correctCount++;
            } else if (i == 1 & inputAnswer == CORRECT_ANSWERS[1]) {
                System.out.println("Правильно");
                correctCount++;
            } else if (i == 2 & inputAnswer == CORRECT_ANSWERS[2]) {
                System.out.println("Правильно");
                correctCount++;
            } else
                System.out.println("Неправильно");
                wrongCount++;

        System.out.println("Результат: правильно - " + correctCount + ", неправильно - " + wrongCount);
    }

}
