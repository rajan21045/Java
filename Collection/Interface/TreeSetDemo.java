import java.util.*; // Importing java.util package to use TreeSet and Iterator

public class TreeSetDemo {
    public static void main(String[] args) {
        // Creating a TreeSet of type String
        TreeSet<String> set = new TreeSet<String>();

        // Adding elements to the TreeSet
        set.add("Ashok");
        set.add("Sasin");
        set.add("Anuj");
        set.add("Rajan");

        // TreeSet stores elements in **sorted (natural) order** and does not allow duplicates

        // Creating an Iterator to traverse the TreeSet
        Iterator<String> itr = set.iterator();

        // Iterating through the TreeSet and printing each element
        while (itr.hasNext()) {
            System.out.println(itr.next()); // Prints the next element in sorted order
        }
    }
}
