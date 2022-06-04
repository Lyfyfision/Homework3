import java.util.Scanner;

public class Questions extends Answers{

    private final String[]QUESTIONS_ARRAY = {"1. Сколько дней в году?", "2. Автором какой книги является Оскар Уайльд?",
            "3. В каком году произошла Октябрьская революция?"};
    private int correctCount = 0;
    private int wrongCount = 0;

    public int getCorrectCount() {
        return correctCount;
    }

    public int getWrongCount() {
        return wrongCount;
    }

    boolean ask() {

        boolean isInputAnswerRight = false;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println(getQUESTIONS_ARRAY(i));
            System.out.println(getANSWERS_ARRAY(i));
            System.out.println("Ваш ответ: ");
            int inputAnswer = sc.nextInt();
            if(i == 0 & inputAnswer == FIRST_ANSWER) {
                isInputAnswerRight = true;
                correctCount++;
                continue;
            } else if (i == 1 & inputAnswer == SECOND_ANSWER) {
                isInputAnswerRight = true;
                correctCount++;
                continue;
            } else if (i == 2 & inputAnswer == THIRD_ANSWER) {
                isInputAnswerRight = true;
                correctCount++;
                continue;
            } else isInputAnswerRight = false; wrongCount++;{
            }
        }
        return isInputAnswerRight;
    }

    public String getQUESTIONS_ARRAY(int num) {
        return QUESTIONS_ARRAY[num];
    }
}


