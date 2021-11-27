/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Thang
 */
public class Main {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Student sv = new Student();
      Student sv1 = new Student();
      //gan gia tri cho sv1
      sv.setTen("Thang");
      sv.setTuoi(20);
      sv.setTruong("UNETI");
      sv.setGt("nam");
      //cach in ra thong tin cua sv1 
        System.out.println("Tên: "+sv.getTen()+"\nTuoi "+sv.getTuoi()+"\nTruong "+sv.getTruong()+"\nGioi tinh "+sv.getGt());
        // cach 2 in ra thong tin cua sv1
        System.out.println(sv.toString());
        //nhap thong tin sv thu nhat
        System.out.println("Nhap thong tin sinh vien thu 1"); 
        sv.inputstudent();
        System.out.println("Thong tin sinh vien vua nhap ");
        sv.outputstundent();
        //nhap thong tin sv thu 2
        System.out.println("Nhap thong tin sinh vien thu 2");
        sv1.inputstudent();
        System.out.println("Thong tin sinh vien vua nhap ");
        sv1.outputstundent();
        
       //in ra thong tin sv co tuoi lon nhat 
        System.out.println("Sinh vien co tuoi lon nhat ");
       if(sv.getTuoi()>sv1.getTuoi())
       {
           sv.outputstundent();
       }
       else 
           sv1.outputstundent();
        
         
         
    }
}
