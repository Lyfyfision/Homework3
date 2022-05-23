public class Questions extends Answers{

    private final String[][] QUESTIONS_AND_ANSWERS_ARRAY = {
            {"1. Сколько дней в году?", "1) 214, 2) 365, 3) 456, 4) 9078"},
            {"2. Автором какой книги является Оскар Уайльд?", "1) Война и мир, 2) Муму, 3) Портрет Дориана Грея"},
            {"3. В каком году произошла Октябрьская революция?", "1) 1917, 2) 1743, 3) 2000, 4) 2134"}
    };

    protected void showQuestion (int num) {
            System.out.println(QUESTIONS_AND_ANSWERS_ARRAY[num][0]);
            System.out.println(QUESTIONS_AND_ANSWERS_ARRAY[num][1]);
            System.out.println("Ваш ответ: ");
    }
}
