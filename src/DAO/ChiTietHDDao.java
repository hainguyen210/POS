/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DBHelper.DBHelper;
import Model.ChiTietHD;
import Model.HoaDon;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ducha
 */
public class ChiTietHDDao {
    public int ThemCTHD(ChiTietHD cthd) throws Exception{
        Connection conn = DBHelper.ConnectToSQL();

        String sql = "use DoAnJava insert into ChiTietHD values (?,?,?,?,?)";
        PreparedStatement pstm = conn.prepareStatement(sql);
        
        pstm.setString(1, cthd.getMaHD());
        pstm.setString(2, cthd.getMaHH());
        pstm.setInt(3, cthd.getDonGia());
        pstm.setInt(4, cthd.getSoLuong());
        pstm.setInt(5, cthd.getTongTien());
        
        return pstm.executeUpdate();
    }
    
    public ArrayList JTable(String MaHD) throws Exception{
        Connection conn = DBHelper.ConnectToSQL();
        
        String sql = "use DoAnJava select * from ChiTietHD where MaHD = ?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, MaHD);
        ResultSet rs = pstm.executeQuery();
       
        ArrayList<ChiTietHD> List = new ArrayList<>();
        while (rs.next()) {
            ChiTietHD cthd = new ChiTietHD();
            cthd.setMaHD(rs.getString("MaHD"));
            cthd.setMaHH(rs.getString("MaHH"));
            cthd.setDonGia(rs.getInt("DonGia"));
            cthd.setSoLuong(rs.getInt("SoLuong"));
            cthd.setTongTien(rs.getInt("TongTien"));
            List.add(cthd);
        }
        return List;
    }
    
    public int Xoa(String MaHD) throws Exception{
        Connection conn = DBHelper.ConnectToSQL();

        String sql = "use DoAnJava delete from ChiTietHD where MaHD = ?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, MaHD);
        
        return pstm.executeUpdate();
    }
}
