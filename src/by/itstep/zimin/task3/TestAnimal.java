package by.itstep.zimin.task3;

import java.util.Set;
import java.util.TreeSet;

public class TestAnimal {

    public static Set<Animal> animalSet = new TreeSet<Animal>();

    /**
     * 2 Создать TreeSet содержащий класс Animal (поля - имя, кол-во лет, месяц рождения). Прибавить
     * всем животным, у которых месяц рождения апрель - 1 год. Распечатать содержимое с помощью for
     * each.
     */

    public static void main(String[] args) {

        Animal animal1 = new Animal(4, "Bobik", "April");
        Animal animal2 = new Animal(1, "Barsik", "October");
        Animal animal3 = new Animal(2, "Tuman", "September");
        Animal animal4 = new Animal(5, "Jula", "May");
        Animal animal5 = new Animal(6, "Mars", "April");
        animalSet.add(animal1);
        animalSet.add(animal2);
        animalSet.add(animal3);
        animalSet.add(animal4);
        animalSet.add(animal5);
        animalSet.stream()
                .map(c -> {
                    if (c.getMonthOfBirth().equals("April")) {
                        int age = c.getAge();
                        c.setAge(++age);
                    }
                    return c;
                })
                .forEach(s -> System.out.println(s));

    }
}
