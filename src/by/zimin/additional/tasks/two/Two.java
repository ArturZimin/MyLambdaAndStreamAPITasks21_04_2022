package by.zimin.additional.tasks.two;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

public class Two {

    /**
     * 1 Дан список целых чисел (ArrayList<Integer>).
     * Удалить из него все числа, делящиеся на первый элемент.
     */
    public static void main(String[] args) {


        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>(20);
        for (int i = 1; i <= 20; i++) {
            list.add((int) (Math.random() * 10) + 1);
        }
        System.out.println(list);
        int firstElement = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) % firstElement == 0) {
                list.remove(i);
            }
        }

        System.out.println(list);


    }
}
