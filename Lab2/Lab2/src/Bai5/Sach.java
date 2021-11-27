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
public class Sach extends TaiLieu{
    String tg; // tên tác giả
    String sach; // tên sách
    int trang; // số trang

    public Sach() {
    }

    public Sach(String tg, String sach, int trang) {
        this.tg = tg;
        this.sach = sach;
        this.trang = trang;
    }

    public Sach(String tg, String sach, int trang, String ma, String nsx, int soBanPhatHanh) {
        super(ma, nsx, soBanPhatHanh);
        this.tg = tg;
        this.sach = sach;
        this.trang = trang;
    }

    public String getTg() {
        return tg;
    }

    public void setTg(String tg) {
        this.tg = tg;
    }

    public String getSach() {
        return sach;
    }

    public void setSach(String sach) {
        this.sach = sach;
    }

    public int getTrang() {
        return trang;
    }

    public void setTrang(int trang) {
        this.trang = trang;
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
