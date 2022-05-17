import java.util.Arrays;
import java.util.Scanner;

public class HomeworkTemplate {
    public static void main(String[] args) {

        int correctCount = 0, wrongCount = 0;
        String[] questions = {"1. Сколько дней в году?", "2. Автором какой книги является Оскар Уайльд?",
                "3. В каком году произошла Октябрьская революция?"};
        String[] answerOptionsFirstQuestion = {"1) 214", "2) 365", "3) 456", "4) 9078"};
        String[] answerOptionsSecondQuestion = {"1) Война и мир", "2) Муму", "3) Портрет Дориана Грея", "4) 1984"};
        String[] answerOptionsThirdQuestion = {"1) 1917", "2) 1743", "3) 2000", "4) 2134"};

        String answer1 = Arrays.toString(answerOptionsFirstQuestion);
        String answer2 = Arrays.toString(answerOptionsSecondQuestion);
        String answer3 = Arrays.toString(answerOptionsThirdQuestion);

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println(questions[i - 1]);
            if (questions[i - 1] == questions[0]) {
                System.out.println(answer1);
            } else if (questions[i - 1] == questions[1]) {
                System.out.println(answer2);
            } else if (questions[i - 1] == questions[2]) {
                System.out.println(answer3);
            }
            System.out.println("Ваш ответ: ");
            int inputAnswer = scanner.nextInt();
            if (i == 1 & inputAnswer == 2) {
                System.out.println("Правильно");
                correctCount++;
            } else if (i == 2 & inputAnswer == 3) {
                System.out.println("Правильно");
                correctCount++;
            }  else if (i == 3 & inputAnswer == 1) {
                System.out.println("Правильно");
                correctCount++;
            } else {
                System.out.println("Неправильно");
                wrongCount++;
            }
        }

        System.out.println("Результат: правильно - " + correctCount + ", неправильно - " + wrongCount);
    }
}
