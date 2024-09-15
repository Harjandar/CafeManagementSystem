package dao;

import javax.swing.JOptionPane;

public class tables {
    public static void main(String args[]){
        try{
            String UserTable="create table user(id int AUTO_INCREMENT primary key, name varchar(200), email varchar(200) UNIQUE, mobileNumber varchar(11), address varchar(200), password varchar(200), securityQuestion varchar(200), answer varchar(200), status varchar(20))";
            String CategoryTable="create table category(id int AUTO_INCREMENT primary key,name varchar(200))";
            String productTable="create table product (id int AUTO_INCREMENT primary key, name varchar(200), category varchar(200),price varchar(200))";
            String billTable="CREATE TABLE bill ( id INT PRIMARY KEY, name VARCHAR(200),mobileNumber VARCHAR(200),email VARCHAR(200),date VARCHAR(200),total VARCHAR(200),createdBy varchar(200))";
            DbOperations.setDataorDelete(UserTable, "User table created successfully");
            DbOperations.setDataorDelete(CategoryTable, "Category table created successfully");
            DbOperations.setDataorDelete(productTable, "Product table created successfully");
            DbOperations.setDataorDelete(billTable, "Bill table created successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
