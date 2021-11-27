/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.info;

import person.info.Person;
import java.util.Scanner;
/**
 *
 * @author Thang
 */
public class Student implements Person{
String ten;
int tuoi;
String lop;
String id;

    public Student() {
    }

    public Student(String ten, int tuoi, String lop, String id) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.lop = lop;
        this.id = id;
    }

    @Override
    public void input() {
        Scanner sc= new Scanner(System.in);
        System.out.println("mời nhập tên: ");
        this.ten=sc.nextLine();
        System.out.println("mời nhập tuổi: ");
        this.tuoi=sc.nextInt();
        sc.nextLine();
        System.out.println("mời nhập lớp: ");
        this.lop=sc.nextLine();
        System.out.println("mời nhập id: ");
        this.id=sc.nextLine();
    }

    @Override
    public void output() {
        System.out.println("Tên: "+this.ten);
        System.out.println("Tuổi: "+this.tuoi);
        System.out.println("Lớp: "+this.lop);
        System.out.println("Id: "+this.id);
    }

    
    
}
