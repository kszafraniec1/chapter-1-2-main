
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Circle
{
    public static void main(String[] args)
    {
        Scanner Keyboard = new Scanner(System.in);
        int r;
        double area;
        double circumference;
        DecimalFormat format = new DecimalFormat("0.####");
        System.out.println("What is the circles radius: ");
        r = Keyboard.nextInt();
        area=Math.PI*Math.pow(r,2);
        circumference= 2*Math.PI*r;
        System.out.println("The circle's area is "+format.format(area));
        System.out.println("The circle's circumference is "+format.format(circumference));
    }
}
