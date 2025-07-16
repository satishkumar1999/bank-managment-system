package com.satish.banking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AccountDetailsForm extends JFrame implements ActionListener {

    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton s,c;
    String formno;

    AccountDetailsForm(String formno){
        this.formno=formno;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        JLabel l1=new JLabel("Page-3 :");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);



        JLabel l2=new JLabel("Account Details :");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(280,70,400,40);
        add(l2);

        JLabel l3=new JLabel("Account Type :");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,140,200,30);
        add(l3);


        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(new Color(215,252,252));
        r1.setBounds(100,180,150,30);
        add(r1);


        r2=new JRadioButton("Fixed Deposite");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(new Color(215,252,252));
        r2.setBounds(350,180,300,30);
        add(r2);


        r3=new JRadioButton("Cuurent Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(new Color(215,252,252));
        r3.setBounds(100,220,250,30);
        add(r3);


        r4=new JRadioButton("Reccuring Deposite Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(new Color(215,252,252));
        r4.setBounds(350,220,250,30);
        add(r4);


        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);


        JLabel l4=new JLabel("Card No :");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,300,200,30);
        add(l4);


        JLabel l5=new JLabel("(Enter 16-Digit Card Number :)");
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        l5.setBounds(100,330,200,30);
        add(l5);

        JLabel l6=new JLabel("XXXX-XXXX-XXXX-3312");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(330,300,250,30);
        add(l6);

        JLabel l7=new JLabel("it would appear on ATM/cheque book and statment");
        l7.setFont(new Font("Raleway",Font.BOLD,12));
        l7.setBounds(330,330,500,20);
        add(l7);

        JLabel l8=new JLabel("Pin No :");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,370,200,30);
        add(l8);

        JLabel l9=new JLabel("XXXX");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(330,370,200,30);
        add(l9);

        JLabel l10=new JLabel("4-digit passowerd");
        l10.setFont(new Font("Raleway",Font.BOLD,12));
        l10.setBounds(100,400,200,20);
        add(l10);


        JLabel l11=new JLabel("Service Requierd :");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,450,200,30);
        add(l11);

        c1=new JCheckBox("ATM Card ");
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBackground(new Color(215,252,252));
        c1.setBounds(100,500,200,30);
        add(c1);

        c2=new JCheckBox("Internate Banking ");
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBackground(new Color(215,252,252));
        c2.setBounds(350,500,200,30);
        add(c2);


        c3=new JCheckBox("Mobile Banking ");
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBackground(new Color(215,252,252));
        c3.setBounds(100,550,200,30);
        add(c3);

        c4=new JCheckBox("Email Alert ");
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBackground(new Color(215,252,252));
        c4.setBounds(350,550,200,30);
        add(c4);


        c5=new JCheckBox("Cheque Box :");
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBackground(new Color(215,252,252));
        c5.setBounds(100,600,200,30);
        add(c5);

        c6=new JCheckBox("E-Statment :");
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBackground(new Color(215,252,252));
        c6.setBounds(350,600,200,30);
        add(c6);

        JCheckBox c7=new JCheckBox("I hereby declare that the information provided is true and correct to the best of my knowledge and belief.\"");
        c7.setBackground(new Color(215,252,252));
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,630,700,20);
        add(c7);



        JLabel l12=new JLabel("Form No :");
        l12.setBounds(700,10,100,14);
        l12.setFont(new Font("ralawey",Font.BOLD,18));
        add(l12);



        JLabel l13=new JLabel(formno);
        l13.setBounds(800,10,60,14);
        l13.setFont(new Font("ralawey",Font.BOLD,18));
        add(l13);


        s=new JButton("Submit");
        s.setFont(new Font("ralawey",Font.BOLD,18));
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.setBounds(250,660,100,30);
        s.addActionListener(this);
        add(s);


        c=new JButton("Cancel");
        c.setFont(new Font("ralawey",Font.BOLD,18));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.setBounds(420,660,100,30);
        c.addActionListener(this);
        add(c);







        getContentPane().setBackground(new Color(215,252,252));
        setLayout(null);
        setSize(850,800);
        setLocation(400,20);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String AccTyp=" ";
        if (r1.isSelected()){
            AccTyp="Saving Account";
        }else if (r2.isSelected()) {
            AccTyp="Fixed Deposite";

        }else if (r3.isSelected()) {

            AccTyp="Cuurent Account";

        } else if (r4.isSelected()) {
            AccTyp="Reccuring Deposite Account";

        }

        //random number genrator for card

        Random ram=new Random();
        long first7=(ram.nextLong()%90000000L)+1409963000000000L;
        String cardNo=" "+Math.abs(first7);

        //Random number genrator for ATM pin

        long first3=(ram.nextLong()%9000L)+1000L;
        String pinNo=" "+Math.abs(first3);


        // service required field selection

        String Servvice=" ";
        if(c1.isSelected()){
            Servvice+="ATM Card";

        }  if (c2.isSelected()) {
            Servvice+="Internate Banking";

        }
         if (c3.isSelected()) {
            Servvice+="Mobile Banking ";

        }
         if (c4.isSelected()) {
            Servvice+="Email Alert ";

        }
        if (c5.isSelected()) {
            Servvice+="Cheque Box ";

        }
         if (c6.isSelected()) {

            Servvice+="E-Statment";

        }

        try {
            if(e.getSource()==s){
                if(AccTyp.equals(" ")){
                    JOptionPane.showMessageDialog(null,"fill all the field");
                }
                else {
                    ConnectToDb con=new ConnectToDb();
                    String q1="insert into signupthree values('"+formno+"','"+AccTyp+"','"+cardNo+"','"+pinNo+"','"+Servvice+"')";
                     String q2="insert into login values('"+formno+"','"+cardNo+"','"+pinNo+"')";
                     con.statement.executeUpdate(q1);
                     con.statement.executeUpdate(q2);
                     JOptionPane.showMessageDialog(null,"Card No :"+cardNo+"\n pin No :"+pinNo);

                     new DepositTransaction(pinNo);
                     setVisible(false);
               
                }
            } else if (e.getSource()==c) {
                System.exit(0);
                
            }

        }
        
        catch (Exception E){

            E.printStackTrace();

        }


    }

    public static void main(String[] args) {
        new AccountDetailsForm("");

    }


}
