package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin extends JFrame implements ActionListener {
    JButton b1,b2;
    JPasswordField p1,p2;
    String pin;
    Pin(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1290 , 640 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1290 ,640 );
        add(l3);

        JLabel label1 = new JLabel("CHANGE YOUR PIN");
        label1.setForeground(Color.white);
        label1.setFont(new Font("System" , Font.BOLD , 16));
        label1.setBounds(380 , 130 , 400 , 35);
        l3.add(label1);

        JLabel label2 = new JLabel("New PIN");
        label2.setForeground(Color.white);
        label2.setFont(new Font("System" , Font.BOLD , 16));
        label2.setBounds(350 , 170 , 400 , 35);
        l3.add(label2);


        p1 = new JPasswordField();
        p1.setBackground(new Color(141, 169, 170));
        p1.setForeground(Color.white);
        p1.setBounds(500 , 170 , 200 , 35);
        p1.setFont(new Font("Raleway" , Font.BOLD , 18));
        l3.add(p1);

        JLabel label3 = new JLabel("Re-Enter New PIN");
        label3.setForeground(Color.white);
        label3.setFont(new Font("System" , Font.BOLD , 16));
        label3.setBounds(350 , 220 , 200 , 35);
        l3.add(label3);


        p2 = new JPasswordField();
        p2.setBackground(new Color(141, 169, 170));
        p2.setForeground(Color.white);
        p2.setBounds(500 , 220 , 200 , 35);
        p2.setFont(new Font("Raleway" , Font.BOLD , 18));
        l3.add(p2);


        b1 = new JButton("CHANGE");
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


        setSize(1550 , 1080);
        setLayout(null);
        setLocation(0 , 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String pin1 = p1.getText();
            String pin2 = p2.getText();

            if (!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null , "Entered PIN does not match");
                return;
            }
            if (e.getSource()==b1){
                if (p1.getText().equals("")){
                    JOptionPane.showMessageDialog(null , "Enter New PIN");
                    return;
                }
                if (p2.getText().equals("")){
                    JOptionPane.showMessageDialog(null , "Re-Enter New PIN");
                    return;
                }
                cone c = new cone();
                String q1 = "Update bank set pin = '"+pin1+"'  where pin = '"+pin+"'  ";
                String q2 = "Update login set pin = '"+pin1+"'  where pin = '"+pin+"'  ";
                String q3 = "Update signupthree set pin = '"+pin1+"'  where pin = '"+pin+"'  ";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null , "PIN Changed Successfully");

                setVisible(false);
                new main_class(pin);
            } else if (e.getSource()==b2) {
                new main_class(pin);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Pin("");
    }
}
