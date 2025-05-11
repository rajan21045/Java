import java.util.*; // Importing java.util package to use HashSet and Iterator

public class HashSetDemo {
    public static void main(String[] args) {
        // Creating a HashSet of type String
        HashSet<String> set = new HashSet<String>();

        // Adding elements to the HashSet
        set.add("Ram");
        set.add("Hari");
        set.add("Ram");  // Duplicate element, will be ignored (HashSet does not allow duplicates)
        set.add("Ajay");

        // Creating an Iterator to traverse the HashSet
        Iterator<String> itr = set.iterator();

        // Iterating through the HashSet and printing each element
        while (itr.hasNext()) {
            System.out.println(itr.next()); // Prints the next unique element
        }
    }
}
