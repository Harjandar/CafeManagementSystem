
package dao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Category;
import java.sql.*;

public class Categorydao
{
    public static void save(Category category)
    {
        String query="insert into category (name) values('"+category.getName()+"') ";
        DbOperations.setDataorDelete(query,"Category Added Successfully");
    }
    
    public static ArrayList<Category> getAllRecord()
    {
        ArrayList<Category> arraylist=new ArrayList<>();
        try
        {
            ResultSet rs =DbOperations.getData("select * from category");
            while(rs.next())
            {
                Category category=new Category();
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));
                arraylist.add(category);
            }  
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return arraylist;
    }
    
    public static void delete(String id)
    {
        String query="delete from category where id= +'"+id+"'";
        DbOperations.setDataorDelete(query,"Category Succefully deleted");
    }
}

