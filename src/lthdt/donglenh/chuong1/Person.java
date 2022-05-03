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
public class Person {
    private String Hoten;
    private int gioitinh;
    private Date ngaysinh;

    public Person() {
    }

    public Person(String Hoten, int gioitinh, Date ngaysinh) {
        this.Hoten = Hoten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
    }

    public String getHoten() {
        return Hoten;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    
    
}
