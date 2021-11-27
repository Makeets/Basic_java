/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager.info;
import java.util.Scanner;
import java.util.ArrayList;
import student.info.Student;

/**
 *
 * @author Thang
 */
public class UsingManagerStudent {
    public static void main(String[] args) {
        int x;
        ArrayList<ManagerStudent> ds= new ArrayList<ManagerStudent>();
        System.out.println("1.input");
        System.out.println("2.display");
        System.out.println("3.sort by name");
        System.out.println("4.search by name");
        System.out.println("5.exit");
        do{
          do{  System.out.println("mời nhập lựa chọn");
            Scanner nhap= new Scanner(System.in);
            x=nhap.nextInt();
          
          }
          while(x<1||x>5);
          switch(x)
                  {
              case 1:
              {
              break;
              }
              case 2:
              {
              break;
              }
              case 3:
              {
              break;
              }
              case 4:
              {
              break;
              }
          }
        }
        while(x!=5);
    }
    
    public void nhap(ManagerStudent a)
    {
    
    }
    
}
