package by.itstep.zimin.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Student implements Comparable<Student> {

    private String name;
    private String group;
    private int course;
    private Map<String, Integer> gradOfPredmet;

    public Student(String name, String group, int course, String predmet, int grad) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.gradOfPredmet = new HashMap<>();
        this.gradOfPredmet.put(predmet, grad);

    }

    public Student() {
    }


    public void addPredmetAndGrade(String predmet, int grade) {
        this.gradOfPredmet.put(predmet, grade);
    }

    public double getAvg(String name) {

        int count = 0;
        int sum = 0;
        for (Map.Entry<String, Integer> map : this.gradOfPredmet.entrySet()) {
            sum += map.getValue().intValue();
            count++;
        }
        double result = (double) sum / count;
        return result;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(group, student.group) && Objects.equals(gradOfPredmet, student.gradOfPredmet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, group, course, gradOfPredmet);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", gradOfPredmet=" + gradOfPredmet +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        String gr = this.group;
        return gr.compareTo(o.getGroup());
    }


}
