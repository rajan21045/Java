//implementation of MouseListener Event handling
import javax.swing.*;
import java.awt.event.*;
public class MouseListenerSimpleDemo  implements MouseListener{

    JLabel l;
    MouseListenerSimpleDemo()
    {
        JFrame f= new JFrame();
        l= new JLabel();
        l.setBounds(20,50,100,20);
        f.add(l);
        f.setSize(300,300);
        f.setLayout(null);
        f.setResizable(false);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e)
    {
        l.setText("Mouse Clicked");
    }
    public void mouseEntered(MouseEvent e)
    {
        l.setText("Mouse Entered");
    }
    public void mousePressed(MouseEvent e)
    {
        l.setText("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e)
    {
        l.setText("Mouse Released");
    }

    public void mouseExited(MouseEvent e)
    {
        l.setText("Mouse Exited");
    }
    public static void main(String[] args)
    {
        new MouseListenerSimpleDemo();
    }

}
