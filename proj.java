import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class proj{
    
    JFrame f;
    JButton b1;
    JTextField tf;
    JLabel l1;
    JLabel l2;

    proj()
    {
        f = new JFrame("project");

        l1 = new JLabel("enter number between 1-100");
        l1.setBounds(20, 10, 250, 50);

        tf = new JTextField();
        tf.setBounds(20, 60, 250, 40);
        
        b1 = new JButton("Click me");
        b1.setBounds(280, 60, 100, 40);
        b1.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                int x = 0;
                try
                {
                    x = Integer.parseInt(tf.getText());

                    if(!( x>=1 && x<=100))
                    {
                        throw new outRange();
                    }
                }
                catch(outRange e1)
                {
                    l2.setText(e1.toString());
                }
                catch(NumberFormatException e1)
                {
                    l2.setText("You have not entered a number");
                }
                if(x>=1 && x<=100)
                {
                    l2.setText("You have entered "+x);
                }
            }
        }
        );

        l2 = new JLabel();
        l2.setBounds(40, 120, 300, 50);

        f.add(l1);
        f.add(tf);
        f.add(b1);
        f.add(l2);

        f.setSize(500,500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    
    public static void main(String ar[])
    {
        proj p = new proj();
    }
}

class outRange extends Exception
{
    public String toString()
    {
        return "Please enter the number in given range";
    }
}