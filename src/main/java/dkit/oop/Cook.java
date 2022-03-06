package dkit.oop;

public class Cook {
    String name;        // default assess modifier - "package private"
    int age;
    int salary;

    public Cook(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Cook{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}