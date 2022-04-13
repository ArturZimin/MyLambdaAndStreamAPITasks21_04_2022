package by.itstep.zimin.task4;

import java.util.Objects;

public class Product implements Comparable<Product>{

    private int releasedYear;
    private String name;

    public Product(int releasedYear, String name) {
        this.releasedYear = releasedYear;
        this.name = name;
    }

    public Product() {
    }

    public int getReleasedYear() {
        return releasedYear;
    }

    public void setReleasedYear(int releasedYear) {
        this.releasedYear = releasedYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return releasedYear == product.releasedYear && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(releasedYear, name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "releasedYear=" + releasedYear +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        int year=this.releasedYear;
        if (year==o.releasedYear){
            return 0;
        }else {
           int result= year>o.releasedYear ? 1:0;
           return result;
        }
    }

}
