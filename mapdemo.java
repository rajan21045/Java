import java.util.*; // Importing utility package for Map, HashMap, and Map.Entry

public class mapdemo {
    public static void main(String[] args) {
        // Creating a HashMap with Integer keys and String values
        Map<Integer, String> map = new HashMap<Integer, String>();

        // Adding key-value pairs to the map
        map.put(103, "Amit");
        map.put(104, "Anuj");
        map.put(105, "Ashok");
        map.put(106, "Abin");
        map.put(107, "Rajan");

        // Traversing the map entries using for-each loop
        for (Map.Entry m : map.entrySet()) {
            // Printing each key-value pair
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
