import java.util.*; // Importing the java.util package for using ArrayList and Iterator

public class TestJavaCollection {
    public static void main(String[] args) {
        // Creating an ArrayList of type String
        ArrayList<String> list = new ArrayList<String>();

        // Adding elements to the list
        list.add("Anuj");
        list.add("Ashok");
        list.add("Sasin");
        list.add("Abin");

        // Creating an Iterator to traverse the list
        Iterator itr = list.iterator();

        // Iterating through the list using while loop and printing each element
        while(itr.hasNext()) {
            System.out.println(itr.next()); // Prints the next element in the list
        }
    }
}
