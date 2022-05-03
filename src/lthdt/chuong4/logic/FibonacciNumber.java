/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong4.logic;

/**
 *
 * @author thang
 */
public class FibonacciNumber {

    public FibonacciNumber() {
    }
    
    public int calcFibonacci(int n){
        //dk dung
        if(n == 1){
            return 0;
           
        }
        if (n == 2){
            return 1;
        }
        //loi goi de quy
        return (calcFibonacci(n-1)+calcFibonacci(n-2));
    }
}
