/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktra;

/**
 *
 * @author Thang
 */
public class KhachHang2 {
    String makh;
    String tenkh;
    int dthoai;

    public KhachHang2() {
    }

    public KhachHang2(String makh, String tenkh, int dthoai) {
        this.makh = makh;
        this.tenkh = tenkh;
        this.dthoai = dthoai;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public int getDthoai() {
        return dthoai;
    }

    public void setDthoai(int dthoai) {
        this.dthoai = dthoai;
    }
    
    
   
}
