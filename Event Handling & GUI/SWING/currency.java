import javax.swing.*;
import java.awt.event.*;

public class currency implements ActionListener {
    JLabel l1, l2;
    JTextField t1, t2;
    JButton convertBtn;
    JFrame f;

    currency() {
        f = new JFrame("Currency Converter");
        f.setLayout(null);
        f.setSize(300, 200);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Enter US Dollar:");
        l1.setBounds(20, 20, 120, 25);
        f.add(l1);

        t1 = new JTextField();
        t1.setBounds(150, 20, 100, 25);
        f.add(t1);

        convertBtn = new JButton("Convert");
        convertBtn.setBounds(90, 60, 100, 30);
        convertBtn.addActionListener(this);
        f.add(convertBtn);

        l2 = new JLabel("NPR:");
        l2.setBounds(20, 110, 120, 25);
        f.add(l2);

        t2 = new JTextField();
        t2.setBounds(150, 110, 100, 25);
        t2.setEditable(false);
        f.add(t2);

        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double usd = Double.parseDouble(t1.getText());
            double npr = usd * 132.00; // Example conversion rate
            t2.setText(String.format("%.2f", npr));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(f, "Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new currency();
    }
}
