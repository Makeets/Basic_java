/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kethua;
import java.util.Scanner;
/**
 *
 * @author Thang
 */
 abstract public class SinhVien {

    /**
     * @param args the command line arguments
     */
    public String ten;
    public int tuoi;

    abstract public double getDiem();

    public SinhVien() {
    }

    public SinhVien(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public void input() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        this.ten = nhap.nextLine();
        System.out.println("Nhập tuổi: ");
        this.tuoi = nhap.nextInt();
    }

    public void output() {
        System.out.println("Tên: " + this.ten);
        System.out.println("Tuổi: " + this.tuoi);
    }

}
