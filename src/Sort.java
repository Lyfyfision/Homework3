import java.util.*;

public class Sort {
    List<Integer> intList = new ArrayList<>();
    List<Integer> intListBubble = new ArrayList<>();

    public void add() {
        for (int i = 0; i < 10; i++) {
            Random r = new Random();
            int x = r.nextInt(15);
            intList.add(x);
        }
        System.out.println("До сортировки: " + intList.toString());
        Collections.sort(intList);
        System.out.println("После сортировки (sort): " + intList.toString());
    }

    public void addBubble() {
        int temp;
        boolean isSorted = false;
        for (int i = 0; i < 10; i++) {
            Random r = new Random();
            int x = r.nextInt(15);
            intListBubble.add(x);
        }
        System.out.println("До сортировки: " + intListBubble.toString());

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < intListBubble.size() - 1; i++) {
                    if (intListBubble.get(i).compareTo(intListBubble.get(i + 1)) > 0) {
                        isSorted = false;
                        temp = intListBubble.get(i);
                        intListBubble.set(i, intListBubble.get(i + 1));
                        intListBubble.set(i + 1, temp);
                }

            }
        }
        System.out.println("После сортировки (пузырьком): " + intListBubble.toString());
    }
}
