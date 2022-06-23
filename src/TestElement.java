import java.util.Scanner;

public class TestElement {

    private String question;
    private Answer[] answers;
    private int rightAnswer;

    public TestElement(String question, Answer[] answers, int rightAnswer) {
        this.question = question;
        this.answers = answers;
        this.rightAnswer = rightAnswer;
    }

    public boolean ask () {
        System.out.println(question);
        for (int i = 0; i < answers.length; i++) {
            System.out.println(answers[i].getFirstAnswer());
        }
        Scanner sc = new Scanner(System.in);
        int inputAnswer = sc.nextInt();

        return inputAnswer == rightAnswer;
    }



}
