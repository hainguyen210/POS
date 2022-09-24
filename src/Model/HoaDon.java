/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author ducha
 */
public class HoaDon {
    private String MaHD;
    private String NgayLap;
    private int TongTienHD;
    
    public HoaDon() {
    }

    public HoaDon(String MaHD, String NgayLap, int TongTienHD) {
        this.MaHD = MaHD;
        this.NgayLap = NgayLap;
        this.TongTienHD = TongTienHD;
    }

    public String getMaHD() {
        return MaHD;
    }

    public String getNgayLap() {
        return NgayLap;
    }

    public int getTongTienHD() {
        return TongTienHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public void setNgayLap(String NgayLap) {
        this.NgayLap = NgayLap;
    }

    public void setTongTienHD(int TongTienHD) {
        this.TongTienHD = TongTienHD;
    }
    
    
    
}
