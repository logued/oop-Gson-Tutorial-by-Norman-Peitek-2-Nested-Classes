package dkit.oop;

import com.google.gson.Gson;

/**
 * Gson Tutorial 2 - Mapping of Nested Objects
 */
public class App {
    public static void main(String[] args) {
        System.out.println("GSON Tutorial 2");
        App app = new App();
        app.start();
    }

    public void start() {

        UserAddress userAddress = new UserAddress(
                "Main Street",
                "42A",
                "Magdeburg",
                "Germany"
        );

        UserNested userObject = new UserNested(
                "Norman",
                "norman@futurestud.io",
                26,
                true,
                userAddress     // reference to nested address object
        );

        // Serialize a Java Object containing a nested object
        // using the Gson parser.
        Gson gsonParser = new Gson();
        String userWithAddressJson = gsonParser.toJson(userObject);

        System.out.println("Nested User Object JSON String :");
        System.out.println( userObject.toString() );

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
        // This is required (as otherwise GSon could not match them)

        Restaurant restaurantObject = gsonParser.fromJson(restaurantJsonString, Restaurant.class);

        System.out.println("Restaurant object toString():");
        System.out.println(restaurantObject.toString());
    }
}

//TODO  - Consider the data below from the ISS API
// http://api.open-notify.org/iss-now.json
// Create a class IssNow to store the data returned from the API call.(shown below)
// You will need a Location class, to store the nested location data.
// Instantiate a new IssNow object using the GSon parser and string data below. (Deserialize)
// Write code to Serialize the ISSNow object into a new string and output the results.
// {
//   "timestamp": 1678125400,
//   "message": "success",
//   "iss_position": {"latitude": "48.9785",
//                    "longitude": "157.0276"}
// }