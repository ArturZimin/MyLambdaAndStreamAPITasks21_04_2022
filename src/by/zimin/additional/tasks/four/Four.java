package by.zimin.additional.tasks.four;

import java.util.ArrayList;

public class Four {

    /**
     * 3 Дана коллекция слов. Найти самое часто встречающееся слово.
     */
    public static void main(String[] args) {


        ArrayList<String> listName = new ArrayList<>(10);
        listName.add("Katya");
        listName.add("Ira");
        listName.add("Ira");
        listName.add("Sasha");
        listName.add("Katya");
        listName.add("Katya");
        int count = 1;
        int max = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < listName.size(); i++) {
            for (int j = i + 1; j < listName.size(); j++) {
                if (listName.get(i).equals(listName.get(j))) {
                    count++;
                    if (sb.toString().isEmpty() || count > max) {
                        if (!sb.toString().isEmpty()) {
                            sb.delete(0, sb.length());
                        }
                        sb.append(listName.get(i));
                        max = count;
                    }
                }
            }
            count = 1;
        }
        System.out.println(sb.toString() + " " + max);
    }
}