/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.donglenh.chuong1;

import java.util.Scanner;

/**
 *
 * @author thang
 */
public class pheptoan {
     public static void main(String[] args){
         
         //Phep toan so nguyen
         int a = 17, b = 4, c;
         c = a + b;
         System.out.println("Phep cong "+a+" + "+b+" = "+c);
         
         c = a - b;
         System.out.println("Phep tru "+a+" - "+b+" = "+c);
         
         c = a * b;
         System.out.println("Phep nhan "+a+" * "+b+" = "+c);
         
         c = a / b;
         System.out.println("Phep chia lay phan nguyen "+a+" / "+b+" = "+c);
         
         c = a % b;
         System.out.println("Phep chia lay phan du "+a+" % "+b+" = "+c);
         
         //Phep toan so thuc
         double x = 14.3, y = 3.56, z;
         
         z = x + y;
         System.out.println("Phep cong "+x+" + "+y+" = "+z);
         
         z = y - x;
         System.out.println("Phep tru "+y+" - "+x+" = "+z);
         
         z = y * y;
         System.out.println("Phep nhan "+y+" * "+x+" = "+z);
         
         z = y / x;
         System.out.println("Phep chia "+y+" / "+x+" = "+z);
         
         //Phep toan logic
         boolean flag1 = true, flag2 = false, flag3 = true;
         System.out.println("Phep AND "+ (flag1 && flag2)); 
         System.out.println("Phep OR "+ (flag1 || flag2)); 
         System.out.println("Phep NOT "+ (!flag1)); 
         System.out.println("Phep XOR "+ (flag1^flag3));
         
         //Phep toan chuoi
         String s1 = "Hello moi nguoi";
         String s2 = "MOI";
         
         System.out.println(s1.toUpperCase());
         System.out.println(s2.toLowerCase());
         System.out.println(s1.toUpperCase().contains(s2));
         
         s1 += " "+ s2;
         System.out.println(s1);
         
    }
}
