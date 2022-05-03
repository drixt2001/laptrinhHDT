/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong2.donglenh;

import java.util.Random;

/**
 *
 * @author thang
 */
public class TestFor {
    public static void main(String[] args) {
        int n = 100;
        double s = 0;
        for(int i = 1;i<=n;i++){
            s = s + (double)1/i;
        }
        System.out.println("Tong thu nhat la: "+s);
        
        n = 99;
        int s2=0;
        for(int i = 1; i <= n; i += 2){
            s2 = s2 + i;
        }
        System.out.println("Tong thu hai la: "+s2);
        
        //
        Random rd = new Random();
        int x;
        for(int i = 0; i < 10; i++){
            x = rd.nextInt(101);
            System.out.println(x);
        }
    }
}
