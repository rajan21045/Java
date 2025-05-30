import java.util.*;  // Importing the utility package for ArrayList and Iterator

public class ArrayListCollection {
    public static void main(String[] args) {

        // Creating an ArrayList of type String
        ArrayList<String> list = new ArrayList<String>();

        // Adding elements to the ArrayList
        list.add("Rajan");
        list.add("Ashok");
        list.add("Anuj");
        list.add("Sasin");
        list.add("Abin");
        list.add("Shishir");

        // Traversing the list using Iterator
        Iterator itr = list.iterator(); // Creating an iterator for the list

        // Looping through the elements using the iterator
        while(itr.hasNext()) {
            System.out.println(itr.next()); // Printing each element
        }
          
    }
}
