import java.util.*; // Importing java.util package to use the Vector class

public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector of type String
        Vector<String> vec = new Vector<String>();

        // Adding elements to the Vector using add() method
        vec.add("Ashok");
        vec.add("Anuj");
        vec.add("Abin");
        vec.add("Rajan");
        vec.add("Sasin");
        vec.add("Shishir");

        // Adding more elements using addElement() method
        // (addElement is a legacy method from early versions of Java, still supported)
        vec.addElement("Aayush");
        vec.addElement("Keshav");
        vec.addElement("Sudeep");
        vec.addElement("Nishant");

        // Printing the entire contents of the Vector
        System.out.println("Elements Are: " + vec);
    }
}
