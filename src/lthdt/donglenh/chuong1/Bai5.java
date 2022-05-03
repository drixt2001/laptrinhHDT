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
public class Bai5 {
    public static void main(String[] args) throws ParseException {
        //Date -> String
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss", Locale.ENGLISH);
        Date Current = new Date();
        String output = df.format(Current);
        System.out.println(output);
        
        //String -> Date
        String inp = "31/12/1998";
        Date ngay = new SimpleDateFormat("dd/MM/yyyy").parse(inp);  
        System.out.println(ngay);
        
    }
}
