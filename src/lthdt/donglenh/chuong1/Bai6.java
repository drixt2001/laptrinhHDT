/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.donglenh.chuong1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author thang
 */
public class Bai6 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String ngayIN = "29-10-2001";
        Date ngaysinh = df.parse(ngayIN);
        
        
        Person p = new Person("Le Dinh Thang", 1, ngaysinh);
        System.out.println("Ho ten: "+ p.getHoten()+"; Gioi tinh: "+p.getGioitinh()+"; Ngay sinh: "+df.format(p.getNgaysinh()));
        
        
        Student sv = new Student();
        sv.setHoten("Nguyen Van B");
        sv.setGioitinh(1);
        sv.setNgaysinh(df.parse("12-12-2002"));
        sv.setTruonghoc("Kinh Te Hue");
        sv.setLop("K53");
        System.out.println("Ho ten: "+ sv.getHoten()+"; Gioi tinh: "+sv.getGioitinh()+"; Ngay sinh: "+df.format(sv.getNgaysinh())+
                "; Dai hoc: "+sv.getTruonghoc()+"; Lop: "+sv.getLop());
        
        System.out.println("Thue phai nop: "+sv.calcTax(1200));
        
        Worker congnhan = new Worker();
        congnhan.setHoten("Nguyen Thi C");
        congnhan.setGioitinh(0);
        congnhan.setNgaysinh(df.parse("20-01-1999"));
        congnhan.setCongty("Scavi Hue");
        System.out.println("Ho ten: "+ congnhan.getHoten()+"; Gioi tinh: "+congnhan.getGioitinh()+"; Ngay sinh: "+df.format(congnhan.getNgaysinh())+
                "; Cong ty: "+congnhan.getCongty());
        System.out.println("Thue phai nop: "+congnhan.calcTax(2000));
    }
}
