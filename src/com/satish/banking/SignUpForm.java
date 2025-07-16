package com.satish.banking;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUpForm extends JFrame implements ActionListener {

    JTextField textName,textFname,textEmail,textAdd,textCity,textState,textPin;
    JDateChooser dateChooser;
    JRadioButton r1,r2,m1,m2,m3;
    JButton next;

    Random ran=new Random();

    long first4=(ran.nextLong()%9000L)+1000L;
    String first=" "+ Math.abs(first4);

    SignUpForm(){
        super("APPLICATION FORM");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));


        Image i2= i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1=new JLabel("APPLICATION FORM NO ."+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("raleway",Font.BOLD,38));
        add(label1);

        JLabel label2=new JLabel("Page 1.");
        label2.setBounds(330,70,600,30);
        label2.setFont(new Font("raleway",Font.BOLD,22));
        add(label2);



        JLabel label3=new JLabel("Personal Detail.");
        label3.setBounds(290,90,600,30);
        label3.setFont(new Font("raleway",Font.BOLD,22));
        add(label3);

        JLabel labelName=new JLabel("Name :");
        labelName.setFont(new Font("raleway",Font.BOLD,20));
        labelName.setBounds(100,170,100,30);
        add(labelName);

        textName=new JTextField();
        textName.setFont(new Font("raleway",Font.BOLD,14));
        textName.setBounds(250,170,400,30);
        add(textName);


        JLabel labelFname=new JLabel("Father's Name :");
        labelFname.setFont(new Font("raleway",Font.BOLD,20));
        labelFname.setBounds(100,220,150,30);
        add(labelFname);

        textFname=new JTextField();
        textFname.setFont(new Font("raleway",Font.BOLD,14));
        textFname.setBounds(250,220,400,30);
        add(textFname);


        JLabel DOB=new JLabel("Date Of Birth :");
        DOB.setFont(new Font("raleway",Font.BOLD,20));
        DOB.setBounds(100,270,200,30);
        add(DOB);

        dateChooser=new JDateChooser();
        dateChooser.setFont(new Font("raleway",Font.BOLD,20));
        dateChooser.setBounds(250,270,400,30);
        add(dateChooser);

        JLabel lebelG=new JLabel("Gender :");
        lebelG.setFont(new Font("raleway",Font.BOLD,20));
        lebelG.setBounds(100,320,200,30);
        add(lebelG);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("raleway",Font.BOLD,20));
        r1.setBounds(250,320,100,30);
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("raleway",Font.BOLD,20));
        r2.setBounds(400,320,100,30);
        add(r2);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel lebelEmail=new JLabel("Email adress :");
        lebelEmail.setFont(new Font("raleway",Font.BOLD,20));
        lebelEmail.setBounds(100,380,200,30);
        add(lebelEmail);

        textEmail=new JTextField();
        textEmail.setFont(new Font("raleway",Font.BOLD,20));
        textEmail.setBounds(250,380,400,30);
        add(textEmail);

        JLabel lebelMs=new JLabel("Martial Status :");
        lebelMs.setFont(new Font("raleway",Font.BOLD,20));
        lebelMs.setBounds(100,420,200,30);
        add(lebelMs);

//        m1=new JRadioButton("married");
        m1=new JRadioButton("Married");
        m1.setFont(new Font("raleway",Font.BOLD,14));
        m1.setBounds(250,420,100,30);
        add(m1);

        m2=new JRadioButton("Unmarried");
        m2.setFont(new Font("raleway",Font.BOLD,14));
        m2.setBounds(400,420,100,30);
        add(m2);

        m3=new JRadioButton("Other");
        m3.setFont(new Font("raleway",Font.BOLD,14));
        m3.setBounds(550,420,100,30);
        add(m3);

        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);


        JLabel lebelAdd=new JLabel("Address :");
        lebelAdd.setFont(new Font("raleway",Font.BOLD,20));
        lebelAdd.setBounds(100,470,200,30);
        add(lebelAdd);

        textAdd=new JTextField();
        textAdd.setFont(new Font("raleway",Font.BOLD,20));
        textAdd.setBounds(250,470,400,30);
        add(textAdd);


        JLabel lebelCity=new JLabel("City :");
        lebelCity.setFont(new Font("raleway",Font.BOLD,20));
        lebelCity.setBounds(100,520,200,30);
        add(lebelCity);

        textCity=new JTextField();
        textCity.setFont(new Font("raleway",Font.BOLD,20));
        textCity.setBounds(250,520,400,30);
        add(textCity);


        JLabel lebelPin =new JLabel("Pin Code :");
        lebelPin.setFont(new Font("raleway",Font.BOLD,20));
        lebelPin.setBounds(100,570,200,30);
        add(lebelPin);

        textPin=new JTextField();
        textPin.setFont(new Font("raleway",Font.BOLD,20));
        textPin.setBounds(250,570,400,30);
        add(textPin);

//
        JLabel lebelState =new JLabel("State :");
        lebelState.setFont(new Font("raleway",Font.BOLD,20));
        lebelState.setBounds(100,620,200,30);
        add(lebelState);

        textState=new JTextField();
        textState.setFont(new Font("raleway",Font.BOLD,20));
        textState.setBounds(250,620,400,30);
        add(textState);


        next=new JButton("Next");
        next.setFont(new Font("raleway",Font.BOLD,14));
        next.setBounds(570,670,80,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);



        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno=first;
        String name=textName.getText();
        String fname=textFname.getText();
        String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(r1.isSelected()){
            gender="Male";
        } else if (r2.isSelected()) {
            gender="Female";

        }

        String email=textEmail.getText();
        String marital=null;
        if(m1.isSelected()){
            marital="Married";
        } else if (m2.isSelected()) {
            marital="UnMarried";

        }
        else if (m3.isSelected()) {
            marital = "Other";
        }

        String adress=textAdd.getText();
        String city=textCity.getText();
        String pincode=textPin.getText();
        String state=textState.getText();

        try{
            if(textName.getText().equals(" ")){
                JOptionPane.showMessageDialog(null,"fill all thre field");
            }
            else {
                ConnectToDb con1=new ConnectToDb();
                String q="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+adress+"','"+city+"','"+pincode+"','"+state+"')";
                 con1.statement.executeUpdate(q);
                 new AdditionalDetailsForm(first);
                 setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new SignUpForm();

    }

}
