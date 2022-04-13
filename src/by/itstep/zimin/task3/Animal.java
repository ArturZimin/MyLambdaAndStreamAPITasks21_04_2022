package by.itstep.zimin.task3;

import java.util.Objects;

public class Animal implements Comparable<Animal>{

    private int age;
    private String name;
    private String monthOfBirth;

    public Animal(int age, String name, String monthOfBirth) {
        this.age = age;
        this.name = name;
        this.monthOfBirth = monthOfBirth;
    }
    public Animal(){}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(String monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name) && Objects.equals(monthOfBirth, animal.monthOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, monthOfBirth);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", monthOfBirth='" + monthOfBirth + '\'' +
                '}';
    }

    @Override
    public int compareTo(Animal o) {
        int age=this.age;
        if (age==o.getAge()){
            return 0;
        }else {
           int result= age>o.getAge() ? 1:-1;
           return result;
        }
    }


}
