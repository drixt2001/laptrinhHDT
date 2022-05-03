/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong2.logicLayer;

/**
 *
 * @author thang
 */
public class PTbacnhat implements GiaiPT{
    private double a;
    private double b;
    private double x;
    private String KQ;
    
    public PTbacnhat() {
    }

    public PTbacnhat(double a, double b) {
        this.a = a;
        this.b = b;
    }
    

    @Override
    public void GiaiPT() {
        if(a != 0){
            x = -b / a;
            KQ = "Phuong trinh bac 1 co nghiem la: "+x;
        } else if(b != 0){
            KQ = "Phuong trinh bac 1 vo  nghiem";
        } else if (b == 0){
            KQ = "Phuong trinh bac 1 co vo so nghiem";
        }
    }

    @Override
    public String toString() {
        if(KQ == null && KQ.isEmpty()){
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

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public String getKQ() {
        return KQ;
    }

    public void setKQ(String KQ) {
        this.KQ = KQ;
    }
    
    
}
