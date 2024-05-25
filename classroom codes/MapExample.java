package stud;
import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the map
        map.put("Wankhade", 30);
        map.put("Motghare", 25);
        map.put("Meshram", 35);


        // Iterating over the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Checking if a key exists
        if (map.containsKey("Motghare")) {
            System.out.println("Map contains key 'Motghare'");
        }

        // Checking if a value exists
        if (map.containsValue(25)) {
            System.out.println("Map contains value 25");
        }

        // Removing a key-value pair
        map.remove("Meshram");

        // Size of the map
        System.out.println("Size of the map: " + map.size());
    }
}