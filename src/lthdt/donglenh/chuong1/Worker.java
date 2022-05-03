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
public class Worker extends Person implements TaxInterface{
    private String Congty;

    public Worker() {
    }

    public Worker(String Congty, String Hoten, int gioitinh, Date ngaysinh) {
        super(Hoten, gioitinh, ngaysinh);
        this.Congty = Congty;
    }

    public String getCongty() {
        return Congty;
    }

    public void setCongty(String Congty) {
        this.Congty = Congty;
    }

    @Override
    public double calcTax(double income) {
        return (0.04*income);
    }
    
    
}
