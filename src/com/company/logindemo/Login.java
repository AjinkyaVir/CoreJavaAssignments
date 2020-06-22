package com.company.logindemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JLabel jUser, jPassword,jLabel;
    JTextField jTxtUser;
    JPasswordField jPasswordField;
    JButton jBtnLogin, jBtnCancel;
    JPanel jPanel,jPan1,jPan2,jPan3;

    public Login(){
        super("Login Page");
        jUser = new JLabel("Username");
        jPassword = new JLabel("Password");
        jTxtUser = new JTextField(15);
        jPasswordField = new JPasswordField(15);

        jBtnLogin = new JButton("Login");
        jBtnCancel = new JButton("Cancel");

       /* ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("com/company/icon/username144-144.png"));
        Image image = imageIcon.getImage().getScaledInstance(144,144,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);*/
       // jLabel = new JLabel(imageIcon1);

        jBtnLogin.addActionListener(this);
        jBtnCancel.addActionListener(this);

        setLayout(new BorderLayout());

        jPanel = new JPanel();
        jPan1 = new JPanel();
        jPan2 = new JPanel();
        jPan3 = new JPanel();

        //add(jLabel,BorderLayout.WEST);
        jPan1.add(jUser);
        jPan1.add(jTxtUser);
        jPan1.add(jPassword);
        jPan1.add(jPasswordField);
        add(jPan1,BorderLayout.CENTER);

        jPan3.add(jBtnLogin);
        jPan3.add(jBtnCancel);
        add(jPan3,BorderLayout.SOUTH);

        jPan1.setBackground(Color.WHITE);
        jPan3.setBackground(Color.WHITE);


        setSize(440,250);
        setLocation(600,400);
        setVisible(true);
        JFrame jFrame = new JFrame();
        jFrame.setResizable(false);



    }


    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Demo conn = new Demo();
            String user = jTxtUser.getText();
            String pass = jPasswordField.getText();
            //String login = "select * from login where username = '" + user + "' and password = '" + pass + "'";
            String query = "Select * from user Where username='" + user + "' and password='" + pass + "'";
            // String login = "select * from login where password =  + pass + ";
           // ResultSet resultSet = conn.statement.executeQuery(query);
         /*   if (resultSet.next()) {
                if (!resultSet.getBoolean(3)) {
                    System.out.println("Login successfully");

                    new Project().setVisible(true);


                } else {

                    System.out.println("Please login");
                    new Login().setVisible(true);


                }

                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Login");
                setVisible(false);
            }*/

           /* while (resultSet.next()){
                if (!resultSet.getBoolean("status")){

                    System.out.println("Login successfully");

                }else{
                    new Login().setVisible(true);
                }
            }*/

            this.setVisible(false);
        }catch (Exception e1){
            e1.printStackTrace();
            System.out.println("error: " + e1);
        }


    }

    public static void main(String[] args) {
       // loginDemo();
        new Login();
    }

    private static void loginDemo() {
        new Login().setVisible(true);
    }


}

