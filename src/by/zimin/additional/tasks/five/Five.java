package by.zimin.additional.tasks.five;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Five {

    /**
     * 4 Дана коллекция HashMap.
     * Ключ - ФИО, значение - номер телефона. Организовать поиск ФИО по номеру телефона
     */

    public static void main(String[] args) {
        Map<String, String> mapNumber = new HashMap<>();
        mapNumber.put("Andrey", "80293252565");
        mapNumber.put("Katya", "80333252598");
        mapNumber.put("Tatjana", "80443287765");
        mapNumber.put("Kiril", "804433111565");
        mapNumber.put("Anna", "80293252565");

        System.out.println(findNameByPhone("80443287765", mapNumber));
        System.out.println(findNameByPhonePartially("80443", mapNumber));
    }

    public static String findNameByPhone(String phone, Map<String, String> map) {
        String temp = null;
        for (Map.Entry<String, String> m : map.entrySet()) {
            if (m.getValue().equals(phone)) {
                return m.getKey() + " : " + m.getValue();
            }
        }
        return temp;
    }

    public static Map<String,String> findNameByPhonePartially(String phone, Map<String, String> map) {

        Map<String,String>mapNumber=new HashMap<>();
        for (Map.Entry<String, String> m : map.entrySet()) {
            if (m.getValue().contains(phone)) {
                mapNumber.put(" Partitial :"+m.getKey(),m.getValue());
            }
        }
        return mapNumber;


    }
}
