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
public class SvIT extends SinhVien {
       public double java;
        public double cpp;

    public SvIT() {
        super();
    }
        
    public SvIT(int java, int cpp, String ten, int tuoi) {
        super(ten, tuoi);
        this.java = java;
        this.cpp = cpp;
    }
        
    @Override
    public double getDiem() {
        return (java*2+cpp)/3; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void input() {
        Scanner nhap=new Scanner (System.in);
        super.input(); 
        System.out.println("Nhập điểm java: ");
        this.java=nhap.nextDouble();
        System.out.println("Nhập điểm cpp: ");
        this.cpp=nhap.nextDouble();
    }

    @Override
    public void output() {
        super.output(); 
        System.out.println("Điểm java: "+this.java);
        System.out.println("Điểm cpp: "+this.cpp);
        System.out.println("Điểm trung bình: "+getDiem());
    }
    
    
}
