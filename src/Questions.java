public class Questions {

    private final String[] QUESTIONS = {"1. Сколько дней в году?", "2. Автором какой книги является Оскар Уайльд?",
            "3. В каком году произошла Октябрьская революция?"};

    protected void showQuestion () {
        for (int i = 0; i < QUESTIONS.length; i++) {
            System.out.println(QUESTIONS[i]);
        }
    }
}
