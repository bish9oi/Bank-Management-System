package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_class extends JFrame implements ActionListener {
    JButton b1, b2,b3,b4,b5,b6,b7;
    String pin;
    main_class(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1290 , 640 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1290 ,640 );
        add(l3);

        JLabel label = new JLabel("Please Select Your Transaction");
        label.setForeground(Color.white);
        label.setFont(new Font("System" , Font.BOLD , 20));
        label.setBounds(380 , 120 , 700 ,35);
        l3.add(label);

        b1 = new JButton("DEPOSIT");
        b1.setBounds(340,206,150,30);
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(65,125,128));
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("CASH WITHDRAWL");
        b2.setBounds(560,206,150,30);
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(65,125,128));
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("FAST CASH");
        b3.setBounds(340,243,150,30);
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(65,125,128));
        b3.addActionListener(this);
        l3.add(b3);


        b4 = new JButton("MINI STATEMENT");
        b4.setBounds(560,244,150,30);
        b4.setForeground(Color.WHITE);
        b4.addActionListener(this);
        b4.setBackground(new Color(65,125,128));
        l3.add(b4);

        b5 = new JButton("PIN CHANGE");
        b5.setBounds(340,278,150,30);
        b5.setForeground(Color.WHITE);
        b5.addActionListener(this);
        b5.setBackground(new Color(65,125,128));
        l3.add(b5);

        b6 = new JButton("BALANCE ENQUIRY");
        b6.setBounds(560,278,150,30);
        b6.setForeground(Color.WHITE);
        b6.addActionListener(this);
        b6.setBackground(new Color(65,125,128));
        l3.add(b6);


        b7 = new JButton("EXIT");
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
        if(e.getSource()==b1){
            new Deposit(pin);
            setVisible(false);
        } else if (e.getSource()==b7) {
            System.exit(0);
        } else if (e.getSource()==b2) {
            new Withdrawl(pin);
            setVisible(false);
        } else if (e.getSource()==b6) {
            new BalanceEnquiry(pin);
            setVisible(false);
        } else if (e.getSource()==b3) {
            new FastCash(pin);
            setVisible(false);
        } else if (e.getSource()==b5) {
            new Pin(pin);
            setVisible(false);
        } else if (e.getSource()==b4) {
            new mini(pin);
        }
    }

    public static void main(String[] args) {
        new main_class("");
    }
}
