/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBHelper;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ducha
 */
public class DBHelper {
    
    public static Connection ConnectToSQL() throws Exception{
        
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=DoAnJava", "sa", "123456");
        return conn;
    }
    
}
