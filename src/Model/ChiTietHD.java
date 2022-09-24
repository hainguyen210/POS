/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ducha
 */
public class ChiTietHD {
    private String MaHD;
    private String MaHH;
    private int DonGia;
    private int SoLuong;
    private int TongTien;

    public ChiTietHD() {
    }

    public ChiTietHD(String MaHD, String MaHH, int DonGia, int SoLuong, int TongTien) {
        this.MaHD = MaHD;
        this.MaHH = MaHH;
        this.DonGia = DonGia;
        this.SoLuong = SoLuong;
        this.TongTien = TongTien;
    }

    public String getMaHD() {
        return MaHD;
    }

    public String getMaHH() {
        return MaHH;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public void setMaHH(String MaHH) {
        this.MaHH = MaHH;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public void setTongTien(int TongTien) {
        this.TongTien = TongTien;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public int getTongTien() {
        return TongTien;
    }

    
    
    
}
