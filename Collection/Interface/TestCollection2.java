import java.util.*; // Importing java.util package to use LinkedList and Iterator

public class TestCollection2 {
    public static void main(String[] args) {
        // Creating a LinkedList of type String
        LinkedList<String> al = new LinkedList<String>();

        // Adding elements (names) to the LinkedList
        al.add("Ashok");
        al.add("Rajan");
        al.add("Abin");
        al.add("Sasin");
        al.add("Anuj");
        al.add("Shishir");

        // Creating an Iterator to iterate through the LinkedList
        Iterator<String> itr = al.iterator();

        // Using while loop to traverse and print each element in the LinkedList
        while (itr.hasNext()) {
            System.out.println(itr.next()); // Prints the next element
        }
    }
}
