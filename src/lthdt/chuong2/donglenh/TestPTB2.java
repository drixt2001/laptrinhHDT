/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong2.donglenh;

import lthdt.chuong2.logicLayer.PTbac2;
import lthdt.chuong2.logicLayer.PTbacnhat;

/**
 *
 * @author thang
 */
public class TestPTB2 {
    public static void main(String[] args) {
        System.out.println("Giai PT bac 2");
        PTbac2 pt = new PTbac2(10,20,2);
        pt.GiaiPT();
        System.out.println(pt);
        
    }
}
