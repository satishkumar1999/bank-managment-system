package com.satish.banking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdditionalDetailsForm extends JFrame implements ActionListener {
    JComboBox ComboBox,ComboBox2,ComboBox3,ComboBox4,ComboBox5;
    JTextField textPan,textAdhar;
    JRadioButton r1,r2,e1,e2;
    JButton Next;
    String formno;
    AdditionalDetailsForm(String formno) {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(380, 10, 100, 100);
        add(image);


        this.formno = formno;


        JLabel l1 = new JLabel("Page - 2 ");
        l1.setFont(new Font("Raleway", Font.BOLD, 30));
        l1.setBounds(600, 30, 600, 40);
        add(l1);

        JLabel l2 = new JLabel("Additional Daetails ");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(600, 80, 600, 40);
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Raleway", Font.BOLD, 22));
        l3.setBounds(300, 180, 100, 30);
        add(l3);


        String Religion[] = {"Hindu", "muslim", "Sikh", "Other"};
        ComboBox = new JComboBox(Religion);
        ComboBox.setBackground(new Color(252, 234, 76));
        ComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        ComboBox.setBounds(600, 180, 400, 30);
        add(ComboBox);


        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("Raleway", Font.BOLD, 22));
        l4.setBounds(300, 230, 200, 30);
        add(l4);

        String Category[] = {"General", "OBC", "SC", "ST"};
        ComboBox2 = new JComboBox(Category);
        ComboBox2.setBackground(new Color(252, 234, 76));
        ComboBox2.setFont(new Font("Raleway", Font.BOLD, 14));
        ComboBox2.setBounds(600, 230, 400, 30);
        add(ComboBox2);


        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("Raleway", Font.BOLD, 22));
        l5.setBounds(300, 280, 200, 30);
        add(l5);

        String income[] = {"Null", "<1,50,000", "2,50,000", "Above 10,00,000"};
        ComboBox3 = new JComboBox(income);
        ComboBox3.setBackground(new Color(252, 234, 76));
        ComboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        ComboBox3.setBounds(600, 280, 400, 30);
        add(ComboBox3);


        JLabel l6 = new JLabel("Education :");
        l6.setFont(new Font("Raleway", Font.BOLD, 22));
        l6.setBounds(300, 330, 130, 30);
        add(l6);

        String education[] = {"Marticulation", "Intermediate", "graduation", "PostGraduation"};
        ComboBox4 = new JComboBox(education);
        ComboBox4.setBackground(new Color(252, 234, 76));
        ComboBox4.setFont(new Font("Raleway", Font.BOLD, 14));
        ComboBox4.setBounds(600, 330, 400, 30);
        add(ComboBox4);

        JLabel l7 = new JLabel("Ocupation :");
        l7.setFont(new Font("Raleway", Font.BOLD, 22));
        l7.setBounds(300, 380, 130, 30);
        add(l7);

        String ocupation[] = {"Saleried", "Self-Employee", "Govt Emp", "Other"};
        ComboBox5 = new JComboBox(ocupation);
        ComboBox5.setBackground(new Color(252, 234, 76));
        ComboBox5.setFont(new Font("Raleway", Font.BOLD, 14));
        ComboBox5.setBounds(600, 380, 400, 30);
        add(ComboBox5);

        JLabel l8 = new JLabel("Pan Number :");
        l8.setFont(new Font("Raleway", Font.BOLD, 22));
        l8.setBounds(300, 430, 170, 30);
        add(l8);

        textPan = new JTextField();
        textPan.setBackground(new Color(255, 255, 255));
        textPan.setFont(new Font("Raleway", Font.BOLD, 14));
        textPan.setBounds(600, 430, 400, 30);
        add(textPan);

        JLabel l9 = new JLabel("Adhar Number :");
        l9.setFont(new Font("Raleway", Font.BOLD, 22));
        l9.setBounds(300, 480, 170, 30);
        add(l9);

        textAdhar = new JTextField();
        textAdhar.setBackground(new Color(255, 255, 255));
        textAdhar.setFont(new Font("Raleway", Font.BOLD, 14));
        textAdhar.setBounds(600, 480, 400, 30);
        add(textAdhar);


        JLabel l10 = new JLabel("Senior Citizen :");
        l10.setFont(new Font("Raleway", Font.BOLD, 22));
        l10.setBounds(300, 530, 200, 30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setBackground(new Color(252, 234, 76));
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBounds(600, 530, 70, 30);
        add(r1);


        r2 = new JRadioButton("No");
        r2.setBackground(new Color(252, 234, 76));
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBounds(700, 530, 50, 30);
        add(r2);



        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);



        JLabel l11 = new JLabel("Existing Account :");
        l11.setFont(new Font("Raleway", Font.BOLD, 22));
        l11.setBounds(300, 580, 200, 30);
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setBackground(new Color(252, 234, 76));
        e1.setFont(new Font("Raleway", Font.BOLD, 14));
        e1.setBounds(600, 580, 70, 30);
        add(e1);


        e2 = new JRadioButton("No");
        e2.setBackground(new Color(252, 234, 76));
        e2.setFont(new Font("Raleway", Font.BOLD, 14));
        e2.setBounds(700, 580, 50, 30);
        add(e2);



        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(e1);
        buttonGroup1.add(e2);




        JLabel l12 = new JLabel("Form No :");
        l12.setFont(new Font("Raleway", Font.BOLD, 22));
        l12.setBounds(900, 40, 130, 30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD, 22));
        l13.setBounds(1000, 40, 200, 30);
        add(l13);

        JButton next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 22));
        next.setBounds(900, 630, 90, 30);
        next.addActionListener(this);
        add(next);


        setLayout(null);
        setSize(500, 500);
        setLocation(450, 80);
        getContentPane().setBackground(new Color(252, 234, 76));
        setVisible(true);
    }

        @Override
        public void actionPerformed(ActionEvent e) {
        String rel=(String) ComboBox.getSelectedItem();
        String cate=(String) ComboBox2.getSelectedItem();
        String inc=(String) ComboBox3.getSelectedItem();
        String edu=(String) ComboBox4.getSelectedItem();
        String occ=(String) ComboBox5.getSelectedItem();

        String pan=textPan.getText();
        String adhar=textAdhar.getText();


        String scitizen=" ";
        if(r1.isSelected()){
            scitizen="yes";
        } else if (r2.isSelected()) {
            scitizen="No";

        }

        String eAccount=" ";
        if(r1.isSelected()){
            eAccount="yes";
        } else if (r2.isSelected()) {
            eAccount="No";

        }

        try{
            if (textAdhar.getText().equals(" ")|| textPan.getText().equals(" ")) {
                JOptionPane.showMessageDialog(null, "fill all the field");
            }else {
//                Con c1=new Con();
                ConnectToDb con=new ConnectToDb();
                String q="insert into signuptwo values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+adhar+"','"+scitizen+"','"+eAccount+"')";
                 con.statement.executeUpdate(q);
                 new AccountDetailsForm(formno);
                 setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();

        }


        }


    public static void main(String[] args) {
        new AdditionalDetailsForm("");
    }


}
