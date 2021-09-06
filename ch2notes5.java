    /********************************************************************
// These are the notes for ch 2 used in hayes class
//******************************************************************* */
//Kevin Szafraniec
//8/25/21
//Notes
//Notes
//Who helped me: Mr. Hayes

import java.util.Random; // lets us use the random class
//you import the Scanner Class!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
import java.util.Scanner; // last word is the the Class



import java.util.*;  // let me use any class in the package

//import java.text.*;

import java.text.NumberFormat;
import java.text.DecimalFormat;



public class ch2notes5

{   enum Flavor {chocolate, strawberry, mitChocolateChip, razberry}
    public static void main (String[] args)
    {
        //Scanner scan = new Scanner (System.in);
        Scanner Keyboard = new Scanner(System.in);
    
        //Flavor cone = Flavor.razberry;
    
        //these are basic data types
            int length;
            int x = 9,y,z;
            int id = 789;
            double num = 5, num1 = 23.89765, num2 = 3.4;
            char letter = 'd';
            //char is the same thing as an int
            boolean choice = false;
    
            //These are Objects
            Integer number = new Integer(47); //wrapper class, wc for all basic data types
            
            /*
             * Class id can start with a letter or a _. cannot use a period or dash. can use dollar sign. No white space
             * "new" is a must!!!!! constructor(same as the class)(data)
             */                              //Constructor
            String myname = new              String("Kevin Szafraniec");
            Integer n2 = 7;//Auto Boxing
    /**/
            String word = new String("Homer Simpson");
            String word2 = new String("Homer Simpson");
            String word3 = new String("Bart Simpson");
            String name = new String();
            String name1 = new String("Kevin");
            // If you start with a string then you cannot add an equation and the numbers will be converted to strings
            System.out.println(word + name + 7 + 5);
            //If you start with an equation then add a string then it will add then put the word
            System.out.println(7+5+word);
            //String is special - no other class/object can do this
            String last = "Szafraniec";
    
    
    /*      //pdf of how to use printf(print formatting)
            System.out.printf("Name:  %s \t ID: %5d \n", name,id);
            System.out.println( 'a' + 100 );
            System.out.println('a'   );
            System.out.println("A"+100  );
    
    //      System.out.printf(  );
    
    //      System.out.printf( );
    
            System.out.println(  );
    
        System.out.println( );
        System.out.println(  );
    
    /*
    
            num1 = 23.89765; num2 = 3.4;
    //Your create a NumberFormat and Decimalformat object
            NumberFormat money = NumberFormat.getCurrencyInstance();
            NumberFormat percent = NumberFormat.getPercentInstance();
            DecimalFormat fmt =new DecimalFormat("0.###");// however decimals you need
            DecimalFormat fmt2= new DecimalFormat("0.00");// ## vs 00 this will only leave you with 2 decimal places
            
    //object.method
            System.out.println( "Sub Total: " + money.format(num1) );
            System.out.println( "Sub Total: " + percent.format(num1) );
            System.out.println( "Sub Total: " + fmt.format(num2) );
            System.out.println( "Sub Total: " + fmt2.format(num1) );
    
    
    // page 90 Why do we get this Error???
    //nextDouble(),nextInt(),nextLong(),
    /*
            System.out.print("Enter a number ");
            x = Keyboard.nextInt   ();
            System.out.println(x  );
            System.out.print("Enter a word ");
            
            
            Keyboard.nextLine   ();
            word = Keyboard.next   ();//get input up to white space
            //word1 = Keyboard.nextLine   ();//gets input to \n
            System.out.println(word);
            
            System.out.print("Enter 3 numbers ");
            x = Keyboard.nextInt   ();
            y = Keyboard.nextInt   ();
            z = Keyboard.nextInt   ();
            System.out.print(x+" "+y+" "+z);
    
    /*
            System.out.print("Enter a decimal");
            num = Keyboard.nextDouble ();
            System.out.println(num  );
    
    
            // what happens when you have both of these together
    /*
            System.out.print("Enter a word");
            Keyboard.nextLine();
            word = Keyboard.nextLine();
            System.out.println(word  );
    
    /*      System.out.println( "enter a word" );
            word = Keyboard.nextLine();
            System.out.println(word  );
    /*
            System.out.print("Enter a word "  );
            word = Keyboard.next   ();
            lname = Keyboard.next();
            System.out.println(word + "\n" + lname  );
    
    
    
    /*
    //  Can we make a Math Object? What type of class is Math???
    //math class is on p88
    //Math is a static class
//        Math silly = new Math();//error cannot make an dobject out of static class
    
            System.out.println(Math.abs(-4));
            System.out.println(Math.sqrt (12));
            System.out.println(Math.pow(2,3));
    //      System.out.println(silly.pow(2,4));
    
    
    /*
    //!!!!!!!!!!!! Make a Random Object called generator
            Random generator = new Random();
    
            //0-99
            x = generator.nextInt(100);//gives number 0-99 (100 numbers)
            System.out.println("the Random number is " + x);
    
            //decimal of 17 digits * howmany +range
            num =generator.nextDouble()*50;
            System.out.println(num);
    
            //100-200 + 100
            //how many + range
            num1 =Math.random()*100 + 100;
            System.out.println(num1);
    /*
    
    /*
    //----------------------------Know it live it love it p 78
            //word is an oject can do things (NOT len(word))
            System.out.println(  word.length() );
            System.out.println(word == word2 ); //comparing memory adress
            //objects use equals to determin like characteristics
            System.out.println(word.equals(word2));
            System.out.println( x == 9 );
            System.out.println(  word.compareTo(word3 ));//postive number comes after negitive is before
            System.out.println(  word.indexOf("p"));
            System.out.println(  word.charAt(6));
            //slice up the String
            System.out.println(  word.substring(word.indexOf("S")));
            //from index to endIndex
            int find = word.indexOf("S");
            System.out.println(word.substring(find,find+2));
            
            
    
    
    
    
    
    
    //System.out.println((int)(letter + letter ) );
    
        //System.out.println( (char)101 );
    /*
            x=9;//9.0/5 is promotion (promotes 5 to 5.0)
            double conversionFactor = (double)x/5; //9/5 logic error -- promotion 5.0
            System.out.println(conversionFactor);
            final int BASE = 32;            // cast is (data type)
            int celsiusTemp = 30;
    
            double fahrenTemp = celsiusTemp * conversionFactor + BASE;
    
            System.out.println("Celsius Temp: " + celsiusTemp );
            System.out.println("Fahrenheit Equivalent: " + fahrenTemp  );
    
            
            System.out.println((int)(Math.random()*100));
    /**/
        num = 3;
        //num = num + num;
        //num = num - num;
        //num = num * num;
        //num = num / num;
        num = num % 7;
        System.out.println(num);
    
    
    
        /**/
        // this will help section out code
    }//end of main
}//end of class
/* 
 * Output #1
Homer Simpson75
12Homer Simpson
3.0

 */
















