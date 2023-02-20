/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poligonos;
import javax.swing.JFrame;
/**
 *
 * @author omar0
 */
public class Ventana extends JFrame{
    public Ventana(){
        this.setTitle("Poligonos");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        NewJFrame l = new NewJFrame();
        this.add(l);
    }
}
