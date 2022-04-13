package by.itstep.zimin.task4;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TestProduct {

    /**
     * 3 (выполнять не обязательно) Создайте HashMap, содержащий пары значений - имя игрушки и
     * объект игрушки (класс Product - поля: год выпуска, наименование). Исключить из коллекции
     * игрушки, произведенные до 2010 года. - любым способом, можно без stream.
     */

    public static Map<String, Product> productMap = new HashMap<>();

    public static void main(String[] args) {

        productMap.put("Cat", new Product(2009, "Pushok"));
        productMap.put("Dog", new Product(2011, "Crem"));
        productMap.put("Tiger", new Product(2012, "Sharhan"));
        productMap.put("Elephant", new Product(2005, "Grisha"));
        productMap.put("Mouse", new Product(2001, "Tom"));

        Map<String, Product> m = productMap.entrySet().stream()
                .filter(x -> x.getValue().getReleasedYear() >= 2010)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(m);


    }
}
