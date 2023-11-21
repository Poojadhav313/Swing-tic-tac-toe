import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class gridlay {
    public static void main(String arg[])
    {
        play p = new play();
    }
}

class play implements ActionListener
{
    JFrame f;
    JLabel l1,l2,l3;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;

    String player1, player2;
    int turn;
    HashMap<String, Integer> hm;

    play()
    {
        //print();
        player1 = "Pooja"; //0
        player2 = "Shiro"; //1
        turn = 0;
        hm = new HashMap<>();

        f = new JFrame("tic tak toe");
        b1 = new JButton();
        b2 = new JButton();
        b3 = new JButton();
        b4 = new JButton();
        b5 = new JButton();
        b6 = new JButton();
        b7 = new JButton();
        b8 = new JButton();
        b9 = new JButton();

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

        l1 = new JLabel(player1);
        l1.setBounds(10,10,100,20);
        f.add(l1);
        l2 = new JLabel("You won!!");
        l2.setBounds(10,10,100,20);
        f.add(l2);
        l3 = new JLabel(player2);
        l3.setBounds(10,10,100,20);
        f.add(l3);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300,300);
        f.setLayout(new GridLayout(4,3,10,10));
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        //ImageIcon icon1 = new ImageIcon("xx.png");
        //ImageIcon icon2 = new ImageIcon("oo.png");

        
        setT(turn, e);

        if(hm.size() >= 5)
        {
            checkwin();
        }    


        if(turn == 1)
        {
            turn = 0;
        }
        else if(turn == 0)
        {
            turn = 1;
        }

    }

    void checkwin()
    {
        if(hm.get("b1") == 0 && hm.get("b2") ==0 && hm.get("b3")== 0)
        {
            l2.setText("POOJA WON");
            return;
        }

    }

    void setT(int turn, ActionEvent e)
    {
        if(e.getSource() == b1)
        {
            b1.setText(""+ turn +"");
            hm.put("b1", turn);
        }
        if(e.getSource() == b2)
        {
            b2.setText(""+ turn +"");
            hm.put( "b2", turn);
        }
        if(e.getSource() == b3)
        {
            b3.setText(""+ turn +"");
            hm.put( "b3", turn);
        }
        if(e.getSource() == b4)
        {
            b4.setText(""+ turn +"");
            hm.put("b4", turn);
        }
        if(e.getSource() == b5)
        {
            b5.setText(""+ turn +"");
            hm.put("b5", turn);
        }
        if(e.getSource() == b6)
        {
            b6.setText(""+ turn +"");
            hm.put("b6", turn);
        }
        if(e.getSource() == b7)
        {
            b7.setText(""+ turn +"");
            hm.put("b7", turn);
        }
        if(e.getSource() == b8)
        {
            b8.setText(""+ turn +"");
            hm.put("b8", turn);
        }
        if(e.getSource() == b9)
        {
            b9.setText(""+ turn +"");
            hm.put("b9", turn);
            //print();
        }
    }

    void print()
    {
        for (String key : hm.keySet()) 
        {
            System.out.println("Key: " + key + ", Value: " + hm.get(key));
        }
    }
}