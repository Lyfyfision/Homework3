import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Answer answer = new Answer("Ответ 1");
        TestElement question = new TestElement("1) Вопрос?", new Answer[]{answer}, 1);
        Test test = new Test(new TestElement[]{question});
        test.passTest();

//        Test test = new Test();
//        test.passTest();
//        Sort sort = new Sort();
//        Sort sort2 = new Sort();
//
//        Date start = new Date();
//        sort.add();
//        Date end = new Date();
//
//        Date start2 = new Date();
//        sort2.addBubble();
//        Date end2 = new Date();
//
//        System.out.println("Время сортировки методом sort: " + (end.getTime() - start.getTime()) +
//        " Время сортировки пузырьком: " + (end2.getTime() - start2.getTime()));
    }
}
