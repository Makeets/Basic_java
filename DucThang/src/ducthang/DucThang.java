/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ducthang;
import java.util.Scanner;
/**
 *
 * @author Thang
 */
public class DucThang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nhap= new Scanner(System.in);
        int n;
        System.out.println("nhap so phan tu trong mang ");
        n = nhap.nextInt();
        int a[] = new int [n];
        for (int i=0;i<n;i++)
        {
            System.out.print("nhap gia tri cua a["+i+"]: ");
            a[i]=nhap.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("a["+i+"]= "+a[i]);
        }
        System.out.println("tong day so vua nhap la: "+ tong(a,n));
        System.out.println("Cac so nguyen to la: ");
        for(int i=0;i<n;i++)
        {   if(ktra(a[i])==true)
            System.out.println( a[i]);
        }
        
    }

   
    public static int tong(int a[] ,int n)
    {
    int s=0;
    for(int i=0;i<n;i++)
    {
        s+=a[i];
    }
      return s;
    }
    public static boolean ktra(int n)
    {
    if(n<2)
        return false ;
    for(int i=2;i<(n-1);i++)
    {   if(n%i == 0)
        return false;
    }
    return true;
    }
}
