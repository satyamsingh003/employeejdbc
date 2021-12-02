import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class emp1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        try{Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
            System.out.println("Connection established successfully");
        }
        catch (Exception e){
            System.out.println("Connection could not be established successfully");
        }
}}
