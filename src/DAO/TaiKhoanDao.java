/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DBHelper.DBHelper;
import Model.Taikhoan;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author ducha
 */
public class TaiKhoanDao {
    public Taikhoan Login() throws Exception{
        Connection conn = DBHelper.ConnectToSQL();

        String sql = "use DoAnJava select * from Taikhoan";
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        
        if(rs.next()){
            Taikhoan tk = new Taikhoan();
            tk.setUsername(rs.getString("Username"));
            tk.setPassword(rs.getString("Password"));
            
            return tk;
        }
        return null;
    }
}
