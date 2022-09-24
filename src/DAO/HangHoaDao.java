/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DBHelper.DBHelper;
import Model.HangHoa;
import Model.TKSLHH;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author ducha
 */
public class HangHoaDao{
    
    public ArrayList<String> ComboBox() throws Exception {

        Connection conn = DBHelper.ConnectToSQL();

        String sql = "use DoAnJava select TenHH from HangHoa";
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        ArrayList<String> List = new ArrayList<>();
        while (rs.next()) {
            List.add(rs.getString("TenHH"));
        }
        return List;
    }
    
    public HangHoa TimTheoTen(String TenHH) throws Exception {

        Connection conn = DBHelper.ConnectToSQL();

        String sql = "use DoAnJava select * from HangHoa where TenHH = ?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, TenHH);
        ResultSet rs = pstm.executeQuery();

        if (rs.next()) {
            HangHoa hh = new HangHoa();
            hh.setMaHH(rs.getString("MaHH"));
            hh.setDonGia(rs.getInt("DonGia"));
            hh.setDVT(rs.getString("DVT"));
            hh.setSoLuong(rs.getInt("SoLuong"));
            return hh;

        }
        return null;
    }
    
    public int ThemMoi(HangHoa hh) throws Exception{
        Connection conn = DBHelper.ConnectToSQL();

        String sql = "use DoAnJava insert into HangHoa values (?,?,?,?,?)";
        PreparedStatement pstm = conn.prepareStatement(sql);
        
        pstm.setString(1, hh.getMaHH());
        pstm.setString(2, hh.getTenHH());
        pstm.setString(3, hh.getDVT());
        pstm.setInt(4, hh.getDonGia());
        pstm.setInt(5, hh.getSoLuong());
        
        return pstm.executeUpdate();
    }
    
    public ArrayList Jtable() throws Exception{
        Connection conn = DBHelper.ConnectToSQL();
        
        String sql = "use DoAnJava select * from HangHoa";
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        ArrayList<HangHoa> List = new ArrayList<>();
        while (rs.next()) {
            HangHoa hh = new HangHoa();
            hh.setMaHH(rs.getString("MaHH"));
            hh.setTenHH(rs.getString("TenHH"));
            hh.setDVT(rs.getString("DVT"));
            hh.setDonGia(rs.getInt("DonGia"));
            hh.setSoLuong(rs.getInt("SoLuong"));
            List.add(hh);       
        }
        return List;
    }
    
    public int Xoa(String MaHH) throws Exception{
        Connection conn = DBHelper.ConnectToSQL();

        String sql = "use DoAnJava delete from HangHoa where MaHH = ?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, MaHH);
        
        return pstm.executeUpdate();
    }
    
    public int CapNhat(HangHoa hh) throws Exception{
        Connection conn = DBHelper.ConnectToSQL();

        String sql = "use DoAnJava update HangHoa set MaHH=?, DVT=?, DonGia=?, SoLuong=? where TenHH=?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, hh.getMaHH());
        pstm.setString(2, hh.getDVT());
        pstm.setString(3, Integer.toString(hh.getDonGia()));
        pstm.setString(4, Integer.toString(hh.getSoLuong()));
        pstm.setString(5, hh.getTenHH());
        
        return pstm.executeUpdate();
    }
    
    public int GiamSL(String MaHH, int SoLuong) throws SQLException, Exception{
        Connection conn = DBHelper.ConnectToSQL();

        String sql = "use DoAnJava update HangHoa set SoLuong=SoLuong - ? where MaHH=?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, SoLuong);
        pstm.setString(2, MaHH);
        
        return pstm.executeUpdate();
    }
    
    public ArrayList thongKeSLHH(String NgayBatDau, String NgayKetThuc) throws Exception{
        Connection conn = DBHelper.ConnectToSQL();
        
        String sql = "use DoAnJava select HangHoa.MaHH, HangHoa.TenHH, HangHoa.DVT, HangHoa.DonGia, ChiTietHD.SoLuong, HoaDon.NgayLap from HangHoa join ChiTietHD on HangHoa.MaHH = ChiTietHD.MaHH join HoaDon on ChiTietHD.MaHD = HoaDon.MaHD where HoaDon.NgayLap between ? and ?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, NgayBatDau);
        pstm.setString(2, NgayKetThuc);
        ResultSet rs = pstm.executeQuery();
        
        ArrayList<TKSLHH> List = new ArrayList<>();
        while (rs.next()) {
            TKSLHH tkslhh = new TKSLHH();
            tkslhh.setMaHH(rs.getString("MaHH"));
            tkslhh.setTenHH(rs.getString("TenHH"));
            tkslhh.setDVT(rs.getString("DVT"));
            tkslhh.setDonGia(rs.getInt("DonGia"));
            tkslhh.setSoLuong(rs.getInt("SoLuong"));
            tkslhh.setNgayLap(rs.getString("NgayLap"));
            List.add(tkslhh);
        }
        return List;
    }
}
