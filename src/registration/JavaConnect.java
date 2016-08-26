package registration;


import java.sql.*;
import javax.swing.*;

public class JavaConnect {
    Connection conn=null;
    public static Connection connector1(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection c=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Roshan Posakya\\Documents\\NetBeansProjects\\Registration\\Registration.sqlite");
            JOptionPane.showMessageDialog(null, "Connection Established");
            return c;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
            
        }
    }
    

