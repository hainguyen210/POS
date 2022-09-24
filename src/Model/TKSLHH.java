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
public class TKSLHH {
    private String MaHH;
    private String TenHH;
    private String DVT;
    private int DonGia;
    private int SoLuong;
    private String NgayLap;

    public TKSLHH() {
    }

    public TKSLHH(String MaHH, String TenHH, String DVT, int DonGia, int SoLuong, String NgayLap) {
        this.MaHH = MaHH;
        this.TenHH = TenHH;
        this.DVT = DVT;
        this.DonGia = DonGia;
        this.SoLuong = SoLuong;
        this.NgayLap = NgayLap;
    }

    public String getMaHH() {
        return MaHH;
    }

    public String getTenHH() {
        return TenHH;
    }

    public String getDVT() {
        return DVT;
    }

    public int getDonGia() {
        return DonGia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public String getNgayLap() {
        return NgayLap;
    }

    public void setMaHH(String MaHH) {
        this.MaHH = MaHH;
    }

    public void setTenHH(String TenHH) {
        this.TenHH = TenHH;
    }

    public void setDVT(String DVT) {
        this.DVT = DVT;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public void setNgayLap(String NgayLap) {
        this.NgayLap = NgayLap;
    }
    
    
}
