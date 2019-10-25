
/**
 * Write a description of class TaxReturn here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TaxReturn
{
    private double income;
    private boolean single;
    public TaxReturn(double amount, boolean status){
        income = amount;
        single = status;
    }
    public void calculateTax(){
        if (income >= 510301 && single == true){
            double tax = 37;
            double taxDue = 153798.5 + (income - 510300) * (tax / 100);
            System.out.println("You owe $" + taxDue + " in taxes.");
        }
        else if(income >= 204101 && single == true){
            double tax = 35;
            double taxDue = 46628.5 + (income - 204100) * (tax / 100);
            System.out.println("You owe $" + taxDue + " in taxes.");
        }
        else if (income >= 160726 && single == true){
            double tax = 32;
            double taxDue = 32748.5 + (income - 160725) * (tax / 100);
            System.out.println("You owe $" + taxDue + " in taxes.");
        }
        else if (income >= 84201 && single == true){
            double tax = 24;
            double taxDue = 14382.5 + (income - 84200) * (tax / 100);
            System.out.println("You owe $" + taxDue + " in taxes.");
        }
        else if (income >= 39476 && single == true){
            double tax = 22;
            double taxDue = 4543 + (income - 39475) * (tax /100);
            System.out.println("You owe $" + taxDue + " in taxes.");
        }
        else if (income >= 9701 && single == true){
            double tax = 12;
            double taxDue = 970 + (income - 9700) * (tax / 100);
            System.out.println("You owe $" + taxDue + " in taxes.");
        }
        else if (income >= 0 && single == true){
            double tax = 10;
            double taxDue = income * (tax / 100);
            System.out.println("You owe $" + taxDue + " in taxes.");
        }
        else if (income >= 612351 && single == false){
            double tax = 37;
            double taxDue = 164709.5 + (income - 612350) * (tax / 100);
            System.out.println("You owe $" + taxDue + " in taxes.");
        }
        else if (income >= 408201 && single == false){
            double tax = 35;
            double taxDue = 93257 + (income - 408200) * (tax / 100);
            System.out.println("You owe $" + taxDue + " in taxes.");
        }
        else if (income >= 321451 && single == false){
            double tax = 32;
            double taxDue = 65497 + (income - 321450) * (tax / 100);
            System.out.println("You owe $" + taxDue + " in taxes.");
        }
        else if (income >= 168401 && single == false){
            double tax = 24;
            double taxDue = 28675 + (income - 168400) * (tax / 100);
            System.out.println("You owe $" + taxDue + " in taxes.");
        }
        else if (income >= 78951 && single == false){
            double tax = 22;
            double taxDue = 9086 + (income - 78950) * (tax / 100);
            System.out.println("You owe $" + taxDue + " in taxes.");
        }
        else if (income >= 19401 && single == false){
            double tax = 12;
            double taxDue = 1940 + (income - 19400) * (tax / 100);
            System.out.println("You owe $" + taxDue + " in taxes.");
        }
        else if (income >= 0 && single == false){
            double tax = 10;
            double taxDue = income * (tax / 100);
            System.out.println("You owe $" + taxDue + " in taxes.");
        }
    }
}
