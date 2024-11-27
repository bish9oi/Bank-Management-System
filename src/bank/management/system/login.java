package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {
//    button se action krane ke liye implements actionListener ka use
    JLabel label1 , label2 , label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1 , button2 , button3;

//    create one constructor
    login(){
        super("Bank Management System"); //super always top position

        // Image create
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100 , 100 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350 , 10 , 100 , 100);
        add(image);


        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100 , 100 , Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630 , 350 , 100 , 100);
        add(iimage);

        //        JLabel ka main kaam kisi text ko frame me show karana.
        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGrade" , Font.BOLD , 32));
        label1.setBounds(230 , 125 , 450 , 40);
        add(label1);

//        card design
        label2 = new JLabel("Card No:");
        label2.setFont(new Font("Ralway" , Font.BOLD , 22));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150 , 190 , 375 , 30);
        add(label2);

//        card NO. text field design
        textField2 = new JTextField(15);
        textField2.setBounds(325 , 190 , 230 , 30);
        textField2.setFont(new Font("Arial" , Font.BOLD , 14));
        add(textField2);

// PIN NO. design
        label3 = new JLabel("PIN:");
        label3.setFont(new Font("Ralway" , Font.BOLD , 22));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150 , 250 , 375 , 30);
        add(label3);

//       PIN Password field design
        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(325 , 250 , 230 , 30);
        passwordField3.setFont(new Font("Arial", Font.BOLD , 14));
        add(passwordField3);

//        sign in button design
        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial" , Font.BOLD , 14));
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        button1.setBounds(300 , 300 , 100  , 30);
        button1.addActionListener(this);
        add(button1);

// CLEAR button design
        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial" , Font.BOLD , 14));
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        button2.setBounds(430 , 300 , 100  , 30);
        button2.addActionListener(this);
        add(button2);

//        SIGN UP button design
        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Arial" , Font.BOLD , 14));
        button3.setBackground(Color.BLACK);
        button3.setForeground(Color.WHITE);
        button3.setBounds(300 , 350 , 230  , 30);
        button3.addActionListener(this);
        add(button3);

//        Design background image
        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850 , 480 , Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0 , 0 , 850 , 480);
        add(iiimage);

        setSize(750 , 480);  //create frame size one by one
        setUndecorated(true); // iski help se screen minimize maximize ka option gayab ho jayega
        setVisible(true);   // frame ko show krane ke liye setVisible ka use
        setLocation(400 , 100);     //frame ki location set
    }

//    ActionListener se error hatane ke liye override ka use

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == button1){
                cone c = new cone();
                String cardno = textField2.getText();
                String pin = passwordField3.getText();
                String q = "select * from login where card_number = '"+cardno+"' and pin = '"+pin+"'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if(resultSet.next()){
                    setVisible(false);
                    new main_class(pin);
                }else{
                    JOptionPane.showMessageDialog(null , "Incorrect Card Number or PIN");
                }
            }else if(e.getSource() == button2){
                textField2.setText("");
                passwordField3.setText("");
            }else if(e.getSource() ==  button3){
                new SignUp();
                setVisible(false);
            }
        } catch (Exception E) {
//            throw new RuntimeException(E);
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        create one object
        new login();
    }
}
