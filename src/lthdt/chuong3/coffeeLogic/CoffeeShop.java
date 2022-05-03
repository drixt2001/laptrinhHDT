/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong3.coffeeLogic;

/**
 *
 * @author thang
 */
public class CoffeeShop {
    private String name;
    private String diachi;

    public CoffeeShop() {
    }

    public CoffeeShop(String name, String diachi) {
        this.name = name;
        this.diachi = diachi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return "CoffeeShop{" + "name=" + name + ", diachi=" + diachi + '}';
    }
    
    
}
