package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    //frame ka use kr rhe hai to class ko extends krana padega
    JButton b1 , b2 , b3 , b4 , b5 , b6, b7;
    String pin;
    FastCash(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1290 , 640 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1290 ,640 );
        add(l3);

        JLabel label = new JLabel("SELECT WITHDRAWL AMOUNT");
        label.setForeground(Color.white);
        label.setFont(new Font("System" , Font.BOLD , 15));
        label.setBounds(400 , 120 , 700 ,35);
        l3.add(label);

        b1 = new JButton("Rs. 100");
        b1.setBounds(340,206,150,30);
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(65,125,128));
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("Rs. 500");
        b2.setBounds(560,206,150,30);
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(65,125,128));
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("Rs. 1000");
        b3.setBounds(340,243,150,30);
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(65,125,128));
        b3.addActionListener(this);
        l3.add(b3);


        b4 = new JButton("Rs. 2000");
        b4.setBounds(560,244,150,30);
        b4.setForeground(Color.WHITE);
        b4.addActionListener(this);
        b4.setBackground(new Color(65,125,128));
        l3.add(b4);

        b5 = new JButton("Rs. 5000");
        b5.setBounds(340,278,150,30);
        b5.setForeground(Color.WHITE);
        b5.addActionListener(this);
        b5.setBackground(new Color(65,125,128));
        l3.add(b5);

        b6 = new JButton("Rs. 10000");
        b6.setBounds(560,278,150,30);
        b6.setForeground(Color.WHITE);
        b6.addActionListener(this);
        b6.setBackground(new Color(65,125,128));
        l3.add(b6);


        b7 = new JButton("BACK");
        b7.setBounds(340,315,150,30);
        b7.setForeground(Color.WHITE);
        b7.addActionListener(this);
        b7.setBackground(new Color(65,125,128));
        l3.add(b7);



        setLayout(null);
        setSize(1290,690);
        setVisible(true);
        setLocation(0,0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b7){
            setVisible(false);
            new main_class(pin);
        }else {
            String amount = ((JButton)e.getSource()).getText().substring(4);
//            databse connection
            cone  c = new cone();
            Date date = new Date();


            try {
                ResultSet resultSet = c.statement.executeQuery("Select * from bank where pin = '"+pin+"'");
                int balance = 0;
                while (resultSet.next()){
                    if (resultSet.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    } else{
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }
                String num = "17";

                if(e.getSource() != b7 && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null  , "Insuffient Balance");
                    return;
                }
                c.statement.executeUpdate("insert into bank values('"+pin+"' , '"+date+"' , 'Withdrawl' ,'"+amount+"')");
                JOptionPane.showMessageDialog(null , "Rs. "+amount+"   Debited Successfully");


            } catch (Exception E) {
                E.printStackTrace();
            }
            setVisible(false);
            new main_class(pin);
        }

    }

    public static void main(String[] args) {
        new FastCash("");
    }
}
