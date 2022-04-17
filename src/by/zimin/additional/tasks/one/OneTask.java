package by.zimin.additional.tasks.one;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OneTask {


    /**
     * Дан список целых чисел. Между двумя элементами одной чётности вставить число 0.
     */
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(20);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(34);
        System.out.println(list);

        int count = 0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (list.get(count)<list.size()) {
                if (list.get(count) % 2 == 0 && list.get(count + 1) % 2 == 0 && list.get(count) != 0
                        || list.get(count) % 2 != 0 && list.get(count + 1) % 2 != 0 && list.get(count) != 0) {
                    list.add((count + 1), 0);
                }
            }else {
                break;
            }
            count++;
        }
        System.out.println(list);

    }
}
