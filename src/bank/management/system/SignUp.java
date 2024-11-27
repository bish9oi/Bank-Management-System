//package bank.management.system;
//
//import com.toedter.calendar.JDateChooser;
//
//import javax.swing.*;
//import java.awt.*;
//import java.util.Random;
//
//public class SignUp extends JFrame {
//    JButton next; // It means button ko globally declare krna
//    JRadioButton r1 , r2 , m1 , m2 , m3; // radio button use gender choose
//    JTextField textName , textFname , textEmail , textAdd , textcity , textCity,textstate;
//    JDateChooser dateChooser;
//    Random ran = new Random();
//    long first4 = (ran.nextLong()%9000L) + 1000L;
//    String first = " " + Math.abs(first4);
//    contructor create
//    SignUp(){
//        super("APPLICATION FORM"); // super ki help se main heading dete hai
//
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
//        Image i2 = i1.getImage().getScaledInstance(100 , 100 , Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(25 , 10 , 100 , 100);
//        add(image);
//
//        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
//        label1.setBounds(160 , 20 , 600 , 40);
//        label1.setFont(new Font("Raleway" , Font.BOLD , 38));
//        add(label1);
//
//        JLabel label2 = new JLabel("Page 1");
//        label2.setFont(new Font("Raleway" , Font.BOLD , 22));
//        label2.setBounds(330 , 70 , 600 , 30);
//        add(label2);
//
//        JLabel label3 = new JLabel("Personal Details");
//        label3.setFont(new Font("Raleway" , Font.BOLD , 22));
//        label3.setBounds(290 , 90 , 600 ,30);
//        add(label3);
//
//        JLabel labelname = new JLabel("Name :");
//        labelname.setFont(new Font("Raleway" , Font.BOLD , 20));
//        labelname.setBounds(100 , 190 , 100 , 30);
//        add(labelname);
//
//    name input field create
//        textName = new JTextField();
//        textName.setFont(new Font("Raleway" , Font.BOLD , 14));
//        textName.setBounds(300 , 190 , 400 , 30);
//        add(textName);
//
//
//
//        JLabel labelfname = new JLabel("Father's Name :");
//        labelfname.setFont(new Font("Raleway" , Font.BOLD , 20));
//        labelfname.setBounds(100 , 240 , 200 , 30);
//        add(labelfname);
//
//        name input field create
//        textFname = new JTextField();
//        textFname.setFont(new Font("Raleway" , Font.BOLD , 14));
//        textFname.setBounds(300 , 240 , 400 , 30);
//        add(textFname);
//
//
//        JLabel DOB = new JLabel("Date of Birth :");
//        DOB.setFont(new Font("Raleway" , Font.BOLD , 20));
//        DOB.setBounds(100 , 340 , 200 , 30);
//        add(DOB);
//
//        dateChooser = new JDateChooser();
//        dateChooser.setForeground(new Color(105 , 105 , 105));
//        dateChooser.setBounds(300 , 340 , 400  , 30);
//        add(dateChooser);
//
//        gender format create
//        JLabel labelG = new JLabel("Gender :");
//        labelG.setFont(new Font("Raleway" , Font.BOLD , 20));
//        labelG.setBounds(100 , 290 ,200 ,30);
//        add(labelG);
//
//        r1 = new JRadioButton("Male");
//        r1.setFont(new Font("Raleway" , Font.BOLD , 14));
//        r1.setBackground(new Color(222 , 255 , 228));
//        r1.setBounds(300 , 290 , 60 , 30);
//        add(r1);
//
//        r2 = new JRadioButton("Female");
//        r2.setBackground(new Color(222 , 255 , 228));
//        r2.setFont(new Font("Raleway" , Font.BOLD , 14));
//        r2.setBounds(450 , 290 , 90 , 30);
//        add(r2);
//
//        buttonGroup ki help se ek time me ek hi gender ko select kr sakte hai
//        ButtonGroup buttonGroup = new ButtonGroup();
//        buttonGroup.add(r1);
//        buttonGroup.add(r2);
//
//        JLabel labelEmail = new JLabel("Email address :");
//        labelEmail.setFont(new Font("Raleway" , Font.BOLD , 20));
//        labelEmail.setBounds(100 , 390 , 200 , 30);
//        add(labelEmail);
//
//
//        textEmail = new JTextField();
//        textEmail.setFont(new Font("Raleway" , Font.BOLD , 14));
//        textEmail.setBounds(300 , 390 , 400 , 30);
//        add(textEmail);
//
//
//       married status
//        JLabel labelMs = new JLabel("Marital Status:");
//        labelMs.setFont(new Font("Raleway" , Font.BOLD , 20));
//        labelMs.setBounds(100 , 440 , 200 , 30);
//        add(labelMs);
//
//
//        m1 = new JRadioButton("Married");
//        m1.setBounds(300 , 440 , 100 , 30);
//        m1.setBackground(new Color(222 , 255 , 228));
//        m1.setFont(new Font("Raleway" , Font.BOLD , 14));
//        add(m1);
//
//        m2 = new JRadioButton("Unmarried");
//        m2.setBounds(450 , 440 , 100 , 30);
//        m2.setBackground(new Color(222 , 255 , 228));
//        m2.setFont(new Font("Raleway" , Font.BOLD , 14));
//        add(m2);
//
//        m3 = new JRadioButton("Other");
//        m3.setBounds(635 , 440 , 100 , 30);
//        m3.setBackground(new Color(222 , 255 , 228));
//        m3.setFont(new Font("Raleway" , Font.BOLD , 14));
//        add(m3);
//
//        group the button
//        ButtonGroup buttonGroup1 = new ButtonGroup();
//        buttonGroup1.add(m1);
//        buttonGroup1.add(m2);
//        buttonGroup1.add(m3);
//
//
//
//        Address create
//        JLabel labelAdd = new JLabel("Address :");
//        labelAdd.setFont(new Font("Raleway" , Font.BOLD , 20));
//        labelAdd.setBounds(100 , 490 , 200 , 30);
//        add(labelAdd);
//
//
//        textAdd = new JTextField();
//        textAdd.setFont(new Font("Raleway" , Font.BOLD , 14));
//        textAdd.setBounds(300 , 490 , 400 , 30);
//        add(textAdd);
//
//        City choose
//        JLabel labelCity = new JLabel("City :");
//        labelCity.setFont(new Font("Raleway" , Font.BOLD , 20));
//        labelCity.setBounds(100 , 540 , 200 , 30);
//        add(labelCity);
//
//
//        textcity = new JTextField();
//        textcity.setFont(new Font("Raleway" , Font.BOLD , 14));
//        textcity.setBounds(300 , 540 , 400 , 30);
//        add(textcity);
//
//
//        Pin code
//        JLabel labelPin = new JLabel("Pin Code :");
//        labelPin.setFont(new Font("Raleway" , Font.BOLD , 20));
//        labelPin.setBounds(100 , 590 , 200 , 30);
//        add(labelPin);
//
//
//        textCity = new JTextField();
//        textCity.setFont(new Font("Raleway" , Font.BOLD , 14));
//        textCity.setBounds(300 , 590 , 400 , 30);
//        add(textCity);
//
//        State Choose
//        JLabel labelState = new JLabel("State :");
//        labelState.setFont(new Font("Raleway" , Font.BOLD , 20));
//        labelState.setBounds(100 , 640 , 200 , 30);
//        add(labelState);
//
//
//        textstate = new JTextField();
//        textstate.setFont(new Font("Raleway" , Font.BOLD , 14));
//        textstate.setBounds(300 , 640 , 400 , 30);
//        add(textstate);
//
//
//        next button create
//        next = new JButton("Next");
//        next.setFont(new Font("Raleway" , Font.BOLD , 14));
//        next.setBackground(Color.BLACK);
//        next.setForeground(Color.white);
//        next.setBounds(620 , 710 , 80 ,30);
//        next.setBounds(730 , 630 , 80 ,30);
//        add(next);
//
//
//
//
//        getContentPane().setBackground(new Color(222 , 255 , 228));
//        setLayout(null);
//        setSize(850 , 800);
//       setSize(700 , 750);
//        setLocation(360  , 40);
//        setVisible(true);
//    }
//    public static void main(String[] args) {
//       new SignUp(); //object create
//    }
//}





