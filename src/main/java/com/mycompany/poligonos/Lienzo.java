/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poligonos;

/**
 *
 * @author omar0
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author omar0
 */
public class Lienzo extends JPanel {

    /**
     * Creates new form Lienzo
     */
    public Lienzo() {
    } 
    
       @Override
        public void paint(Graphics g){
        super.paint(g);
        
        g.setColor(Color.YELLOW);
        g.fillRect(0, 50, 50, 50);
    }
}