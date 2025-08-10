import java.util.HashMap;
import java.util.Map;

public class HashingExample {
    public static void main(String[] args) {
        // Create a HashMap to store country-capital pairs
        Map<String, String> countryCapitals = new HashMap<>();

        // Add elements to the HashMap
        countryCapitals.put("USA", "Washington D.C.");
        countryCapitals.put("France", "Paris");
        countryCapitals.put("Japan", "Tokyo");

        // Retrieve a value using its key
        String capitalOfFrance = countryCapitals.get("France");
        System.out.println("Capital of France: " + capitalOfFrance); // Output: Capital of France: Paris

        // Check if a key exists
        if (countryCapitals.containsKey("Germany")) {
            System.out.println("Germany is in the map.");
        } else {
            System.out.println("Germany is not in the map."); // Output: Germany is not in the map.
        }

        // Remove an entry
        countryCapitals.remove("Japan");
        System.out.println("Map after removing Japan: " + countryCapitals); // Output: Map after removing Japan: {USA=Washington D.C., France=Paris}
    }
}