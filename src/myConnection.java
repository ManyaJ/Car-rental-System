/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lakshaya
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class myConnection {
    static Connection conn;
    public static Connection connect(){
    try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
        return conn;
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        return null;
    }
}
    
}
