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
public  class SvKt extends SinhVien {
    public double TA;
    public double Marketing;
    public double QTdn;

    public SvKt() {
        super();
    }


    public SvKt(double TA, double Marketing, double QTdn, String ten, int tuoi) {
        super(ten, tuoi);
        this.TA = TA;
        this.Marketing = Marketing;
        this.QTdn = QTdn;
    }

    @Override
    public double getDiem() {
        return(2*TA+Marketing+2*QTdn)/5;
    }
    @Override
    public void input() {
        Scanner nhap=new Scanner(System.in);
        super.input(); 
        System.out.println("Nhập điểm tiếng anh: ");
        this.TA=nhap.nextDouble();
        System.out.println("Nhập điểm marketing: ");
        this.Marketing=nhap.nextDouble();
        System.out.println("Nhập điểm QTdn: ");
        this.QTdn=nhap.nextDouble();
    }
    

    @Override
    public void output() {
        super.output();
        System.out.println("Điểm tiếng anh: "+this.TA);
        System.out.println("Điểm Marketing: "+this.Marketing);
        System.out.println("Điểm QTdn: "+this.QTdn);
        System.out.println("Điểm trung bình: "+getDiem());
        
    }
   
}
