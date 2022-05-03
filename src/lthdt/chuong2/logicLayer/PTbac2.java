/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong2.logicLayer;

/**
 *
 * @author thang
 */
public class PTbac2 implements GiaiPT{
    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;
    private String KQ;

    public PTbac2() {
    }

    public PTbac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
      
    }

    @Override
    public void GiaiPT() {
        if(a == 0){
//            giai PT bac 1
            PTbacnhat pt1 = new PTbacnhat(b,c);
            pt1.GiaiPT();
            KQ = pt1.getKQ();
              
        } else {
            double delta = b*b - 4*a*c;
            if(delta < 0){
                KQ = "Phuong trinh vo nghiem";
            } else if (delta == 0){
                x1 = -b/(2*a);
                KQ = "Phuong trinh co nghiem kep la: "+x1;
            } else {
                x1 = (-b + Math.sqrt(delta))/2*a;
                x2 = (-b - Math.sqrt(delta))/2*a;
                KQ = "Phuong trinh co 2 nghiem la x1: "+x1+" va x2: "+x2;
            }
        }
    }

    @Override
    public String toString() {
        if(KQ == null || KQ.isEmpty()){
            GiaiPT();
        }
        return KQ;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public String getKQ() {
        return KQ;
    }

    public void setKQ(String KQ) {
        this.KQ = KQ;
    }
    
    
}
