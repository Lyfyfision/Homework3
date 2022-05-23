

public class HomeworkTemplate {
    public static void main(String[] args) {

        Questions test = new Questions();

        for (int i = 0; i < 3; i++) {
            test.showQuestion(i);
            test.inputAnswer(i);
        }
        test.showResult();
    }
}
       /**
        String[][]questionsAndAnswers = {
                {"1. Сколько дней в году?", "1) 214, 2) 365, 3) 456, 4) 9078", "2"},
                {"2. Автором какой книги является Оскар Уайльд?", "1) Война и мир, 2) Муму, 3) Портрет Дориана Грея", "3"},
                {"3. В каком году произошла Октябрьская революция?", "1) 1917, 2) 1743, 3) 2000, 4) 2134", "1"}
        };

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questionsAndAnswers.length; i++) {
            System.out.println(questionsAndAnswers[i][0]);
            System.out.println(questionsAndAnswers[i][1]);
            System.out.println("Ваш ответ: ");
            String inputAnswer = scanner.nextLine();
            if (inputAnswer.equals(questionsAndAnswers[i][2])) {
                System.out.println("Правильно");
                correctCount++;
                continue;
            } else {
                System.out.println("Неправильно");
                wrongCount++;
                continue;
            }
        }
        System.out.println("Результат: правильно - " + correctCount + ", неправильно - " + wrongCount);
    }
        **/

