package dkit.oop;
// An address class used in the User class

public class User {
    String name;
    String email;
    boolean isDeveloper;
    int age;
    Address address; // a nested class (composition)

//    Corresponding JSON Structure
// (Note that Gson sorts the fields alphabetically)
//
//  {
//    "age": 26,
//    "email": "norman@futurestud.io",
//    "isDeveloper": true,
//    "name": "Norman",
//    "address": {          // nested object
//        "city": "Magdeburg",
//        "country": "Germany",
//        "houseNumber": "42A",
//        "street": "Main Street"
//     }
//  }


    public User(String name, String email, int age, boolean isDeveloper, Address address) {
        this.name = name;
        this.email = email;
        this.isDeveloper = isDeveloper;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isDeveloper() {
        return isDeveloper;
    }

    public void setDeveloper(boolean developer) {
        isDeveloper = developer;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getUserAddress() {
        return address;
    }

    public void setUserAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", isDeveloper=" + isDeveloper +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
