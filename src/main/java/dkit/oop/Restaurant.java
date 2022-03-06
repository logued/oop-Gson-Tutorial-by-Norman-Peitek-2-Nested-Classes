package dkit.oop;

public class Restaurant {
    String name;            // default access modifier - package private
    Owner owner;
    Cook cook;
    Waiter waiter;

    public Restaurant(String name, Owner owner, Cook cook, Waiter waiter) {
        this.name = name;
        this.owner = owner;
        this.cook = cook;
        this.waiter = waiter;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", owner=" + owner +
                ", cook=" + cook +
                ", waiter=" + waiter +
                '}';
    }
}