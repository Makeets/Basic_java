/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thang
 */
public class QuanLyTV {
    ArrayList<TaiLieu> TaiLieu1=new ArrayList<>();
    Scanner sc= new Scanner(System.in);
    
    public Sach taoSach()
    {
        Sach s = new Sach();    
                sc.nextLine();
                System.out.println("Nhập mã tài liệu");
                s.ma = sc.nextLine();
                System.out.println("Nhập tên nhà xuất bản");
                s.nsx = sc.nextLine();
                System.out.println("Nhập số bản phát hành");
                s.soBanPhatHanh = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhập tên tác giả");
                s.tg = sc.nextLine();
                System.out.println("Nhập tên sách");
                s.sach = sc.nextLine();
                System.out.println("Nhập số trang");
                s.trang = sc.nextInt();
        return s;
    }
    public TapChi taoTC()
    {   
        TapChi tc=new TapChi();
        sc.nextLine();
         System.out.println("Nhập mã tài liệu");
        tc.ma=sc.nextLine();
        System.out.println("Nhập tên nhà xuất bản");
        tc.nsx=sc.nextLine();
        System.out.println("Nhập số bản phát hành");
        tc.soBanPhatHanh=sc.nextInt();
        System.out.println("Nhập số phát hành");
        tc.soPhatHanh=sc.nextInt();
        System.out.println("Nhập tháng phát hành");
        tc.thangPhatHanh=sc.nextInt();
     return  tc; 
    }
    public Bao taoBao()
    {
        Bao b= new Bao();
        sc.nextLine();
         System.out.println("Nhập mã tài liệu");
        b.ma=sc.nextLine();
        System.out.println("Nhập tên nhà xuất bản");
        b.nsx=sc.nextLine();
        System.out.println("Nhập số bản phát hành");
        b.soBanPhatHanh=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập ngày phát hành");
        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
        try {
            b.ngayPhatHanh=df.parse(sc.nextLine());
        } catch (ParseException ex) {
            
        }
        return b;
    }
    public void Nhap()
    {
        
        int x;
        do
        {   
            System.out.println("1.Tạo sách\n2.Tạo tạp chí\n3.Tạo báo\n4.Thoát");
            System.out.println("Nhập lựa chọn");
            x=sc.nextInt();
            switch(x)
            {
                case 1:
                {   
                    TaiLieu1.add(taoSach());
                    break;
                }
                case 2:
                {   
                    TaiLieu1.add(taoTC());
                    break;
                }
                case 3:
                {
                    TaiLieu1.add(taoBao());
                    break;
                }
                
            }
        }while(x!=4);
    }
    public void Xuat1PhanTu(TaiLieu tailieu)
    {
        System.out.println("Mã tài liệu: " + tailieu.getMa());
        System.out.println("Tên nhà xuất bản: " + tailieu.nsx);
        System.out.println("Số bản phát hành: " + tailieu.soBanPhatHanh);
        if (tailieu instanceof Sach) {
            Sach sach = (Sach) tailieu;// ép kiểu 
            System.out.println("Tên tác giả: " + sach.getTg());
            System.out.println("Tên sách: " + sach.getSach());
            System.out.println("Số trang: " + sach.trang);
            System.out.println("---------------");
        } else if (tailieu instanceof Bao) {
            Bao bao = (Bao) tailieu;
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Ngày phát hành: " + df.format(bao.getNgayPhatHanh()));
            System.out.println("---------------");
        } else {
            TapChi tc = (TapChi) tailieu;
            System.out.println("Số phát hành: " + tc.getSoPhatHanh());
            System.out.println("Tháng phát hành: " + tc.getThangPhatHanh());
            System.out.println("--------------");
        }
    }   
    public void XuatToanBo()
    {
     for(TaiLieu b : TaiLieu1)
     {
         Xuat1PhanTu(b);
     }
    }
    public void timTheoLoai(String s)
    {
        if(s.equalsIgnoreCase("Sach"))
        {
            System.out.println("Danh sách sách");
            for(TaiLieu a : TaiLieu1)
            {
                if(a instanceof Sach)
                {
                    Xuat1PhanTu(a);
                    System.out.println("------------");
                }
            }
        }
        else
            if(s.equalsIgnoreCase("Bao"))
            {
                System.out.println("Danh sách báo");
                for(TaiLieu a: TaiLieu1)
                {
                    if(a instanceof Bao)
                    {
                        Xuat1PhanTu(a);
                        System.out.println("-----------");
                    }
                }
                
            }
            else 
                if(s.equalsIgnoreCase("Tap chi"))
                {   
                    System.out.println("Danh sách tạp chí");
                    for(TaiLieu a: TaiLieu1)
                    {
                        if(a instanceof TapChi)
                        {
                            Xuat1PhanTu(a);
                            System.out.println("------------");
                        }
                    }
                }
    }
    public static void main(String[] args) {
        QuanLyTV a= new QuanLyTV();
        Scanner sc2= new Scanner(System.in);
        a.Nhap();
        a.XuatToanBo();
        System.out.println("Nhập loại cần tìm");
        String b;
        b= sc2.nextLine();
        a.timTheoLoai(b);
    }
}
