
/**
 * Write a description of class NameProgram here.
 *
 * Kevin Szafraniec
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class NameProgram
{
    public static void main(String[] args)
    {
        String first= new String();
        String middle= new String();
        String last= new String();
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("What is your First name");
        first=Keyboard.nextLine();
        System.out.println("What is your Middle name");
        middle=Keyboard.nextLine();
        System.out.println("What is your Last name");
        last=Keyboard.nextLine();
        System.out.println(first+" "+middle.charAt(0)+" "+last);
    }
}
/*
 * What is your First name
Kevin 
What is your Middle name
Sza
What is your Last name
Szafraniec
Kevin  S Szafraniec
What is your First name
Bob
What is your Middle name
Smith
What is your Last name
Smith
Bob S Smith
   */