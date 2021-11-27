/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

/**
 *
 * @author Thang
 */
public class TaiLieu {
    String ma; // mã tài liệu
    String nsx; // tên nhà sản xuất
    int soBanPhatHanh; // bản phát hành 

    public TaiLieu() {
    }

    public TaiLieu(String ma, String nsx, int soBanPhatHanh) {
        this.ma = ma;
        this.nsx = nsx;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getNsx() {
        return nsx;
    }

    public void setNsx(String nsx) {
        this.nsx = nsx;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }
    
}
