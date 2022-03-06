package dkit.oop;

public class Owner {

    String name;        // default access modifier - package-private
    UserAddress address;

    public Owner(String name, UserAddress address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}