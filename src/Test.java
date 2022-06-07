public class Test {

    void passTest() {
        Questions questions = new Questions();
        questions.ask();
        System.out.println("Результат: правильно - " + questions.getCorrectCount() + ", неправильно - " + questions.getWrongCount());
    }


}
