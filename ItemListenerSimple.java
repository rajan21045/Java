//example of using ItemListener

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ItemListenerSimple implements ItemListener {

    JFrame f;
    JCheckBox cb;

    ItemListenerSimple() {
        f = new JFrame("ItemListener Example"); // use instance variable 'f'
        f.setResizable(false);
        f.setSize(300, 300);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cb = new JCheckBox("Accept Terms"); // use instance variable 'cb'
        f.add(cb);
        cb.addItemListener(this); // register listener

        f.setVisible(true); // make frame visible
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            System.out.println("CheckBox Checked!");
        } else {
            System.out.println("CheckBox Unchecked!");
        }
    }

    public static void main(String[] args) {
        new ItemListenerSimple(); // create object to run
    }
}
