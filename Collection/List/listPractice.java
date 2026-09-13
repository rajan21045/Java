import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class listPractice {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        for (String value : fruits) {
            System.out.println(value);
        }
    }
}