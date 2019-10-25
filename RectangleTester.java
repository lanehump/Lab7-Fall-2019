
/**
 * Write a description of class RectangleTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class RectangleTester
{
    public static void main(String[]args){
        //Constructs scanner object
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please input your first ordered pair then second ordered pair with no commas or parenthesis");
        
        //Creates variables with user input
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        
        //Constructs rectangle object
        Rectangle rect = new Rectangle(x, y, x2, y2);
        //Calls method to print the orientation
        rect.printOrientation();
    }
}
