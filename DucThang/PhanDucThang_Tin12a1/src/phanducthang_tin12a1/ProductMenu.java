/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phanducthang_tin12a1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Thang
 */
public class ProductMenu {

    public static void main(String[] args) {
        int a, n;
        Product[] ds = new Product[50];
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so san pham ");
        n = nhap.nextInt();
        
        boolean kt = true;
        do {
System.out.println("moi nhap cong viec can giai quyet \n 1.Nhap thong tin cho n san pham \n 2.Hien thi thong tin vua nhap \n 3.Sap xep thong tin giam dan theo gia va hien thi \n 4.thoat");
        a = nhap.nextInt();
            switch (a) {
                case 1: {

                    nhap(ds, n);

                    break;
                }
                case 2: {
                    System.out.println("Thong tin cua cac san pham vua nhap la ");
                    xuat(ds, n);

                    break;
                }
                case 3: {
                    System.out.println("Danh sach sau khi sap xep giam dan theo gia la ");
                    sx(ds, n);
                    xuat(ds, n);
                }
                case 4: {
                    kt = false;
                }
                
            }
        } while (kt);
    }

    public static void nhap(Product[] a, int n) {
        for (int i = 0; i < n; i++) {
            Product sp = new Product();
            sp.input();
            a[i] = sp;
        }

    }

    public static void xuat(Product[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Thong tin sp la " + a[i].toString());
        }
    }

    public static void sx(Product[] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i].gia < a[j].gia) {
                    Product temp = new Product();
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
