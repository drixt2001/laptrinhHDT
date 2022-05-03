/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong2.employeeLogic;

import java.util.Date;

/**
 *
 * @author thang
 */
public class Student extends Person implements TaxInterface{
    private String Truonghoc;
    private String Lop;
    private String hocluc;
    private double hocbong;

    public Student() {
    }

    public Student(String Truonghoc, String Lop, String Hoten, int gioitinh, Date ngaysinh) {
        super(Hoten, gioitinh, ngaysinh);
        this.Truonghoc = Truonghoc;
        this.Lop = Lop;
    }

    public Student(String Truonghoc, String Lop, String hocluc, String Hoten, int gioitinh, Date ngaysinh) {
        super(Hoten, gioitinh, ngaysinh);
        this.Truonghoc = Truonghoc;
        this.Lop = Lop;
        this.hocluc = hocluc;
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

    @Override
    public String toString() {
        String KQ  = super.toString();
        KQ += "Student{" + "Truonghoc=" + Truonghoc + ", Lop=" + Lop + ", hocluc=" + hocluc + ", hocbong=" + hocbong + '}';
        return KQ;
    }

    public String getHocluc() {
        return hocluc;
    }

    public void setHocluc(String hocluc) {
        this.hocluc = hocluc;
    }

    public double getHocbong() {
        return hocbong;
    }

    public void setHocbong(double hocbong) {
        this.hocbong = hocbong;
    }
    
    
    
}
