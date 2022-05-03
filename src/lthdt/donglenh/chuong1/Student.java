/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.donglenh.chuong1;

import java.util.Date;

/**
 *
 * @author thang
 */
public class Student extends Person implements TaxInterface{
    private String Truonghoc;
    private String Lop;

    public Student() {
    }

    public Student(String Truonghoc, String Lop, String Hoten, int gioitinh, Date ngaysinh) {
        super(Hoten, gioitinh, ngaysinh);
        this.Truonghoc = Truonghoc;
        this.Lop = Lop;
    }

    public String getTruonghoc() {
        return Truonghoc;
    }

    public String getLop() {
        return Lop;
    }

    public void setTruonghoc(String Truonghoc) {
        this.Truonghoc = Truonghoc;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    @Override
    public double calcTax(double income) {
        double tax;
        tax = 0.01*income;
        return tax;
    }
    
    
    
}
