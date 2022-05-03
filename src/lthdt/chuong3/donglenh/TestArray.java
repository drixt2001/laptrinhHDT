/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lthdt.chuong3.donglenh;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author thang
 */
public class TestArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a;
        a = new int[4];
        a[0] = 12;
        a[1] = 9;
        a[2] = 1;
        a[3] = 15;
        
//        System.out.println(a.toString());
        System.out.println(Arrays.toString(a));
        
        
        int[] b = new int[]{1,3,-7,8,9,20};
        System.out.println(Arrays.toString(b));
        System.out.println("So luong phan tu mang b: "+b.length);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("So luong phan tu cua mang n: ");
        String input = sc.nextLine();
        int n = Integer.parseInt(input);
        int[] c = new int[n];
        
        Random rd = new Random();
        for(int i = 0; i<n;i++){
            c[i] = rd.nextInt(999);
        }
        System.out.println("Gia tri cua mang vua nhap la: "+Arrays.toString(c));
        
//
//        for(int i=0;i<n;i++){
//            System.out.print("c["+i+"] = ");
//            input = sc.nextLine();
//            c[i] = Integer.parseInt(input);
//            
//        }
//        
//        for(int i = 0;i<c.length;i++){
//            System.out.print(c[i]+ " ");
//        }
//        System.out.println("Gia tri cua mang vua nhap la: "+Arrays.toString(c));
    }
    
}
