//  The population of a country increases by 6% every year. The population after 3 years.
// PO = prep * 1.06 * t
import java.util.Scanner;
public class population
{
    public static void main(String [] args)
    {
        try (Scanner hv = new Scanner(System.in)) {
            System.out.println("Please enter the present population of the country");
            int prep = hv.nextInt();
            System.out.println("Please enter the time period");
            int t = hv.nextInt();
            double po = prep * Math.pow(1.06,t);
            System.out.println("The population after "+t+" years is " + po);
        }
    }
}
