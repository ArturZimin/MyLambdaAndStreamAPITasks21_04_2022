package by.zimin.additional.tasks.seven;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Seven {

    /**
     * 6 Напишите Java-программу для итерации объекта типа HashMap с использованием цикла while и
     * улучшенного цикла for.
     */

    public static void main(String[] mapPhoneNumber) {
        Map<String, Long> mapPhone = new HashMap<>();
        mapPhone.put("Andrey", 80293252565L);
        mapPhone.put("Katya", 80333252598L);
        mapPhone.put("Tatjana", 80443287765L);
        mapPhone.put("Kiril", 804433111565L);
        mapPhone.put("Anna", 80293252565L);

        iterationHashMapWhile(mapPhone);
        iterationHashMapForeach(mapPhone);

    }

    public static void iterationHashMapWhile(Map<String, Long> map) {
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void iterationHashMapForeach(Map<String, Long> map) {
        for (Map.Entry<String, Long> m : map.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }
    }


}
