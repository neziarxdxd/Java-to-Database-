/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MY-PC
 */
public class NewClass {
  
    String url= "jdbc:mysql://localhost:3306/business001";    
    String selectAllData= "SELECT * FROM tbl_supplier";
    Connection con;
    Statement statement;

    public NewClass() throws SQLException{
        this.con= DriverManager.getConnection(url,"root","");
        this.statement= con.createStatement();        
    }
    public ArrayList GetAllData () {
        ArrayList<Data> data= new ArrayList();
        Data datas;        
        try { 
            ResultSet result=statement.executeQuery(selectAllData);
            while(result.next()){ 
                datas= new Data(result.getInt("SupplierID"), result.getString("SupplierName"), 
                        result.getString("ContactName"),result.getString("Address"),
                        result.getString("City"),result.getString("PostalCode") ,result.getString("Country"));
;               data.add(datas);
            }
        }
        catch(SQLException e){
        System.out.println("Error");
        }
        
        
        return data;
        
    }
    
    

    
   
    public void InsertData (String SupplierName, String ContactName, 
        String Address, String City, String Country, String PostalCode)throws SQLException{
        String insertSQL= "INSERT INTO tbl_supplier"+ "(SupplierName, ContactName, Address,"
        + " City, PostalCode,Country) VALUES ( '" +SupplierName+"','"
        +ContactName+"','"+Address+"','"+City+"','"+PostalCode+"','"+Country+"');";
        
        statement.execute(insertSQL);
        
    }
}
    

    
    

