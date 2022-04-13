package by.itstep.zimin.task.one.two;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static ArrayList<Integer> listInt = new ArrayList<>(10);
    public static ArrayList<Double> newDouble=new ArrayList<>(10);


    public static void main(String[] args) {
        Main m = new Main();
        listInt.add(2);
        listInt.add(5);
        listInt.add(6);
        listInt.add(2);
        listInt.add(7);
        listInt.add(3);
        listInt.add(8);
        System.out.println(m.findAVG(listInt));
        newDouble.add(1d);
        newDouble.add(50d );
        newDouble.add(6d);
        newDouble.add(6d);
        newDouble.add(6d);
        newDouble.add(10d);
        newDouble.add(10d);
        System.out.println(m.findAverage(newDouble));
        System.out.println("Collection Set: "+m.sortAndSaveToSet(newDouble));

    }

    /**
     * 0 Дан ArrayList<Integer>. C помощью Stream Api найдите среднее арифметическое
     */
    public double findAVG(ArrayList<Integer> list) {
        double avg = 0;
        int theSum = list.stream()
                .mapToInt(s -> (int) s)
                .sum();
        avg = (double) theSum / list.size();
        return avg;
    }

    public double findAVG1(ArrayList<Integer> list) {
        int[] arr = list.stream()
                .mapToInt(s -> s.intValue())
                .toArray();
        double avg = Arrays.stream(arr)
                .average().getAsDouble();

        return avg;
    }

    /**
     * 1 Дан ArrayList<Double> с числами - 1 50 6 6 6 6 10 10 10. C помощью Stream Api найдите среднее
     * исключите повторяющиеся элементы из коллекции, отсортируйте и сохраните в Set
     */
    public double findAverage(ArrayList<Double> avg) {
        double average = avg.stream()
                .mapToDouble(d -> d.doubleValue())
                .average().getAsDouble();
        return average;
    }
    public Set sortAndSaveToSet(ArrayList<Double> avg) {
        Set<Double> set = avg.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toSet());
        return set;
    }
}
