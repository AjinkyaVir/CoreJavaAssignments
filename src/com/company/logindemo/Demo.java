package com.company.logindemo;

import java.sql.*;

public class Demo {
   /* public Statement statement;
    Demo(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/logindata","root","root");

           statement = connection.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }*/

   public static void main(String[] args) throws ClassNotFoundException, SQLException {
       Class.forName("com.mysql.jdbc.Driver");
       Connection connection = DriverManager.getConnection
               ("jdbc:mysql://localhost:3306/logindata","root","root");

       Statement  statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from user");
       /* while (resultSet.next()){

            if (resultSet.getBoolean("status")){

                System.out.println("Login successfully");
                new Project().setVisible(true);
            }else{
                System.out.println("Please login");
                new Login().setVisible(true);
                statement.executeUpdate("update user set status = true");
            }

        }
*/

       while (resultSet.next()){

           boolean status = resultSet.getBoolean("status");
           if (status){
               new Project().setVisible(true);
           }else
               new Login().setVisible(true);



       }

    }}


