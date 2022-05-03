/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong2.donglenh;

import java.util.Scanner;

/**
 *
 * @author thang
 */
public class TestWhile {
    public static void main(String[] args) {
//        int n; int i;
//        double s1 = 0;
//        n = 100;
//        i = 1;
//        while(i<=n){
//            s1 = s1 + (double) 1/i;
//            i = i + 1;
//             
//        }
//        System.out.println("Tong thu 1: "+s1);
        
        
        
        
        
        //
        int n = 0;
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while (!flag){
            System.out.print("Nhap so nguyen duong le N = ");
            String inp = sc.nextLine();
            n = Integer.parseInt(inp);
//            if(n > 0 && ((n % 2)!= 0)){
//                flag = true;
//            } else {
//                flag = false;
//            }
            flag = ((n > 0) && (n%2 != 0))?true:false;
        }
        
        
        //thay doi buoc nhay
        int s2 = 0;
        int i = 1;
        
        while (i <= n){
            s2 = s2 + i;
            i = i + 2;      
        }
        System.out.println("Tong thu 2: "+s2);
    }
}
