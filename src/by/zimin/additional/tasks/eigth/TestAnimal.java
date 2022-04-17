package by.zimin.additional.tasks.eigth;

import java.util.Set;
import java.util.TreeSet;

public class TestAnimal {

    /**
     * 7 Создать TreeSet содержащий класс Animal. Animal должен реализовать интерфейс Comparable.
     * Распечатать содержимое с помощью for each.
     *
     * @param args
     */
    public static void main(String[] args) {
        Set<Animal> setAnimal = new TreeSet<>();

        Animal animal = new Animal("Bobik", 2);
        Animal animal1 = new Animal("Pushok", 1);
        Animal animal2 = new Animal("Bars", 6);
        Animal animal3 = new Animal("Lis", 3);

        setAnimal.add(animal);
        setAnimal.add(animal2);
        setAnimal.add(animal3);
        setAnimal.add(animal1);

        setAnimal.stream()
                .forEach(x -> System.out.println(x + "\n"));
    }
}
