
/**
 * Write a description of class Lab2a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;
public class Lab2a
{
    public static void main(String[] args)
    {
        System.out.println("Enter a random number in seconds: ");
        Scanner Keyboard= new Scanner(System.in);
        int sec = Keyboard.nextInt();
        int min;
        int hr;
        int second;
        
        hr= sec/3600;
        sec = sec % 3600;
        min = sec/ 60;
        sec = sec % 60;
        
        
        
        
        
        
        
        
        System.out.println("h:"+hr+" m:"+min+" s:"+sec);
        
        
    }
}
