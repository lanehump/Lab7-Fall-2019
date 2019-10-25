
/**
 * Write a description of class RomanNumerals here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class RomanNumerals
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a positive input");
        int input = sc.nextInt();
        if (input < 1 || input > 3999){
            System.out.println("Invalid input: only values between 1 and 3999");
        }
        String s = "";
        while(input >= 1000){
            s += "M";
            input -= 1000;
        }
        while(input >=  900){
            s += "CM";
            input -= 900;
        }
        while(input >= 500){
            s += "D";
            input -= 500;
        }
        while(input >= 400){
            s += "CD";
            input -= 400;
        }
        while(input >= 100){
            s += "C";
            input -= 100;
        }
        while(input >= 90){
            s += "XC";
            input -= 90;
        }
        while (input >= 50){
            s += "L";
            input -= 50;
        }
        while (input >= 40){
            s += "XL";
            input -= 40;
        }
        while (input >= 10){
            s += "X";
            input -= 10;
        }
        while (input >= 9){
            s += "IX";
            input -= 9;
        }
        while (input >= 5){
            s += "V";
            input -= 5;
        }
        while (input >= 4){
            s += "IV";
            input -= 4;
        }
        while (input >= 1){
            s += "I";
            input -= 1;
        }
        System.out.println(s);
    }
}
