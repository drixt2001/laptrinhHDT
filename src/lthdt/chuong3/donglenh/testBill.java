/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong3.donglenh;

import lthdt.chuong3.coffeeLogic.Bill;
import lthdt.chuong3.coffeeLogic.Product;

/**
 *
 * @author thang
 */
public class testBill {
    public static void main(String[] args) throws CloneNotSupportedException {
        Bill a = new Bill(12, new Product[]{
            new Product("Dau goi Sunsilk", 12),
            new Product("Lifeboy", 5), new Product("Ban Phim", 100),
            new Product("Mi Tom", 1), new Product("Viet", 2)
        });
        
        System.out.println("a = "+a);
        
        Bill temp = (Bill) a.clone();
        temp.setID(15);
        
        System.out.println("a = "+a);
        System.out.println("temp = "+temp);
    }
}
