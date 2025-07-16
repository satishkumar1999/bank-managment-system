package com.satish.banking;

//import java.beans.Statement;
import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.Statement;
//import java.sql.SQLException;

public class ConnectToDb {
    Connection connection;
    Statement statement;
    public ConnectToDb(){
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3307/bankSystem","root","NewSecurePassword!");
            statement=  connection.createStatement();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
