/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn1;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Thang
 */
public class BTVN1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner nhap = new Scanner(System.in);
        
         System.out.println("Nhap bai tap can giai(1-4)");
         
        n= nhap.nextInt();
        switch(n)
        {
            case 1:
            {
                System.out.println("Kiem tra so nguyen to ");
                int a,dem=0;
                System.out.println("Nhap 1 so nguyen bat ky ");
                a= nhap.nextInt();
                for (int i = 2;i<a;i++)
                {
                if(a%i==0)
                {
                dem++;
                }
                }
                if(dem==0)
                    System.out.println("So vua nhap la so nguyen to ");
                else 
                    System.out.println("So vua nhap khong phai la so nguyen to ");
                
                break ;
            }
            case 2:
            {   System.out.println(" Bang cuu chuong ");
                for(int i =1;i<11;i++)
                {   System.out.println("Bang cuu chuong "+i);
                    for(int j=1;j<11;j++)
                    {
                        System.out.println(i+"*"+j+"="+i*j);  
                    }
                }
                 
            break;
            }
            case 3:
            {
               int m;
                System.out.println("Nhap so phan tu trong mang ");
                m= nhap.nextInt();
                int[] a = new int [m];
                System.out.println("Moi nhap gia tri cua cac phan tu ");
                for(int i =0; i<m;i++)
                {
                    System.out.print("a["+i+"]=");
                    a[i]=nhap.nextInt();
                }
                Arrays.sort(a); 
                System.out.println("Mang sau khi sap xep la ");
                for(int i=0;i<m;i++)
                {
                    System.out.println("a["+i+"]="+a[i]);
                }
                int min=a[0];
                for(int i =1;i<m;i++)
                {
                if(a[i]<min)
                {
                int temp = a[i];
                a[i] = min;
                min = temp;
                }
                }
                System.out.println("So nho nhat trong "+min);
                int tong =0 , dem1=0;
                for(int i=0;i<m;i++)
                {
                if(a[i]%3==0)
                {
                dem1++;
                tong=tong+a[i];
                }
                }
                System.out.println("Trung binh cong cua cac so chia het cho 3: "+(float)tong/dem1);
            break;
            }
            case 4:
            {
               System.out.println("Chua lam ");  
            break;
            }
            
            
        }
                
    }
    
    
}
