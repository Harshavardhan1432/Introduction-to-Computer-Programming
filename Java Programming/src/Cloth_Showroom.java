/*A cloth showroom has announced the following festival discount on the purchase
 of item based on the total cost of items purchased
  total cost            discount
  < 2000                5%
  2001 to 5000          25%
  5001 to 10000         35%
  > 10000               50% */
import java.util.Scanner;
public class Cloth_Showroom
{
    public static void main(String[]args)
    {
        Scanner hv = new Scanner(System.in);
        System.out.println("Please enter the amount of purchase");
        double p = hv.nextDouble();
        double discount, ta;
        if (p <= 2000)
            discount = (5*p)/100;
        else if (p >= 2001 && p <= 5000)
            discount = (25*p)/100;
        else if (p >= 5001 && p <= 10000)
            discount = (35*p)/100;
        else
            discount = (50*p)/100;
        System.out.println(discount);
        ta = p-discount;
        System.out.println("Total Amount: "+ta);
        }
    }

