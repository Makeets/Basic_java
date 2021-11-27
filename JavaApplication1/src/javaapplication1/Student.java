/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author Thang
 */
public class Student {

   String ten;
   int tuoi;
   String truong;
   String gt;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getTruong() {
        return truong;
    }

    public void setTruong(String truong) {
        this.truong = truong;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    @Override
    //ham in ra thong tin cua sv1
    public String toString() {
        return "Student{" + "ten=" + ten + ", tuoi=" + tuoi + ", truong=" + truong + ", gt=" + gt + '}';
    }
    //ham nhap thong tin cua sv
public void inputstudent()
{
Scanner nhap = new Scanner(System.in);
    System.out.println("Nhap ten sinh vien ");
    this.ten=nhap.nextLine().toString();
    System.out.println("Nhap tuoi cua sinh vien ");
    this.tuoi=nhap.nextInt();
    nhap.nextLine(); // tu int sang string phai co dong nhap.nextLine();
    System.out.println("Nhap gioi tinh cua sinh vien ");
    this.gt=nhap.nextLine().toString();
    System.out.println("Nhap truong ");
    this.truong=nhap.nextLine().toString();
    
}
//ham xuat thong tin cua sv 
public void outputstundent()
{
    System.out.println("Ten: "+this.ten);
    System.out.println("Tuoi: "+this.tuoi);
    System.out.println("Gioi Tinh: "+this.gt);
    System.out.println("Truong: "+this.truong);
}
    
   
}
