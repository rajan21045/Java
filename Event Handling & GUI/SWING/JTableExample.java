/*
 Q. Write a Java Swing program to create a table using JTable with student details such as Name, Roll Number, and Department. 
 Display the table inside a scroll pane.
 */

import javax.swing.*;  // Import Swing components
import javax.swing.JScrollPane; // Optional, already included above
import javax.swing.JTable;      // Optional, already included above

// Main class to demonstrate JTable
public class JTableExample {

    // Declare frame and table
    JFrame f;
    JTable j;

    // Constructor to initialize the GUI
    JTableExample() {
        // Create a new frame
        f = new JFrame();
        f.setTitle("JTable Example"); // Set frame title

        // Data to be displayed in the table (2D array)
        String[][] data = {
            {"Rajan Poudel", "20", "BCA"},
            {"Ashok Poudel", "21", "BCA"},
            {"Sasin Godar", "22", "BCA"},
            {"Anuj Dhakal", "23", "BCA"},
            {"Prabin Thapa", "24", "BCA"}
        };

        // Column Names
        String[] columnNames = {"Name", "Roll Number", "Department"};

        // Create JTable with data and column names
        j = new JTable(data, columnNames);

        // Optional: Set position and size (not needed with JScrollPane)
        j.setBounds(30, 40, 200, 300);

        // Add the table to a scroll pane to handle overflow
        JScrollPane sp = new JScrollPane(j);

        // Add scroll pane (containing the table) to the frame
        f.add(sp);

        // Set frame size
        f.setSize(500, 200);

        // Make the frame visible
        f.setVisible(true);

        // Ensure application closes when window is closed
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Prevent frame resizing
        f.setResizable(false);
    }

    // Main method to run the application
    public static void main(String[] args) {
        new JTableExample(); // Create an instance of the class
    }
}
