import javax.swing.*;

public class form {
    form() {
        // Creating a new JFrame (window)
        JFrame f = new JFrame("Registration Form");
        f.setSize(450, 450);               // Setting the size of the window
        f.setLayout(null);                 // Using no layout manager (absolute positioning)
        f.setResizable(false);            // Prevent resizing
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit the application when closed

        // Title Label
        JLabel lb1 = new JLabel("Student Registration");
        lb1.setBounds(150, 10, 200, 30);   // x, y, width, height
        f.add(lb1);

        // Username Label and Text Field
        JLabel lb = new JLabel("Username:");
        lb.setBounds(50, 60, 100, 20);
        JTextField tf = new JTextField();
        tf.setBounds(150, 60, 200, 20);
        f.add(lb);
        f.add(tf);

        // E-Mail Label and Text Field
        JLabel lb2 = new JLabel("E-Mail:");
        lb2.setBounds(50, 100, 100, 20);
        JTextField emailField = new JTextField();
        emailField.setBounds(150, 100, 200, 20);
        f.add(lb2);
        f.add(emailField);

        // Roll Number Label and Text Field
        JLabel lb3 = new JLabel("Roll Number:");
        lb3.setBounds(50, 140, 100, 20);
        JTextField rollField = new JTextField();
        rollField.setBounds(150, 140, 200, 20);
        f.add(lb3);
        f.add(rollField);

        // Department Label and ComboBox (Dropdown)
        JLabel lb4 = new JLabel("Department:");
        lb4.setBounds(50, 180, 100, 20);
        String[] departments = {"BCA", "CS", "IT", "ECE", "EEE"}; // List of departments
        JComboBox<String> deptBox = new JComboBox<>(departments);
        deptBox.setBounds(150, 180, 200, 20);
        f.add(lb4);
        f.add(deptBox);

        // Submit Button
        JButton submitBtn = new JButton("Submit");
        submitBtn.setBounds(150, 230, 100, 30);
        f.add(submitBtn);

        // Action to perform on clicking the Submit button
        submitBtn.addActionListener(e -> {
            // Fetching user inputs
            String username = tf.getText();
            String email = emailField.getText();
            String roll = rollField.getText();
            String dept = (String) deptBox.getSelectedItem();

            // Displaying the information in a dialog box
            JOptionPane.showMessageDialog(f, "Submitted!\nUsername: " + username + 
                "\nEmail: " + email + "\nRoll No: " + roll + "\nDepartment: " + dept);
        });

        // Finally, make the frame visible
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new form(); // Creating an instance of the form class
    }
}
