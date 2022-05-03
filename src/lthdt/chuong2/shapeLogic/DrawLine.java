/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong2.shapeLogic;

import java.awt.Graphics2D;

/**
 *
 * @author thang
 */
public class DrawLine {
    private Graphics2D gr;
    private Line line;

    public DrawLine() {
    }

    public DrawLine(Graphics2D gr, Line line) {
        this.gr = gr;
        this.line = line;
    }

    public Graphics2D getGr() {
        return gr;
    }

    public void setGr(Graphics2D gr) {
        this.gr = gr;
    }

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }
    
    public void VeDuongThang(){
        gr.drawLine(line.getBeginX(), line.getBeginY(), line.getEndX(), line.getEndY());
    }
}
