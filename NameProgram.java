
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
        String name= new String();
        
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("What is your full name");
        
        name=Keyboard.nextLine();
        int space= name.indexOf(" ");
        
        String First=name.substring(0,space);
        int space2= name.indexOf(" ", space+1);
        
        String Midd=name.substring(space,space2);
        String Mid= Midd.substring(1,2);
        
        String Last=name.substring(space2+1);
        
        System.out.println(First+" "+Mid+" "+Last);
         
    }
}
/* Output #1
What is your full name
Kevin Sza Szafraniec
Kevin S Szafraniec

Output #2
What is your full name
Bob Smith Smith
Bob S Smith
   */