/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.donglenh.chuong1;

/**
 *
 * @author thang
 */
public class Rectangle extends Shape{
    private int upperX;
    private int upperY;
    private int lowerX;
    private int lowerY;

    public int getUpperX() {
        return upperX;
    }

    public int getUpperY() {
        return upperY;
    }

    public int getLowerX() {
        return lowerX;
    }

    public int getLowerY() {
        return lowerY;
    }

    public void setUpperX(int upperX) {
        this.upperX = upperX;
    }

    public void setUpperY(int upperY) {
        this.upperY = upperY;
    }

    public void setLowerX(int lowerX) {
        this.lowerX = lowerX;
    }

    public void setLowerY(int lowerY) {
        this.lowerY = lowerY;
    }

    
    public Rectangle() {
    }

    public Rectangle(int upperX, int upperY, int lowerX, int lowerY) {
        this.upperX = upperX;
        this.upperY = upperY;
        this.lowerX = lowerX;
        this.lowerY = lowerY;
    }
    
    @Override
    public double calcPerimeter(){
        double rs = 2*(Math.abs(upperX - lowerX)  + Math.abs(upperY - lowerY));
        return rs;
    }
    
    @Override
    public double calcArea(){
        double rs = Math.abs(upperX - lowerX) * Math.abs(upperY- lowerY);
        return rs;
    }

    @Override
    public String toString() {
        String output = "Chu vi cua hinh chu nhat la: "+ calcPerimeter() + " ; Dien tich cua hinh chu nhat la: "+ calcArea();
        return output;
    }
    
}
