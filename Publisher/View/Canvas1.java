package Publisher.View;
import Publisher.Controller.*;
import Publisher.Library.*;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;

import java.util.ArrayList;
import java.util.Stack;
import java.lang.Math;
/**
 * Write a description of class Canvas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Canvas1 extends Canvas
{
    private BufferedImage canvas;
    private LineBresemhan line;
    private Triangle triangle;
    private Quadrilateral quadrilateral;
    private CircleBresenham circle;
    
    private final int pixelSize = 10;
    public Canvas1(int wigth, int heath)
    {
        setBackground(Color.BLACK);
        this.canvas = new BufferedImage(wigth,heath, BufferedImage.TYPE_INT_ARGB);       
        //line(0,0,50,50,Color.BLUE);
        //triangle(100,50,150,100,75,100,Color.RED);
        //quadrilateral(300,300,150,200,Color.YELLOW);
        //quadrilateral(300,300,450,450,Color.YELLOW);
        //quadrilateral(450,450,525,525,Color.YELLOW);
        //quadrilateral(375,450,525,525,Color.YELLOW);
        //quadrilateral(300,450,300,525,Color.YELLOW);
        //circle(200,200,20,Color.GREEN);
        //circleTranslate(300,300,Color.GREEN);
        //circleTranslate2(300,300,Color.GREEN);
        //line(50,50,250,250,Color.BLUE);
        //arbolDePitagoras();
        curvaDeKoch();
        int x = 300;
        int y = 400;
        int x1 =600;
        int y1 = 400;
        line = new LineBresemhan(new Point2D(x,y),new Point2D(x1,y1));
        line.drawLine();
        Color c = Color.GREEN;
        int color = c.getRGB();
        int color2 = color.PURPLE.getRGB();
        int color3 = Color.BLUE.getRGB();
        drawnPoint(line.getPoints(),color);
        ArrayList<Point2D> p = line.getPoints();
        int xk = 497;
        int yk = 400;
        Point2D p1 = new Point2D(xk,yk);
        int angle = 25;
        //line(x, y, x1, y1, Color.BLACK);
        ArrayList<Point2D> p2 = rote( p , p1 ,  angle);
        ArrayList<Point2D> p3 = rote( p , p1 ,  1);
        ArrayList<Point2D> p4 = rote( p , p1 ,  20);
        //ArrayList<Point2D> p5 = rote( p , p1 ,  90);
        drawnPoint(p2, color);
        drawnPoint(p3, color2);
        drawnPoint(p4, color3);
        //drawnPoint(p5, color);
    }
    
    public void paint(Graphics g){
        super.paint(g);
        //g.drawString("Lienzo de Dibujo Canvas",40,40);
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(canvas,null,null);   
    }
    
    public void line(int x, int y, int x1, int y1,Color c){
        int color = c.getRGB();
        line = new LineBresemhan(new Point2D(x,y),new Point2D(x1,y1));
        line.drawLine();
        drawnPoint(line.getPoints(),color);
    }
    
    public void triangle(int x1, int y1, int x2, int y2, int x3, int y3, Color c){
        int color = c.getRGB();
        triangle = new Triangle(new Point2D(x1,y1),new Point2D(x2,y2),new Point2D(x3,y3));
        drawnPoint(triangle.getPointTriangle(),color);
    }
   
    public void quadrilateral(int x1, int y1, int x2, int y2, Color c){
        int color = c.getRGB();
        Quadrilateral quadrilateral = new Quadrilateral(new Point2D(x1,y1),new Point2D(x2,y2));
        drawnPoint(quadrilateral.getPoint2DQuadrilateral(),color);
    }
    
    public void circle(int xc, int yc, int radio, Color c){
        int color = c.getRGB();
        this.circle = new CircleBresenham(new Point2D(xc,yc),radio);
        drawnPoint(circle.calcule(),color);
    }
    
    public void drawnPoint(ArrayList<Point2D> points,int color){
        for(Point2D p :points){
           this.canvas.setRGB(p.getX(),p.getY(),color);
           repaint();
        }        
    }    
    
    public void circleTranslate(int x, int y, Color c){
        int color = c.getRGB();
        Point2D point = new Point2D(x,y);
        Point2D pointCenter = this.circle.getPointCenter();
        LineBresemhan center = new LineBresemhan(pointCenter,point);
        center.drawLine();
        for(Point2D p: line.getPoints()){
            this.circle.setPointCenter(point);
            drawnPoint(this.circle.calcule(),color);
        }    
    }
    
    private ArrayList<Point2D> rote(ArrayList<Point2D> points, Point2D pointNew, int degrees){
        int x, y;
        ArrayList<Point2D> aux = new ArrayList<Point2D>();
        Point2D pointAux;
        double radians = Math.toRadians(degrees);
        for(Point2D point:points){
            int xcos = (int)(point.getX()*Math.cos(radians));
            int ysin = (int)(point.getY()*Math.sin(radians));
            int xsin = (int)(point.getX()*Math.sin(radians));
            int ycos = (int)(point.getY()*Math.cos(radians));
            x = xcos - ysin;            
            y = ysin + ycos;
            pointAux = new Point2D(x,y);
            aux.add(pointAux);
        }
        return aux;
    }
    
    
    
    private void arbolDePitagoras(){
        int x, y, iniLado;
        x= 800;
        y= 600;
        iniLado = 100;  
        Point2D inicio = new Point2D(x,y);
        int x1,x2,y1,y2;
        x1= 650;
        x2= 750;
        y1= 600;
        y2= 500;
        quadrilateral(x1,y1,x2,y2, Color.YELLOW);
        
        int[] xyeeeh;
        //nuevo=arbolDePitagoras(x1,x2,y2);  
    }
    private void curvaDeKock(int nivelActual, int nivelObjetivo){
    
    }
    /*metodo del fractal dando un nivel*/
    /*
    private void curvaDeKoch(int nivel){
        int x1 = 350;
        int x2 = 650;
        int y1 = 500;
        int y2 = 500;        
        Point2D[] puntos;
        if( nivel == 0){
        line(x1, y1, x2, y2, Color.BLUE);            
        }
        else if(nivel == 1){
        line(x1, y1, x2, y2, Color.BLUE);                
        Point2D limiteIzquierdo = new Point2D(x1,y1);
        Point2D limiteDerecho = new Point2D(x2,y2);
        curvaDeKoch(limiteIzquierdo, limiteDerecho, 5);
        }
        else{
            curvaDeKoch(1);
            
            int aux =(int) Math.pow( 4, nivel );
            Point2D puntos1 = new Point2D[aux]; 
        
        } 
    }
    */
    /*metodo de animacion delfractal*/
    private void curvaDeKoch(){        
        int x1 = 350;
        int x2 = 650;
        int y1 = 500;
        int y2 = 500;        
        line(x1, y1, x2, y2, Color.BLUE);            
        Point2D limiteIzquierdo = new Point2D(x1,y1);
        Point2D limiteDerecho = new Point2D(x2,y2);
        curvaDeKoch(limiteIzquierdo, limiteDerecho, 3);
        
    }
    /* metodo para subir de nivel*/
    
    private void curvaDeKoch(Point2D lIzq, Point2D lDer, int niveles){
      if( niveles > 0){         
        niveles--;
        
        Point2D puntoMedio = puntoMedio(lIzq, lDer);
        int distancia = distancia(lIzq, lDer);
        int redu = distancia/5;
        
        Point2D puntoArriba = pRelativY( puntoMedio, -redu);
        Point2D puntoIzquierda = pRelativX( puntoMedio, -redu);
        Point2D puntoDerecha = pRelativX( puntoMedio , redu);
        line(puntoArriba, puntoIzquierda, Color.BLUE);
        line(puntoArriba, puntoDerecha, Color.BLUE);
        line(puntoIzquierda,puntoDerecha, Color.BLACK);
        curvaDeKoch(lIzq,puntoIzquierda ,niveles-1);
        curvaDeKoch(puntoIzquierda,puntoArriba,niveles-1);
        curvaDeKoch(puntoArriba,puntoDerecha,niveles-1);
        curvaDeKoch(puntoDerecha,lDer,niveles-1);
      }
    }
    private void line(Point2D a, Point2D b, Color c){
        int x1 = a.getX();
        int x2 = b.getX();
        int y1 = a.getY();
        int y2 = b.getY();
        line(x1,y1,x2,y2,c);
    }
    private Point2D puntoMedio(Point2D a, Point2D b){
        int x1 = a.getX();
        int x2 = b.getX();
        int y1 = a.getY();
        int y2 = b.getY();
        int xMed = (x1 + x2)/2;
        int yMed = (y1 + y2)/2;
        Point2D puntoMedio = new Point2D(xMed, yMed);
        return puntoMedio;
    }
    private Point2D pRelativX(Point2D p, int mov){
        int x = p.getX();
        x += mov;
        int y = p.getY();
        Point2D nuevo = new Point2D(x,y);
        return nuevo;
    }
    private Point2D pRelativY(Point2D p, int mov){
        int y = p.getY();
        y += mov;
        int x = p.getX();
        Point2D nuevo = new Point2D(x,y);
        return nuevo;
    }
    private int distancia(Point2D a, Point2D b){
        int x1 = a.getX();
        int x2 = b.getX();
        int y1 = a.getY();
        int y2 = b.getY();
        int distancia = (int) Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2) );
        return distancia;
    }
    
    /*
    private int[] arbolDePitagoras(int[] xyeeeh){
        cuadrado(x1,y2,color,angulo);
        cuadrado(x2,y2,color,-angulo);
    }
    */
}
// public void drawnPoint(ArrayList<Point2D> points,int color){
        // int left,top;
        // int w = (getWidth() - 1) / pixelSize;
        // int h = (getHeight() - 1) / pixelSize;
        // int maxX = (w - 2) / 2;
        // int maxY = (h - 2) / 2; 
        // int borderX = getWidth() - ((2 * maxX + 1) * pixelSize + 1);
        // int borderY = getHeight() - ((2 * maxY + 1) * pixelSize + 1);
        // for(Point2D p :points){
            // left = (p.getX() + maxX) * pixelSize + borderX / 2;
            // top = (p.getY() + maxY) * pixelSize + borderY / 2; 
            // this.canvas.setRGB(left,top,color);
           // // this.canvas.setRGB(p.getX(),p.getY(),color);
           // repaint();
        // }        
    // }
