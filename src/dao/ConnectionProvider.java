package dao;
import java.sql.*;

public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root","root");
            return con;
        }
        catch(Exception e){
            e.printStackTrace();  
            return null;
        }
    }
    public static void main(String args[])
    {
        ConnectionProvider cp= new ConnectionProvider();
        cp.getCon();
    }
}
