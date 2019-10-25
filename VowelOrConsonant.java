
/**
 * Write a description of class VowelOrConsonant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class VowelOrConsonant
{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please input a letter");
        String vowels = new String("aeiou");
        String consonants = new String("abcdfghjklmnpqrstvwxyz");
        String one = scan.next();
        String one2 = one.toLowerCase();
        
        if (one2.length() > 1){
            System.out.print("ERROR: String cannot be more than 1 character");
        }
        else if(vowels.contains(one2)){
            System.out.println("Your letter " + one + " is a vowel");
        }
        else if(consonants.contains(one2)){
            System.out.println("Your letter " + one + " is a consonant");
        }
        else{
            System.out.println("ERROR: You cannot enter a number");
        }
    }
}
