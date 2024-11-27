package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup2 extends JFrame implements ActionListener{
    String formno;
    JTextField textPan , textAadhar;
    JButton next;
    JRadioButton r1, r2 , r3 , r4;
    JComboBox comboBox , comboBox2 , comboBox3 , comboBox4 , comboBox5;
    signup2(String formno){
        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100 , 100 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150 , 5 , 100 , 100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2 :-");
        l1.setFont(new Font("Raleway" , Font.BOLD , 22));
        l1.setBounds(300 , 30 ,600 , 40);
//        l1.setBounds(300 , 150 ,600 , 40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway" , Font.BOLD , 22));
        l2.setBounds(300 , 60 ,600 , 40);
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Raleway" , Font.BOLD , 18));
        l3.setBounds(100 , 120 , 100 ,30);
        add(l3);

        String religion[]= {"Hindu" , "Muslim" , "Sikh" , "Christian" , "Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252 , 208 , 76));
        comboBox.setFont(new Font("Raleway" , Font.BOLD , 14));
        comboBox.setBounds(350 , 120 , 320 , 30);
        add(comboBox);



        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("Raleway" , Font.BOLD , 18));
        l4.setBounds(100 , 170 , 100 ,30);
        add(l4);

        String Category[]= {"General" , "OBC" , "SC" , "ST" , "Other"};
        comboBox2 = new JComboBox(Category);
        comboBox2.setBackground(new Color(252 , 208 , 76));
        comboBox2.setFont(new Font("Raleway" , Font.BOLD , 14));
        comboBox2.setBounds(350 , 170 , 320 , 30);
        add(comboBox2);


        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("Raleway" , Font.BOLD , 18));
        l5.setBounds(100 , 220 , 100 ,30);
        add(l5);

        String income[]= {"Null" , "<1,50,000" , "<2,50,000" , "5,00,000" , "up to 10 lakh"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(252 , 208 , 76));
        comboBox3.setFont(new Font("Raleway" , Font.BOLD , 14));
        comboBox3.setBounds(350 , 220 , 320 , 30);
        add(comboBox3);



        JLabel l6 = new JLabel("Educational :");
        l6.setFont(new Font("Raleway" , Font.BOLD , 18));
        l6.setBounds(100 , 270 , 150 ,30);
        add(l6);

        String education[]= {"Non-Graduate" , "Graduate" , "Post-Graduate" , "Doctrate" , "Other"};
        comboBox4 = new JComboBox(education);
        comboBox4.setBackground(new Color(252 , 208 , 76));
        comboBox4.setFont(new Font("Raleway" , Font.BOLD , 14));
        comboBox4.setBounds(350 , 270 , 320 , 30);
        add(comboBox4);


        JLabel l7 = new JLabel("Occupation :");
        l7.setFont(new Font("Raleway" , Font.BOLD , 18));
        l7.setBounds(100 , 320 , 150 ,30);
        add(l7);

        String occupation[]= {"Salaried" , "Self-Employed" , "Business" , "Student" , "Retired" , "Other"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBackground(new Color(252 , 208 , 76));
        comboBox5.setFont(new Font("Raleway" , Font.BOLD , 14));
        comboBox5.setBounds(350 , 320 , 320 , 30);
        add(comboBox5);


        JLabel l8 = new JLabel("PAN Number :");
        l8.setFont(new Font("Raleway" , Font.BOLD , 18));
        l8.setBounds(100 , 360 , 150 ,30);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway" , Font.BOLD , 18));
        textPan.setBounds(350 , 360 , 320 ,30);
        add(textPan);



        JLabel l9 = new JLabel("Aadhar Number :");
        l9.setFont(new Font("Raleway" , Font.BOLD , 18));
        l9.setBounds(100 , 400 , 150 ,30);
        add(l9);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Raleway" , Font.BOLD , 18));
        textAadhar.setBounds(350 , 400 , 320 ,30);
        add(textAadhar);



        JLabel l10 = new JLabel("Senior Citizen :");
        l10.setFont(new Font("Raleway" , Font.BOLD , 18));
        l10.setBounds(100 , 435 , 180 ,30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway" , Font.BOLD , 14));
        r1.setBackground(new Color(252 , 208 , 76));
        r1.setBounds(350 , 435 , 100 , 30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway" , Font.BOLD , 14));
        r2.setBackground(new Color(252 , 208 , 76));
        r2.setBounds(460 , 435 , 100 , 30);
        add(r2);



        JLabel l11 = new JLabel("Existing Account :");
        l11.setFont(new Font("Raleway" , Font.BOLD , 18));
        l11.setBounds(100 , 460 , 180 ,30);
        add(l11);

        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Raleway" , Font.BOLD , 14));
        r3.setBackground(new Color(252 , 208 , 76));
        r3.setBounds(350 , 460 , 100 , 30);
        add(r3);

        r4 = new JRadioButton("No");
        r4.setFont(new Font("Raleway" , Font.BOLD , 14));
        r4.setBackground(new Color(252 , 208 , 76));
        r4.setBounds(460 , 460 , 100 , 30);
        add(r4);




        JLabel l12 = new JLabel("Form No :");
        l12.setFont(new Font("Raleway" , Font.BOLD , 18));
        l12.setBounds(540 , 10 , 100 ,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway" , Font.BOLD , 14));
        l13.setBounds(630 , 10 , 100 ,30);
        add(l13);


        next = new JButton("Next");
        next.setFont(new Font("Raleway" , Font.BOLD , 14));
        next.setBounds(570 , 500 , 100 , 30);
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.addActionListener(this);
        add(next);


        setLayout(null);
//        setSize(850 , 750);
        setSize(750 , 580);
        setLocation(350 , 80);
        getContentPane().setBackground(new Color(252 , 208 , 76));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occu = (String) comboBox5.getSelectedItem();

        String pan = textPan.getText();
        String aadhar = textAadhar.getText();

        String scitizen = "";
        if(r1.isSelected()){
            scitizen = "Yes";
        } else if (r2.isSelected()) {
            scitizen = "No";
        }

        String eAccount = "";
        if(r1.isSelected()){
            eAccount = "Yes";
        } else if (r2.isSelected()) {
            eAccount = "No";
        }
        try{
            if(textPan.getText().equals("") || textAadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null , "Fill All the field");
            }else{
                cone c1 = new cone();
                String q = "insert into SignUptwo values('"+formno+"' , '"+rel+"' , '"+cate+"' ,'"+inc+"', '"+edu+"','"+occu+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eAccount+"')";
                c1.statement.executeUpdate(q);
                new signup3(formno);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }




    }

    public static void main(String[] args) {
        new signup2("");
    }
}

