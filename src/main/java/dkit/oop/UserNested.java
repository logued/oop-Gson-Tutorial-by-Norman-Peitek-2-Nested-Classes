package dkit.oop;
// An address class used in the UserNested class

public class UserNested {
    String name;
    String email;
    boolean isDeveloper;
    int age;
    UserAddress userAddress; // a nested class (composition)

//    Corresponding JSON Structure
// (Note that Gson sorts the fields alphabetically)
//
//  {
//    "age": 26,
//    "email": "norman@futurestud.io",
//    "isDeveloper": true,
//    "name": "Norman",
//    "userAddress": {          // nested object
//        "city": "Magdeburg",
//        "country": "Germany",
//        "houseNumber": "42A",
//        "street": "Main Street"
//     }
//  }


    public UserNested(String name, String email, int age, boolean isDeveloper, UserAddress userAddress) {
        this.name = name;
        this.email = email;
        this.isDeveloper = isDeveloper;
        this.age = age;
        this.userAddress = userAddress;
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

    public UserAddress getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(UserAddress userAddress) {
        this.userAddress = userAddress;
    }

    @Override
    public String toString() {
        return "UserNested{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", isDeveloper=" + isDeveloper +
                ", age=" + age +
                ", userAddress=" + userAddress +
                '}';
    }
}
