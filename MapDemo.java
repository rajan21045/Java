import java.util.*; // Importing java.util package to use HashMap and Map.Entry

public class MapDemo {
    public static void main(String[] args) {
        // Creating a HashMap with Integer keys and String values
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        // Adding key-value pairs to the HashMap
        map.put(103, "Ashok");
        map.put(101, "Amit");
        map.put(104, "Vijay");

        // Iterating over the entry set of the HashMap using a for-each loop
        for (Map.Entry m : map.entrySet()) {
            // Printing the key and value of each entry
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
