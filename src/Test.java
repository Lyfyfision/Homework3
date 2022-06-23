public class Test {

    private TestElement[] testElements;

    private int rightAnswersCount;
    private int wrongAnswersCount;

    void passTest() {
        for (int i = 0; i < testElements.length; i++) {
            boolean ask = testElements[i].ask();
            if (ask) {
                rightAnswersCount++;
            } else wrongAnswersCount++;
        }
        System.out.println("Результат: правильно - " + rightAnswersCount + ", неправильно - " + wrongAnswersCount);
    }

    public Test(TestElement[] testElements) {
        this.testElements = testElements;
    }


}
