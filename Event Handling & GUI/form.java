/*Design a Java Swing Student Registration Form with fields for name, address, phone, gender (radio buttons), course (combo box), email */
import javax.swing.*;
import java.awt.event.*;

public class form {
    // Constructor code here
    public form() {
        JFrame f = new JFrame("Form Registration");
        f.setSize(700, 400);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);

        // label and text field for name and it start from here
        JLabel label = new JLabel("Enter your name:");
        label.setBounds(50, 50, 100, 20);
        f.add(label);

        JTextField tf = new JTextField();
        tf.setBounds(160, 50, 160, 20);
        f.add(tf);

        // label and text field for name ends here
       

        // label and text field for address and it start from here
        JLabel label1 = new JLabel("Enter your address:");
        label1.setBounds(50, 80, 150, 20);
        f.add(label1);
        JTextField tf1 = new JTextField();
        tf1.setBounds(170, 80, 170, 20);
        f.add(tf1);
        // label and text field for address ends here

        // for phone number and it start from here
        JLabel label2 = new JLabel("Enter your phone number:");
        label2.setBounds(50, 110, 150, 20);
        f.add(label2);
        JTextField tf2 = new JTextField();
        tf2.setBounds(210, 110, 170, 20);
        f.add(tf2);
        // for phone number and it ends here

        // for gender
        // Gender Label
        JLabel label3 = new JLabel("Gender:");
        label3.setBounds(50, 140, 100, 20);
        f.add(label3);

        // Radio Buttons for Gender
        JRadioButton rb1 = new JRadioButton("Male");
        rb1.setBounds(150, 140, 100, 20);
        f.add(rb1);
        JRadioButton rb2 = new JRadioButton("Female");
        rb2.setBounds(250, 140, 100, 20);
        f.add(rb2);
        JRadioButton rb3 = new JRadioButton("Other");
        rb3.setBounds(350, 140, 100, 20);
        f.add(rb3);

        // Combobox for Course
        JLabel label4 = new JLabel("Select your course:");
        label4.setBounds(50, 170, 150, 20);
        f.add(label4);
        String[] Course = { "Java", "Python", "C++", "JavaScript" };
        JComboBox cb = new JComboBox(Course);
        cb.setBounds(200, 170, 150, 20);
        f.add(cb);

        //label and textfield for email
        JLabel mail = new JLabel("Enter your email:");
        mail.setBounds(50, 200, 150, 20);
        f.add(mail);
        JTextField tf3 = new JTextField();
        tf3.setBounds(200, 200, 150, 20);
        f.add(tf3);

        JButton submit = new JButton("Submit");
        submit.setBounds(200, 240, 100, 30);
        f.add(submit);

//event handling 
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Display message
                JOptionPane.showMessageDialog(f, "Submission successful!");
            }
        });

        // Grouping the Radio Buttons (so only one can be selected)
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        f.setVisible(true);

    }

    public static void main(String[] args) {
        // write your code here
        new form();

    }
}
