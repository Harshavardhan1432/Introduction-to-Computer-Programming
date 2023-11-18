/* Calculate the wages of the daily labours as per the following units

For the first 10 hours          60
For the next 6 hours            15/hr
For the next 4 hours            18/hr
For the next 1 hour             25/hr
 */
import java.util.Scanner;

public class Daily_wages
{
    public static void main(String[]args)
    {
        Scanner hv = new Scanner(System.in);
        System.out.println("Please enter the no. of hours worked");
        int hours = hv.nextInt();
        int wages;
        if (hours<=10)
            wages = 60;
        else if (hours<=16)
            wages = 60+(hours - 10)*15;
        else if (hours <= 20)
            wages = 150 + (hours-16)*18;
        else
            wages = 222 + (hours - 20)*25;
        System.out.println("Hours worked " + hours);
        System.out.println("Wages " + wages);
    }
}

