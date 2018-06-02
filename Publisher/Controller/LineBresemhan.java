package Publisher.Controller;
import Publisher.Library.*;
import java.util.ArrayList;
/**
 * Write a description of class LineBresemhan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LineBresemhan
{
    private Point2D point1;
    private Point2D point2;
    private ArrayList<Point2D> points;
    public LineBresemhan(Point2D point1,Point2D point2)
    {
        this.point1 = point1;
        this.point2 = point2;
        this.points = new ArrayList<>() ;
    }
    public void drawLine() {
        // delta of exact value and rounded value of the dependent variable
        int x1 = point1.getX(); 
        int y1 = point1.getY();
        int x2 = point2.getX();
        int y2 = point2.getY();
        
        int d = 0;
 
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
 
        int dx2 = 2 * dx; // slope scaling factors to
        int dy2 = 2 * dy; // avoid floating point
 
        int ix = x1 < x2 ? 1 : -1; // increment direction
        int iy = y1 < y2 ? 1 : -1;
 
        int x = x1;
        int y = y1;
 
        if (dx >= dy) {
            while (true) {
                points.add(new Point2D(x,y));
                
                //System.out.println(x+"  "+y);
                if (x == x2){
                    break;
                }
                x += ix;
                d += dy2;
                
                if (d > dx) {
                    y += iy;
                    d -= dx2;
                }
            }
        } else {
            while (true) {
                points.add(new Point2D(x,y));
                if (y == y2)
                    break;
                y += iy;
                d += dx2;
                if (d > dy) {
                    x += ix;
                    d -= dy2;
                }
            }
        }
    }
    
    public ArrayList<Point2D> rotate(int angle){
        ArrayList<Point2D> routePoint2D = new ArrayList<Point2D>();
        return routePoint2D;
    }
    public ArrayList<Point2D> projection(){
        ArrayList<Point2D> projectionPoint2D = new ArrayList<Point2D>();
        return projectionPoint2D;
    }
    public ArrayList<Point2D> getPoints(){
        return points;
    }
}
