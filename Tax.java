
/**
 * Write a description of class Tax here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Tax
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pleae input a 1 if you are single or a 0 if you are married");
        int status = sc.nextInt();
        System.out.println("Please input your yearly income.");
        double income = sc.nextDouble();
        
         if(status == 1 && income >= 32000){
             double tax = 25;
             double taxDue = income * (tax / 100) + 4400;
             System.out.println("You owe $" + taxDue + " in taxes.");
        }
        else if (status == 1 && income < 32000){
            double tax  = 15;
            double taxDue = income * (tax / 100) + 800;
            System.out.println("You owe $" + taxDue + " in taxes.");
        }
        else if (status == 1 && income < 8000){
            double tax = 10;
            double taxDue = income * (tax / 100);
            System.out.println("You owe $" + taxDue + " in taxes.");
        }
        else if (status == 0 && income >= 64000){
            double tax = 25;
            double taxDue = income * (tax / 100) + 8800;
            System.out.println("You owe $" + taxDue + " in taxes.");
        }
        else if (status == 0 && income < 64000){
            double tax = 15;
            double taxDue = income * (tax / 100) + 1600;
            System.out.println("You owe $" + taxDue + " in taxes.");
        }
        else if (status == 0 && income < 16000){
            double tax = 10;
            double taxDue = income * (tax / 100);
            System.out.println("You owe $" + taxDue + " in taxes.");
        }
    }
}
