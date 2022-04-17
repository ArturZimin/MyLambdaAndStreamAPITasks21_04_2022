package by.zimin.additional.tasks.three;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Three {

    /**
     * 2 Генерируется длинный (20 элементов) список случайных целых чисел.
     * Выполняется проход по списку - добавить единицу всем элементам списка,
     * которые делятся без остатка на первый элемент.
     */

    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>(20);
        for (int i = 1; i <= 20; i++) {
            list.add(random.nextInt(30));
        }


        System.out.println(list);
        int firstElem = list.get(0);
        List<Integer> list1 = list.stream()
                .skip(1)
                .mapToInt(x -> x.intValue())
                .map(x -> {
                    if (x % firstElem == 0) {
                        x += 1;
                    }

                    return x;
                })
                .mapToObj(x -> x)
                .collect(Collectors.toList());
        list1.add(0, firstElem);

        System.out.println(list1);

    }
}
