package com.satish.banking;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BalanceEnquiry extends JFrame implements ActionListener {
    JLabel label2;
    JButton b1;

   BalanceEnquiry(){



       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icon/atm2.png"));
       Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel j3=new JLabel(i3);
       j3.setBounds(0,0,1550,830);
       add(j3);

       JLabel label1= new JLabel("Your Current Balence is rs");
       label1.setForeground(Color.white);
       label1.setFont(new Font("System",Font.BOLD,16));
       label1.setBounds(430,180,400,35);
       j3.add(label1);



       JLabel label2= new JLabel();
       label2.setForeground(Color.white);
       label2.setFont(new Font("System",Font.BOLD,16));
       label2.setBounds(430,220,400,35);
       j3.add(label2);


       b1=new JButton("Back");
       b1.setBounds(700,406,150,35);
       b1.setBackground(new Color(65,125,128));
       b1.setForeground(Color.WHITE);
//       b1.addActionListener(this);
       j3.add(b1);





       setLayout(null);
       setSize(1550,1080);
       setLocation(0 ,0);
       setVisible(true);


   }

    @Override
    public void actionPerformed(ActionEvent e) {
       

    }

    public static void main(String[] args) {
        new BalanceEnquiry();
    }


}
