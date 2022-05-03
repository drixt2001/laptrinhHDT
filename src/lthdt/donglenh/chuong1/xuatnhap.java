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
public class xuatnhap {
    public static void main(String[] args){
        boolean flag = true;
        int a = 15;
        byte b = 2;
        float c = (float) 16.2;
        double e = 12.6;
        float d = 4.5f;
        String s = "Hello";
        char ch = 'c';
        
        Scanner sc = new Scanner(System.in);
        
        //Nhap ho ten
        System.out.print("Hay nhap Ho Ten: ");
        String hoten = sc.nextLine();
        System.out.println("Ban da nhap Ho Ten la: "+hoten);
        
        //Nhap so nguyen
        System.out.print("Hay nhap vao mot so nguyen: ");
        String nInput = sc.nextLine();
        a = Integer.parseInt(nInput);
        System.out.println("So nguyen ma ban da nhap la: "+a);
        
        //Nhap so thuc
        System.out.print("Hay nhap vao mot so thuc: ");
        String rInput = sc.nextLine();
        e = Double.parseDouble(rInput);
        System.out.println("So thuc ma ban da nhap la: "+e);
    }
    
}
