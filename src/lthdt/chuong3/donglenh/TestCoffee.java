/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lthdt.chuong3.donglenh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import lthdt.chuong3.coffeeLogic.CoffeeShop;
import lthdt.chuong3.coffeeLogic.Manager;

/**
 *
 * @author thang
 */
public class TestCoffee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        CoffeeShop[] a = new CoffeeShop[]{new CoffeeShop("Oke CF", "99 HĐH"),
        new CoffeeShop("Hi CF", "100 Phung Hung"), new CoffeeShop("D CF", "Hue")};
        
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        Manager[] m = new Manager[]{
            new Manager(a, 20000, "Thang", 1, df.parse("10-10-2001")),
            new Manager(new CoffeeShop[]{
                new CoffeeShop("Hue Thuong", "Nguyen Hue")
            }, 25000, "Nguyen Van B", 1, df.parse("01-12-2001"))
        };
        
        System.out.println(Arrays.toString(m));
    }
    
}
