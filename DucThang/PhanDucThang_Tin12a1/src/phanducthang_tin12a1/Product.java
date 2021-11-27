/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phanducthang_tin12a1;
import java.util.Scanner;
/**
 *
 * @author Thang
 */
public class Product {

    /**
     * @param args the command line arguments
     */
    String name;
    String nsx;
    int gia;

    public Product() { //hàm tạo ko tham số 
    }

    public Product(String name, String nsx, int gia) { //hàm tạo có tham số 
        this.name = name;
        this.nsx = nsx;
        this.gia = gia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNsx() {
        return nsx;
    }

    public void setNsx(String nsx) {
        this.nsx = nsx;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
        
    public void input() //hàm nhập
    {
    Scanner nhap = new Scanner(System.in);
        System.out.println("Moi nhap ten san pham ");
            this.name = nhap.nextLine().toString();
            System.out.println("Moi nhap nha san xuat cua san pham");
            this.nsx = nhap.nextLine().toString();
            System.out.println("Moi nhap gia cua san pham");
            this.gia = nhap.nextInt();
    }

    @Override
    public String toString() { //hàm hiện thị 
        return "Product{" + "name=" + name + ", nsx=" + nsx + ", gia=" + gia + '}';
    }
    
    
}
