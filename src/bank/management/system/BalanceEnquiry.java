package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {
    JLabel label2;
    String pin;
    JButton b1;
//    String pin;
    BalanceEnquiry(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1290 , 640 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1290 ,640 );
        add(l3);

        JLabel label1 = new JLabel("Your Current Balance is Rs.");
        label1.setForeground(Color.white);
        label1.setFont(new Font("System" , Font.BOLD , 16));
        label1.setBounds(360 , 110 , 700 , 35);
        l3.add(label1);

         label2 = new JLabel();
        label2.setForeground(Color.white);
        label2.setFont(new Font("System" , Font.BOLD , 16));
        label2.setBounds(360 , 140 , 400 , 35);
        l3.add(label2);

        b1 = new JButton("Back");
        b1.setBounds(570,278,130,30);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        l3.add(b1);

        int balance = 0;
        try {
            cone c = new cone();
            ResultSet resultSet = c.statement.executeQuery("Select * from bank where pin = '"+pin+"'");

            while (resultSet.next()){
                if (resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));

                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        } catch (Exception E) {
            E.printStackTrace();;
        }
        label2.setText(""+balance);


        setSize(1290 , 690);
        setLocation(0,0);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new main_class(pin);
    }

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }

}
