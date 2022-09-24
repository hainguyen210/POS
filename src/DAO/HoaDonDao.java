/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DBHelper.DBHelper;
import Model.HoaDon;
import Model.TKSLHH;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ducha
 */
public class HoaDonDao {
    
    
    
    public HoaDon get() throws Exception{
        Connection conn = DBHelper.ConnectToSQL();

        String sql = "use DoAnJava select * from HoaDon";
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        if(rs.next()){
            HoaDon hd = new HoaDon();
            hd.setMaHD(rs.getString("MaHD"));     
            hd.setNgayLap(rs.getString("NgayLap"));
            hd.setTongTienHD(rs.getInt("TongTienHD"));
            return hd;
        }
        return null;
    }
    
    public int ThemHD(HoaDon hd) throws Exception{
        Connection conn = DBHelper.ConnectToSQL();

        String sql = "use DoAnJava insert into HoaDon values (?,?,?)";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, hd.getMaHD());
        pstm.setString(2, hd.getNgayLap());
        pstm.setInt(3, hd.getTongTienHD());
        
        
        return pstm.executeUpdate();
    }
    
    public HoaDon TimTheoMaHD(String MaHD) throws Exception{
        
        Connection conn = DBHelper.ConnectToSQL();

        String sql = "use DoAnJava select * from HoaDon where MaHD = ?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, MaHD);
        ResultSet rs = pstm.executeQuery();
        if(rs.next()){
            HoaDon hd = new HoaDon();
            hd.setMaHD(rs.getString("MaHD"));
            hd.setNgayLap(rs.getString("NgayLap"));
            hd.setTongTienHD(rs.getInt("TongTienHD"));
            
            return hd;
        }
        return null;
    }
    
    public int Xoa(String MaHD) throws Exception{
        Connection conn = DBHelper.ConnectToSQL();

        String sql = "use DoAnJava delete from HoaDon where MaHD = ?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, MaHD);
        
        return pstm.executeUpdate();
    }
    
    public ArrayList thongKeHD(String NgayBatDau, String NgayKetThuc) throws Exception{
        Connection conn = DBHelper.ConnectToSQL();
        
        String sql = "use DoAnJava select * from HoaDon where NgayLap between ? and ?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, NgayBatDau);
        pstm.setString(2, NgayKetThuc);
        ResultSet rs = pstm.executeQuery();
        
        ArrayList<HoaDon> List = new ArrayList<>();
        while (rs.next()) {
            HoaDon hd = new HoaDon();
            hd.setMaHD(rs.getString("MaHD"));
            hd.setNgayLap(rs.getString("NgayLap"));
            hd.setTongTienHD(rs.getInt("TongTienHD"));
            List.add(hd);
        }
        return List;
    }
}
