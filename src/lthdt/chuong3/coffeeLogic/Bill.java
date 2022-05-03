/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong3.coffeeLogic;

/**
 *
 * @author thang
 */
public class Bill implements Cloneable{
    private int ID;
    private Product[] product;

    public Bill() {
    }

    public Bill(int ID, Product[] product) {
        this.ID = ID;
        this.product = product;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }

    @Override
    public String toString() {
        String KQ = "Bill: " + this.ID + " \n";
        for(int i =0; i <product.length;i++){
            KQ += "\t "+ product[i].toString() + "\n";
        }
        return KQ;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Bill temp = (Bill) super.clone();
        temp.setID(this.ID);
        temp.product = new Product[this.product.length];
        for(int i=0;i<this.product.length;i++){
            temp.product[i] = new Product(this.product[i].getName(),this.product[i].getPrice());
            
        }
        return temp;
    }
    
    
}
