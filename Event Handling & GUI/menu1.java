/*
Java program to add a simple menu bar and menu items, submenus items and also add  Action Listener to menu items.
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class menu1 extends JFrame implements ActionListener {

    // Declare static components to use in main and across methods
    static JMenuBar mb;
    static JMenu x, x1;               // x = main menu, x1 = submenu
    static JMenuItem m1, m2, m3, s1, s2; // Menu items and submenu items
    static JFrame f;                  // Main frame
    static JLabel l;                  // Label to display selected menu item

    public static void main(String[] args) {
        menu1 m = new menu1();        // Create instance to register for ActionListener

        f = new JFrame("Menu Demo"); // Create the frame
        l = new JLabel("No Task");   // Initial label text

        mb = new JMenuBar();         // Create menu bar

        x = new JMenu("Menu");       // Main menu
        x1 = new JMenu("Submenu");   // Submenu

        // Create menu items
        m1 = new JMenuItem("MenuItem1");
        m2 = new JMenuItem("MenuItem2");
        m3 = new JMenuItem("MenuItem3");

        // Create submenu items
        s1 = new JMenuItem("SubMenuItem1");
        s2 = new JMenuItem("SubMenuItem2");

        // Register ActionListener to each menu and submenu item
        m1.addActionListener(m);
        m2.addActionListener(m);
        m3.addActionListener(m);
        s1.addActionListener(m);
        s2.addActionListener(m);

        // Add menu items to the main menu
        x.add(m1);
        x.add(m2);
        x.add(m3);

        // Add submenu items to submenu
        x1.add(s1);
        x1.add(s2);

        // Add submenu to main menu
        x.add(x1);

        // Add main menu to menu bar
        mb.add(x);

        // Set menu bar to the frame
        f.setJMenuBar(mb);

        // Add label to the frame
        f.add(l);

        // Set frame properties
        f.setSize(500, 500);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Handle menu item click events
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand(); // Get the text of the clicked menu item
        l.setText(s + " selected");      // Update label to show which item was selected
    }
}
