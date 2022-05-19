public class Answers {

    protected final String[] ANSWERS_ARRAY = {"1) 214, 2) 365, 3) 456, 4) 9078", "2", "1) Война и мир, 2) Муму, 3) Портрет Дориана Грея",
            "1) 1917, 2) 1743, 3) 2000, 4) 2134"};

    protected final String[] CORRECT_ANSWERS = {"2", "3", "1"};

    protected void showAnswers () {
        for (int i = 0; i < ANSWERS_ARRAY.length; i++) {
            System.out.println(ANSWERS_ARRAY[i]);
        }
    }
}
