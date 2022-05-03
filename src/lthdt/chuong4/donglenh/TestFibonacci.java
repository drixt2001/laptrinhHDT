/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lthdt.chuong4.donglenh;

import lthdt.chuong4.logic.FibonacciNumber;

/**
 *
 * @author thang
 */
public class TestFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FibonacciNumber fibo = new FibonacciNumber();
        System.out.println("So Fibonacci tai vi tri n = 15 la "+fibo.calcFibonacci(15));
        
        for(int i = 1; i<=20;i++){
            System.out.print(fibo.calcFibonacci(i)+" , ");
        }
    }
    
}
