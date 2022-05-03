/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.donglenh.chuong1;

/**
 *
 * @author thang
 */
public class Circle extends Shape{
    private  int radius;
    private int x, y;

    public int getRadius() {
        return radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    

    public Circle() {
    }

    public Circle(int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }
    
    @Override
    public double calcPerimeter(){
        double result = 2 * radius * Math.PI;
        return result;
    }
    
    @Override
    public double calcArea(){
        double result = Math.PI * radius * radius;
        return result;
    }

    @Override
    public String toString() {
        String output = "Chu vi cua hinh tron la: "+ calcPerimeter() + " ; Dien tich cua hinh tron la: "+ calcArea();
        return output;
    }
    
    
    
}
