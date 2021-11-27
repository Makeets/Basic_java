/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangdong;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Thang
 */
public class MangDong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> songuyen = new ArrayList<Integer>();
        System.out.println("nhap day cac so nguyen ");
        int so;
        Scanner nhap = new Scanner(System.in);
        do {
            System.out.print("nhap so ");
            so = nhap.nextInt();
            songuyen.add(so); //thêm số vừa nhập vào mảng 

        } while (so != 0);
        System.out.println("Dãy số vừa nhập là ");
        for (Integer a : songuyen) {    // số chẵn 
            System.out.println(a + " ");
        }
        System.out.println("Số chẵn trong mảng là");
        int dem = 0, tong = 0;
        for (Integer a : songuyen) { // trung bình cộng 
            if (a != 0) {
                dem++;
                tong = a + tong;
            }
            if (a % 2 == 0) {
                System.out.println(a + " ");
            }
        }
        System.out.println("Trung bình cộng của mảng là " + (float) tong / dem);
        int b=0,dem2=0,s=0;
        boolean kt = true;
        for (Integer a : songuyen) { //trung bình cộng số nguyên tố 
            for (int i = 2; i <= songuyen.size(); i++) {
                b=0;
                if (a % i == 0) {
                    b++;
                }
            }
            if(b==1)
            {
                System.out.println("Số nguyên tố là "+a);
            }
        }
       // System.out.println("Trung bình cộng của các số nguyên tố trong mảng là "+(float)s/dem2);
        System.out.println(songuyen.size());
        Collections.sort(songuyen);//sắp xếp theo tăng dần 
        System.out.println("In lại mảng sau khi sắp xếp là "+ songuyen);
        Collections.sort(songuyen,Collections.reverseOrder());//sắp xếp giảm dần 
        System.out.println("Sắp xếp theo chiều giảm dần "+songuyen);
        
    }
    
}
