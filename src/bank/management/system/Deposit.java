package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    TextField textField;
    JButton b1,b2;
    Deposit(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1290 , 640 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1290 ,640 );
        add(l3);

        JLabel label1 = new JLabel("ENTER AMMOUNT YOU WANT TO DEPOSIT");
        label1.setForeground(Color.white);
        label1.setFont(new Font("System" , Font.BOLD , 16));
        label1.setBounds(360 , 130 , 400 , 35);
        l3.add(label1);

        textField = new TextField();
        textField.setBackground(new Color(141, 169, 170));
        textField.setForeground(Color.white);
        textField.setBounds(360 , 170 , 320 , 25);
        textField.setFont(new Font("Raleway" , Font.BOLD , 22));
        l3.add(textField);

        b1 = new JButton("DEPOSIT");
        b1.setBounds(610,278,100,30);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(610,316,100,28);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        l3.add(b2);


        setSize(1290 , 690);
        setLocation(0,0);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String amount = textField.getText();
            Date date = new Date();
            if(e.getSource()==b1){
                if(textField.getText().equals("")){
                    JOptionPane.showMessageDialog(null , "Please enter the amount you want to deposit");
                }else {
                    cone c = new cone();
                    c.statement.executeUpdate("insert into bank values ('"+pin+"', '"+date+"', 'Deposit' , '"+amount+"')");
                    JOptionPane.showMessageDialog(null , "Rs. "+amount+" Deposited Successfully");
                    setVisible(false);
                    new main_class(pin);
                }
            } else if (e.getSource()==b2) {
                setVisible(false);
                new main_class(pin);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Deposit("");
    }
}
