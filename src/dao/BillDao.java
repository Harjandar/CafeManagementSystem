/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.util.*;
import java.sql.*;
import javax.swing.*;
import model.Bill;
public class BillDao
{
    public static ArrayList<Bill> getAllRecordsByInc(String date)
    {
        ArrayList<Bill> arraylist=new ArrayList<>();
        try
        {
            ResultSet rs=DbOperations.getData("select * from bill where date like '%"+date+"%'");
            
            while(rs.next())
            {
                Bill bill= new Bill();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("name"));
                bill.setMobileNumber(rs.getString("mobileNumber"));
                bill.setEmail(rs.getString("email"));
                bill.setDate(rs.getString("date"));
                bill.setTotal(rs.getString("total"));
                bill.setCreatedBy(rs.getString("createdBy"));
                arraylist.add(bill);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        return arraylist;
    }
    
    public static ArrayList<Bill> getAllRecordsByDesc(String date)
    {
        ArrayList<Bill> arraylist=new ArrayList<>();
        try
        {
            ResultSet rs=DbOperations.getData("select * from bill where date like '%"+date+"%' order by id DESC");
            
            while(rs.next())
            {
                Bill bill= new Bill();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("name"));
                bill.setMobileNumber(rs.getString("mobileNumber"));
                bill.setEmail(rs.getString("email"));
                bill.setDate(rs.getString("date"));
                bill.setTotal(rs.getString("total"));
                bill.setCreatedBy(rs.getString("createdBy"));
                arraylist.add(bill);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        return arraylist;
    }
    
    public static String getID(){
    int id = 1;
    try{
        ResultSet rs = DbOperations.getData("select max(id) from bill");
        if(rs.next()){
            id = rs.getInt(1);
            id = id+1;
        }
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
        return String.valueOf(id);
    }
    public static void save(Bill bill){
        String query = "insert into bill values ('"+bill.getId()+"','"+bill.getName()+"','"+bill.getMobileNumber()+"','"+bill.getEmail()+"','"+bill.getDate()+"','"+bill.getTotal()+"','"+bill.getCreatedBy()+"')";
        DbOperations.setDataorDelete(query, "Bill Details Added Successfully");
    }
}
