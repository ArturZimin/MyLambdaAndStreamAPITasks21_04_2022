package by.itstep.zimin.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class TestStudent {
    /**
     * 4 (выполнять не обязательно) Добавить студентов в коллекцию. Создать класс Student,
     * содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
     * Создать коллекцию, содержащую объекты класса Student.
     * Создать коллекцию с фио студентов, если средний балл>=3
     * А также печатает на консоль имена тех студентов из списка, которые обучаются на данном курсе
     */

    public static ArrayList<Student> studentList = new ArrayList<>(10);


    public static void main(String[] args) {
        Student student1 = new Student("Artur", "J2021", 3, "Biology", 7);
        student1.addPredmetAndGrade("Geography", 6);
        student1.addPredmetAndGrade("Philosophy", 9);
        Student student2 = new Student("Tatjana", "J2021", 5, "Biology", 8);
        student2.addPredmetAndGrade("Geography", 6);
        student2.addPredmetAndGrade("Philosophy", 7);
        Student student3 = new Student("Rimma", "J2021", 2, "Biology", 9);
        student3.addPredmetAndGrade("Geography", 3);
        student3.addPredmetAndGrade("Philosophy", 4);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        List<String> fio = studentList.stream()
                .filter(x -> x.getAvg(x.getName()) >= 3)
                .map(x -> {
                    System.out.println(x.getAvg(x.getName()));
                    return x.getName();

                })
                .collect(Collectors.toList());
        System.out.println(studentList);
        System.out.println(fio);

    }
}
