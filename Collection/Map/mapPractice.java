package Collections;

import java.util.HashMap;
import java.util.Map;

public class mapPractice {
    public static void main(String[] args) {
         Map<String, Integer> ages = new HashMap<>();
        ages.put("Rajan Poudel", 22);
        ages.put("Ashok Poudel", 23);
        ages.put("Prabin Thapa", 24);
        ages.put("Alice", 30);
        ages.put("Bob", 25);

        for(Map.Entry<String,Integer> entry: ages.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        int aliceAge = ages.get("Alice");
        int charlieAge = ages.getOrDefault("Charlie", 0);
        int daveAge = ages.computeIfAbsent("Dave", k -> 0);

        System.out.println("Alice's age: " + aliceAge);
        System.out.println("Charlie's age: " + charlieAge);
        System.out.println("Dave's age: " + daveAge);

    }
}
