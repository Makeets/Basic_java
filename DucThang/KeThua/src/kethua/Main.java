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
public class Main {
    public static void main(String[] args) {
        int n;
        SvKt[] a=new SvKt[50];
        Scanner nhap=new Scanner(System.in);
        System.out.println("Nhập số sinh viên: ");
        n=nhap.nextInt();        
            nhap(a,n); 
            xuat(a,n);
            System.out.println("danh sách sắp xếp ");
            sx(a,n);
            
    }
    public static void nhap(SvKt[] a, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("Mời nhập thông tin sinh viên thứ "+i);
            SvKt b = new SvKt();
            b.input();
            a[i] = b;
        }
    }

    public static void xuat(SvKt[] a, int n) {
        for (int i = 1; i <= n; i++) {            
            a[i].output();            
        }
    }
    public static void sx(SvKt[] a, int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
              
                if (a[i].getDiem() < a[j].getDiem()) { 
                    
                    SvKt temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
                
        }
        xuat(a,n);
        System.out.println("Sinh viên có điểm trung bình cao nhất là: ");
        a[1].output();        
    }
}
