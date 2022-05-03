/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong2.donglenh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import lthdt.chuong2.employeeLogic.Student;

/**
 *
 * @author thang
 */
public class testStudent {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        Student sv = new Student("DH Kinh Te", "K53", "Gioi", "Nguyen Van A", 1, df.parse("20-10-2001"));
        
        switch (sv.getHocluc()) {
            case "Xuat Sac":
                sv.setHocbong(1000);
                break;
            case "Gioi":
                sv.setHocbong(800);
                break;
            default:
                sv.setHocbong(0);
        }
        System.out.println(sv);
    }
}
