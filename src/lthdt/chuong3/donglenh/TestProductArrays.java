/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lthdt.chuong3.donglenh;

import java.util.Arrays;
import lthdt.chuong3.coffeeLogic.Product;
import lthdt.chuong3.coffeeLogic.ProductCompByName;
import lthdt.chuong3.coffeeLogic.ProductCompByPrice;

/**
 *
 * @author thang
 */
public class TestProductArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product[] sp = new Product[]{new Product("Sunsilk", 12),
                                    new Product("Lifeboy", 5), new Product("Ban Phim", 100),
                                    new Product("Mi Tom", 1), new Product("Viet", 2)};
        
        
        System.out.println("Mang ban dau la: \n"+Arrays.toString(sp));
        
        Product temp;
        
//        for(int i=0; i<sp.length-1;i++){
//            for(int j = i +1; j< sp.length;j++){
//                if(sp[i].getPrice() > sp[j].getPrice()){
//                    temp = sp[i];
//                    sp[i] = sp[j];
//                    sp[j] = temp;
//                    
//                }
//            }
//        }


//        Arrays.sort(sp, new ProductCompByPrice());
//        System.out.println("Mang sap xep tang dan theo gia la: \n"+Arrays.toString(sp));
        
        Arrays.sort(sp, new ProductCompByName());
        System.out.println("Mang sap xep tang dan theo ten la: \n"+Arrays.toString(sp));
        
        
        int index = Arrays.binarySearch(sp, new Product ("Sunsilk", 12), new ProductCompByName());
        if (index<0){
            System.out.println("Khong tim thay");
        } else{
            System.out.println("Phan tu thu " +index+ " chua gia tri can tim");
            System.out.println(sp[index]);
        }
    }
    
}
