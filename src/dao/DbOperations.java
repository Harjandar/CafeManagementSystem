package dao;

import javax.swing.JOptionPane;
import java.sql.*;

public class DbOperations {
    
     public static ResultSet getData(String query) {
    try {
        Connection con = ConnectionProvider.getCon();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        return rs;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE);
        return null;
    }
    }

    
   public static void setDataorDelete(String Querry, String msg){
       try{
          Connection  con = ConnectionProvider.getCon();
          Statement st = con.createStatement();
          st.executeUpdate(Querry);
          if(!msg.equals(" "));
          JOptionPane.showMessageDialog(null, msg);
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,e, "Message",JOptionPane.ERROR_MESSAGE);
       }
   } 
   
 
}


   
    
   
