/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmark;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Thang
 */
public class StudentMark {

    /**
     * @param args the command line arguments
     */
   int Rollnumber;
   String ten;
   String lop;
   String mon;
   float diem;

    public StudentMark() {
    }

    public StudentMark(int Rollnumber, String ten, String lop, String mon, float diem) {
        this.Rollnumber = Rollnumber;
        this.ten = ten;
        this.lop = lop;
        this.mon = mon;
        this.diem = diem;
    }

    public int getRollnumber() {
        return Rollnumber;
    }

    public void setRollnumber(int Rollnumber) {
        this.Rollnumber = Rollnumber;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }
   
    public void nhap()
    {   
        Scanner nhap= new Scanner(System.in);
       
        System.out.println("Nhap Rollnumber: ");
        this.Rollnumber=nhap.nextInt();
        nhap.nextLine();
        System.out.println("Nhap ten sv: ");
        this.ten=nhap.nextLine().toString();
        System.out.println("Nhap lop cua sv: ");
        this.lop=nhap.nextLine().toString();
        System.out.println("Nhap mon hoc: ");
        this.mon=nhap.nextLine().toString();
        System.out.println("Nhap diem: ");
        this.diem=nhap.nextFloat();
        
    }
    public void xuat()
    {
        System.out.println("Rollnumber: "+this.Rollnumber);
        System.out.println("Ten sv: "+this.ten);
        System.out.println("Lop : "+this.lop);
        System.out.println("Mon hoc: "+this.mon);
        System.out.println("Diem: "+this.diem);
    }  

    @Override
    public String toString() {
        return "StudentMark{" + "Rollnumber=" + Rollnumber + ", ten=" + ten + ", lop=" + lop + ", mon=" + mon + ", diem=" + diem + '}';
    }
    public static void main(String[] args)
    {   
        ArrayList<StudentMark> ds= new ArrayList<StudentMark>();
        int i=0,n;
        Scanner nhap=new Scanner(System.in);
        System.out.println("Nhap so sinh vien ");
        n=nhap.nextInt();
        do
        {
            StudentMark sv=new StudentMark();
            sv.nhap();
            ds.add(sv);
            i++;
        }
        while(i<n);
        for (StudentMark d : ds) {
            System.out.println(d.toString());
        }
    }
}

