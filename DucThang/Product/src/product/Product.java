/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;
import java.util.Scanner;
/**
 *
 * @author Thang
 */
public class Product {

    /**
     * @param args the command line arguments
     */
    String id ;
    String name;
    int sl;
    float gia;

    public Product(String id, String name, int sl, float gia) {
        this.id = id;
        this.name = name;
        this.sl = sl;
        this.gia = gia;
    }

    Product() {
        
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSl() {
        return sl;
    }

    public float getGia() {
        return gia;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }
   //ham nhap du lieu 
   public void input()
   {
   Scanner nhap= new Scanner(System.in);
       System.out.println("Moi nhap id san pham ");
       this.id=nhap.nextLine().toString();
       System.out.println("Moi nhap ten san pham ");
       this.name=nhap.nextLine().toString();
       
       System.out.println("Moi nhap so luong ");
       this.sl=nhap.nextInt();
       System.out.println("Moi nhap gia cua san pham ");
       this.gia=nhap.nextFloat();
       
   }
   //ham xuat 

    @Override
    public String toString() {
        return "Product{" + "id= " + id + ", name= " + name + ", sl= " + sl + ", gia= " + gia + '}';
    }

   
   
  
}

