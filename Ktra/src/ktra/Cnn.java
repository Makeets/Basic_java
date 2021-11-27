/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktra;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author Thang
 */
public class Cnn  {
    Connection cn=null;
    public Connection getConnection() {
        String url="jdbc:mysql://localhost/qlhđ";
        try { 
            this.cn= DriverManager.getConnection(url, "root", "");
//            System.out.println("Connection.Database.getConnection()");
        } catch (SQLException ex) {
            Logger.getLogger(Cnn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cn;
    }
    public static void main(String[] args) {
     Cnn test= new Cnn();
       test.getConnection();
        
    }

    
    
}
