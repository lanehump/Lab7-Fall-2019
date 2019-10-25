
/**
 * Write a description of class Month here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Month
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();//creates my variable for user input
        
        //Statements to make a decision on what to print
        if (month == 4 || month == 6 || month == 9 || month == 11){
            System.out.println("There are 30 days in month: " + month);
        }
        else if (month == 2){
            System.out.print("There are 28 days in month " + month + " unless it is a leap year ");
            System.out.println("if it is a leap year there will be 29 days");
        }
        else{
            System.out.println("There are 31 days in month: " + month);
        }
    }
}
