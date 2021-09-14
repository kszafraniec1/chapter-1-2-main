/**
 * Write a description of class Coin here.
 *
 * Kevin Szafraniec
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class Coin
{
    public static void main(String[] args)
    {
        Scanner Keyboard = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        double quarterT;
        double dimeT;
        double nickelT;
        double pennieT;
        double Total;
        
        System.out.println("\nHow many quarters do you have ");
        int quarter = Keyboard.nextInt();
        
        System.out.println("How many dimes do you have ");
        int dime = Keyboard.nextInt();
        
        System.out.println("How many nickels do you have ");
        int nickels = Keyboard.nextInt();
        
        System.out.println("How many pennies do you have ");
        int pennies = Keyboard.nextInt();
        
        //Calculating coin values
        quarterT=quarter*.25;
        dimeT=dime*.1;
        nickelT=nickels*.05;
        pennieT=pennies*.01;
        Total=quarterT+dimeT+nickelT+pennieT;
        //displaying currency format
        System.out.println("\nYour total is: "+money.format(Total));
        
        
    }
}
