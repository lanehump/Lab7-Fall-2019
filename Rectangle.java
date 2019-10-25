
/**
 * Write a description of class Rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangle
{
    private double x;
    private double y;
    private double x2;
    private double y2;
    /**
     * Constructs Rectangle Object with two sets of x, y coordinates
     * @param coordinateX your first X coordinate
     * @param coordinateY your first Y coordinate
     * @param coordinateX2 your second X coordinate
     * @param coordinateY2 your second Y coordinate
     */
    public Rectangle(double coordinateX, double coordinateY, double coordinateX2, double coordinateY2){
        x = coordinateX;
        y = coordinateY;
        x2 = coordinateX2;
        y2 = coordinateY2;
    }
    public void printOrientation(){
        if (Math.abs(x - x2) == Math.abs(y - y2)){
            System.out.println("The rectangle is a square");
        }
        else if(Math.abs(x - x2) < Math.abs(y - y2)){
            System.out.println("The rectanlge is a portrait");
        }
        else if (Math.abs(x - x2) > Math.abs(y - y2)){
            System.out.println("The ractangle is a landscape");
        }
    }
}
