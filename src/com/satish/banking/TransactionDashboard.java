package com.satish.banking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TransactionDashboard extends JFrame  implements ActionListener {

    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    
    TransactionDashboard(String pin) {
        this.pin=pin;


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1550, 830);
        add(l3);


        JLabel lable = new JLabel("Pleae Select Your Transection ");
        lable.setFont(new Font("Raleway", Font.BOLD, 25));
        lable.setForeground(Color.WHITE);
        lable.setBounds(450, 180, 700, 35);
        l3.add(lable);

        b1 = new JButton("Deposite");
//        b1.setFont(new Font("ralawey",Font.BOLD,18));
        b1.setBackground(new Color(65, 125, 128));
        b1.setForeground(Color.WHITE);
        b1.setBounds(410, 274, 150, 35);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("CASH WITHDRAW");
//        b2.setFont(new Font("ralawey",Font.BOLD,18));
        b2.setBackground(new Color(65, 125, 128));
        b2.setForeground(Color.WHITE);
        b2.setBounds(700, 274, 150, 35);
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("FAST CASH");
//        b3.setFont(new Font("ralawey",Font.BOLD,18));
        b3.setBackground(new Color(65, 125, 128));
        b3.setForeground(Color.WHITE);
        b3.setBounds(410, 318, 150, 35);
        b3.addActionListener(this);
        l3.add(b3);


        b4 = new JButton("MINI STATEMENT");
//        b4.setFont(new Font("ralawey",Font.BOLD,18));
        b4.setBackground(new Color(65, 125, 128));
        b4.setForeground(Color.WHITE);
        b4.setBounds(700, 318, 150, 35);
        b4.addActionListener(this);
        l3.add(b4);

        b5 = new JButton("PIN CHANGE");
//        b5.setFont(new Font("ralawey",Font.BOLD,18));
        b5.setBackground(new Color(65, 125, 128));
        b5.setForeground(Color.WHITE);
        b5.setBounds(410, 362, 150, 35);
        b5.addActionListener(this);
        l3.add(b5);


        b6 = new JButton("BALANCE ENQUIRY");
//        b6.setFont(new Font("ralawey",Font.BOLD,18));
        b6.setBackground(new Color(65, 125, 128));
        b6.setForeground(Color.WHITE);
        b6.setBounds(700, 362, 150, 35);
        b6.addActionListener(this);
        l3.add(b6);

        b7 = new JButton("EXIT");
        b7.setBackground(new Color(65, 125, 128));
        b7.setForeground(Color.WHITE);
        b7.setBounds(700, 406, 150, 35);
        b7.addActionListener(this);
        l3.add(b7);


        setLayout(null);
        setSize(1550, 1080);
        setLocation(0, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            new DepositTransaction(pin);
            setVisible(false);
        } else if (e.getSource()==b7) {
            System.exit(0);

        } else if (e.getSource()==b2) {
            new WithdrawTransaction(pin);
            setVisible(false);
            
        }


    }

    public static void main(String[] args) {
        new TransactionDashboard(" ");

    }


}