package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp extends JFrame implements ActionListener {
    JButton next;
    JRadioButton r1, r2, m1, m2, m3;
    JTextField textName, textFname, textEmail, textAdd, textcity, textPin, textState;
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    SignUp() {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(20, 10, 80, 80);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(120, 20, 600, 30);
        label1.setFont(new Font("Raleway", Font.BOLD, 24));
        add(label1);

        JLabel label2 = new JLabel("Page 1: Personal Details");
        label2.setFont(new Font("Raleway", Font.BOLD, 18));
        label2.setBounds(200, 60, 400, 30);
        add(label2);

        addLabelAndField("Name:", 100, 120, 200, 30, textName = new JTextField());
        addLabelAndField("Father's Name:", 100, 170, 200, 30, textFname = new JTextField());
        addLabelAndField("Date of Birth:", 100, 220, 200, 30, dateChooser = new JDateChooser());

        JLabel labelG = new JLabel("Gender:");
        labelG.setFont(new Font("Raleway", Font.BOLD, 16));
        labelG.setBounds(100, 270, 100, 30);
        add(labelG);

        r1 = createRadioButton("Male", 300, 270, 80, 30);
        r2 = createRadioButton("Female", 400, 270, 100, 30);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(r1);
        genderGroup.add(r2);

        addLabelAndField("Email Address:", 100, 320, 200, 30, textEmail = new JTextField());

        JLabel labelMs = new JLabel("Marital Status:");
        labelMs.setFont(new Font("Raleway", Font.BOLD, 16));
        labelMs.setBounds(100, 370, 200, 30);
        add(labelMs);

        m1 = createRadioButton("Married", 300, 370, 100, 30);
        m2 = createRadioButton("Unmarried", 400, 370, 120, 30);
        m3 = createRadioButton("Other", 530, 370, 80, 30);
        ButtonGroup maritalStatusGroup = new ButtonGroup();
        maritalStatusGroup.add(m1);
        maritalStatusGroup.add(m2);
        maritalStatusGroup.add(m3);

        addLabelAndField("Address:", 100, 420, 200, 30, textAdd = new JTextField());
        addLabelAndField("City:", 100, 470, 200, 30, textcity = new JTextField());
        addLabelAndField("Pin Code:", 100, 520, 200, 30, textPin = new JTextField());
        addLabelAndField("State:", 100, 570, 200, 30, textState = new JTextField());

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
//        next.setBounds(580, 620, 100, 30);
        next.setBounds(580, 605, 100, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(750, 680);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formNo = first;
        String name = textName.getName();
        String fname = textFname.getName();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }
        String email = textEmail.getText();
        String marital = null;
        if(m1.isSelected()){
            marital = "Married";
        } else if (m2.isSelected()) {
            marital = "Unmarried";
        } else if (m3.isSelected()) {
            marital = "Other";
        }
        String address = textAdd.getText();
        String city = textcity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();


        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null , "Fill all the field");
            }else{
                cone con = new cone();
                String q = "insert into signup values('"+formNo+"' , '"+name+"' , '"+fname+"' , '"+dob+"' , '"+gender+"' , '"+email+"' , '"+marital+"' , '"+address+"' , '"+city+"' , '"+pincode+"' , '"+state+"')";
                con.statement.executeUpdate(q);
                new signup2(formNo);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    private void addLabelAndField(String labelText, int x, int y, int width, int height, JComponent field) {
        JLabel label = new JLabel(labelText);
        label.setFont(new Font("Raleway", Font.BOLD, 16));
        label.setBounds(x, y, width, height);
        add(label);

        field.setFont(new Font("Raleway", Font.PLAIN, 14));
        field.setBounds(300, y, 400, height);
        add(field);
    }

    private JRadioButton createRadioButton(String text, int x, int y, int width, int height) {
        JRadioButton radioButton = new JRadioButton(text);
        radioButton.setFont(new Font("Raleway", Font.PLAIN, 14));
        radioButton.setBackground(new Color(222, 255, 228));
        radioButton.setBounds(x, y, width, height);
        add(radioButton);
        return radioButton;
    }

    public static void main(String[] args) {
        new SignUp();
    }
}
