package dkit.oop;

import com.google.gson.Gson;

/**
 * Gson Tutorial 2 - Mapping of Nested Objects
 * A User class has an Address field.
 * (So, the Address is nested inside the User class)
 * This is known as composition - user is composed of an address field and other fields.
 */
public class MainApp {
    public static void main(String[] args) {
        System.out.println("Gson Tutorial 2");
        MainApp mainApp = new MainApp();
        mainApp.start();
    }

    public void start() {

        Address address = new Address("Main Street","42A","Magdeburg","Germany" );
        User user = new User("Norman","norman@futurestud.io",26,true, address  );   // reference to nested address object

        // Serialize a Java Object containing a nested object using the Gson parser.
        Gson gsonParser = new Gson();
        String userWithAddressJson = gsonParser.toJson(user);

        System.out.println("Nested User Object JSON String :");
        System.out.println( user.toString() );

        // De-serialize a JSON String into a Java Object

        // Study the Restaurant class first , and see that it is composed of Owner, Cook and Waiter.
        // String restaurantJson = "{ 'name':'Future Studio Steak House', 'owner':{ 'name':'Christian', 'address':{ 'city':'Magdeburg', 'country':'Germany', 'houseNumber':'42', 'street':'Main Street'}},'cook':{ 'age':18, 'name': 'Marcus', 'salary': 1500 }, 'waiter':{ 'age':18, 'name': 'Norman', 'salary': 1000}}";

        String restaurantJsonString =
                "{ 'name':'Future Studio Steak House', " +
                    "'owner':{  'name':'Christian', " +
                                "'address':{ 'city':'Magdeburg', " +
                                            "'country':'Germany', " +
                        "                   'houseNumber':'42', " +
                        "                   'street':'Main Street'}" +
                            "}," +
                    "'cook':{ 'age':18, 'name': 'Marcus', 'salary': 1500 }, " +
                    "'waiter':{ 'age':18, 'name': 'Norman', 'salary': 1000}}";

        // Note that the names of the Key values match the names of the fields defined in the classes
        // This is required (as otherwise Gson could not match them)

        Restaurant restaurantObject = gsonParser.fromJson(restaurantJsonString, Restaurant.class);

        System.out.println("Restaurant object toString():");
        System.out.println(restaurantObject.toString());
    }
}
