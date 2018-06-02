package Publisher.Library;


/**
 * Write a description of class Point2D here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Point2D
{
    private int x;
    private int y;
    public Point2D(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.x = x;
    }
    public int[] getVectorP2D(){
        int [] vectorPoint2D = new int[2];
        vectorPoint2D[0] = this.x;
        vectorPoint2D[1] = this.y;
        return vectorPoint2D;
    }
}
