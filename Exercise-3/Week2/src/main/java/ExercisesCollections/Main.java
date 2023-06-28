package ExercisesCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        //Use for-index:
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

//        //Use while (Java Iterator)
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //Use stream
        list.stream().forEach(item -> System.out.println(item));

        //Use forEach:
        list.forEach((item) -> System.out.println(item));

        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
