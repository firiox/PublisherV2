package Publisher.View;

import Publisher.Controller.*;
import Publisher.Library.*;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Write a description of class Fractal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fractal extends Canvas{
    private BufferedImage canvas;    
    private final int pixelSize = 10;
    public Fractal(int wigth, int heath)
    {
        setBackground(Color.BLACK);
        this.canvas = new BufferedImage(wigth,heath, BufferedImage.TYPE_INT_ARGB);       
        
    }
    
    public void paint(Graphics g){
        super.paint(g);
        //g.drawString("Lienzo de Dibujo Canvas",40,40);
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(canvas,null,null);   
    }
}
