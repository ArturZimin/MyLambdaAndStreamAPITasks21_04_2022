package by.zimin.additional.tasks.six;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class CalculateWord {

    /**
     * 5 Напишите программу на Java для подсчета количества конкретных слов в строке,
     * используя HashMap.
     */

    public static void main(String[] args) {


        String txt = "Напишите программу на Java для подсчета количества конкретных слов в строке";
        System.out.println(calculateWordsAndAddToMap(txt));

    }

    public static Map<String, Integer> calculateWordsAndAddToMap(String txt) {
        Map<String, Integer> txtAndCountWords = new HashMap<>();
        String[] arr = txt.trim().split(" ");
        txtAndCountWords.put(txt, arr.length);
        return txtAndCountWords;
    }

    public static int calculateWordsInTxt(String txt) {
        String[] arr = txt.trim().split(" ");
        return arr.length;
    }
}
