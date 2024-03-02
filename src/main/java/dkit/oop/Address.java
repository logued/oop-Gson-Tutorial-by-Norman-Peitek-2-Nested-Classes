package dkit.oop;

public class Address {
    String street;
    String houseNumber;
    String city;
    String country;

    public Address(String street, String houseNumber, String city, String country) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "\nAddress{" +
                "street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}