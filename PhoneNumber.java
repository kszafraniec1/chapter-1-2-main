
/**
 * Create a random phone number
 *
 * Kevin Szafraniec
 * @version (a version number or a date)
 */

import java.util.Random;
public class PhoneNumber
{
    public static void main(String[] args)
    {
        
        Random generator = new Random();
        //Generate numbers for the random phone number
        int first= generator.nextInt(8);
        int first2= generator.nextInt(8);
        int first3= generator.nextInt(8);
        int med = generator.nextInt(742);
        int last = generator.nextInt(10000);
        
        
        System.out.println("The random number is "+first+first2+first3+"-"+med+"-"+last);
    }
}
/*
 * The random number is 762-385-2003
 * The random number is 552-301-491
   */