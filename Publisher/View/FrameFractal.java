package Publisher.View;


import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JDialog;
import Publisher.Controller.*;
import Publisher.Library.*;
import Publisher.View.*;
/**
 * Write a description of class FrameFractal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FrameFractal extends Frame
{
    private static Fractal canvas;   

    
    public FrameFractal()
    {
        canvas = new Fractal(1600,800);
        add(canvas);
        
        setTitle("Publisher Graficacion Por Computadora");
        setSize(1600, 800);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String [] arg){
        FrameFractal frameF = new FrameFractal();
        //Point2D p1 = new Point2D(50,50);
        //Point2D p2 = new Point2D(250,250);
        //LineBresemhan l1 = new LineBresemhan(p1,p2);
        //l1.drawLine();
        //line(50,50,250,250, null);
    }
}
