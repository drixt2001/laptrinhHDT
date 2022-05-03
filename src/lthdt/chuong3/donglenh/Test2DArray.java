/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lthdt.chuong3.donglenh;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author thang
 */
public class Test2DArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matran;
        
        Scanner sc = new Scanner(System.in);
        matran = new int[5][7];
        Random rd = new Random();
        for(int i = 0;i<matran.length;i++){
            for(int j = 0; j < matran[i].length;j++){
                System.out.print("a["+i+","+j+"] = ");
                String input = sc.nextLine();
                int n = Integer.parseInt(input);
                matran[i][j] = n;
            }
        }
        
        //Xuat gia tri cua ma tran ra man hinh
        for (int i=0;i<matran.length; i++){
            for (int j=0;j<matran[i].length; j++)
               System.out.print(matran[i][j]+" ");
            System.out.println();
        }
    }
    
}
