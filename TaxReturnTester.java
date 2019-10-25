
/**
 * Write a description of class TaxReturnTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TaxReturnTester
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your yearly salary");
        double income = sc.nextDouble();
        System.out.println("Please input true if you are single or false if you are married");
        boolean single = sc.nextBoolean();
        TaxReturn one = new TaxReturn(income, single);
        one.calculateTax();
    }
}
