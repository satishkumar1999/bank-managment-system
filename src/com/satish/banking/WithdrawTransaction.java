package com.satish.banking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class WithdrawTransaction extends JFrame implements ActionListener {

    TextField textField;
    JButton b1,b2;

    String pinNo;

    WithdrawTransaction(String pinNo){
        this.pinNo=pinNo;



    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icon/atm2.png"));
    Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel j3=new JLabel(i3);
        j3.setBounds(0,0,1550,830);
    add(j3);

    JLabel label1= new JLabel("MAXIMUM WITHDRAW IS 10,000 RS :");
        label1.setForeground(Color.white);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(460,180,400,35);
        j3.add(label1);



        JLabel label2= new JLabel("PLEASE ENTER YOUR AMOUNT ");
        label2.setForeground(Color.white);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(460,220,400,35);
        j3.add(label2);


    textField=new TextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.white);
        textField.setBounds(460,260,320,25);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        j3.add(textField);

    b1=new JButton("Withdraw");
        b1.setBounds(700,362,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
//        b1.addActionListener(this);
        j3.add(b1);

    b2=new JButton("Back");
        b2.setBounds(700,406,150,35);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
//        b2.addActionListener(this);
        j3.add(b2);


    setLayout(null);
    setSize(1550,1080);
    setLocation(0 ,0);
    setVisible(true);

}


    @Override
    public void actionPerformed(ActionEvent e) {

        try{

            String amount =textField.getText();
            Date date =new Date();
            if (amount.equals(" ")){
                JOptionPane.showMessageDialog(null,"Please Enter Amount");
            }
            else {
                ConnectToDb con = new ConnectToDb();
                ResultSet resultSet = con.statement.executeQuery("select*from bank where Pin_No='" + pinNo + "'");
                int balance = 0;
                while (resultSet.next()) {
                    if (resultSet.getString("Type").equals("Deposite")){
                        balance+=Integer.parseInt(resultSet.getString("Amount"));
                    }
                    else {
                        balance-=Integer.parseInt(resultSet.getString("Amount"));

                    }

                }
                if (balance<Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"insufficient balance");
                    return;
                }
                con.statement.executeUpdate("insert into bank values('"+pinNo+"','"+date+"','Withdraw','"+amount+"')");
                JOptionPane.showMessageDialog(null,"rs "+amount+"Debited Succesfully");
                setVisible(false);
                new TransactionDashboard(pinNo);

            }
        }catch (Exception E){


        }

    }











    public static void main(String[] args) {
        new WithdrawTransaction("");

    }


}
