/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;
import java.util.Arrays; // thư viện sắp xếp
import java.util.Scanner;

/**
 *
 * @author Thang
 */
public class Main {

    public static void main(String[] args)//psvm tab
    {
        Product[] dssp = new Product[50];
        int n;//san pham thuc te
        System.out.println("Nhap so san pham ");
        Scanner nhap = new Scanner(System.in);
        n = nhap.nextInt();
        System.out.println("Nhap danh sach san pham");
        nhap(dssp, n);
        System.out.println("Danh sach san pham vua nhap ");
        xuat(dssp, n);
        if (findname(dssp, n)==true) {
            System.out.println("Trong danh sach vua nhap co san pham banh mi ");
        } else {
            System.out.println("Not Found");
        }
        System.out.println("sap xep san pham theo don gia ");
        sx(dssp,n);
        System.out.println("sap xep san pham ten ");
        sxt(dssp,n);
        
    }

    public static void nhap(Product[] sp, int n) {
        for (int i = 0; i < n; i++) //for ctrl+space la ra goi y  
        {
            Product sp1 = new Product();
            sp1.input();
            sp[i] = sp1;

        }
    }

    public static void xuat(Product[] sp, int n) {
        for (int i = 0; i < n; i++) {

            System.out.println(sp[i].toString());
        }
    }

    public static boolean findname(Product[] sp, int n) // hàm tìm theo tên sản phẩm 
    {
        boolean find = false;
        for (int i = 0; i < n; i++) {
            if (sp[i].getName().equalsIgnoreCase("banh mi")) //IgnoreCase la lo nhung ky tu viet hoa di 
            {
                find = true;
                break;
            }
        }
        return find;

    }
    public static void sx(Product[] sp,int n) // hàm sắp xếm theo giá 
    {
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(sp[i].getGia()<sp[j].getGia())
                {
                Product temp = new Product();
                temp=sp[i];
                sp[i]=sp[j];
                sp[j]=temp;
                }
            }
            System.out.println(sp[i].toString());
        }
    }
    public static void sxt(Product[] sp, int n) // hàm sắp xếp theo tên 
    {
       
             for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (sp[i].getName().compareTo(sp[j].getName()) > 0) {
                    Product temp = sp[i];
                    sp[i] = sp[j];
                    sp[j] = temp;
                }
            }
                 System.out.println(sp[i].toString());
             }
    }
}
