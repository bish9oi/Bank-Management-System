package bank.management.system;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
import java.sql.*;
public class cone {
    Connection connection;
    Statement statement;

    public  cone(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem" , "root" , "Ravi@1234");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
