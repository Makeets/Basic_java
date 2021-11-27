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
public class HangHoa {
    String mahh;
    String tenhh;
    String quicach;
    String dvtinh;
    double dongia;

    public HangHoa() {
    }

    public HangHoa(String mahh, String tenhh, String quicach, String dvtinh, double dongia) {
        this.mahh = mahh;
        this.tenhh = tenhh;
        this.quicach = quicach;
        this.dvtinh = dvtinh;
        this.dongia = dongia;
    }

  

    public String getMahh() {
        return mahh;
    }

    public void setMahh(String mahh) {
        this.mahh = mahh;
    }

    public String getTenhh() {
        return tenhh;
    }

    public void setTenhh(String tenhh) {
        this.tenhh = tenhh;
    }

    public String getQuicach() {
        return quicach;
    }

    public void setQuicach(String quicach) {
        this.quicach = quicach;
    }

    public String getDvtinh() {
        return dvtinh;
    }

    public void setDvtinh(String dvtinh) {
        this.dvtinh = dvtinh;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    
    
}
