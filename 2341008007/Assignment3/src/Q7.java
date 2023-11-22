import java.util.Scanner;
public class Q7 {
    public static void main(String [] args)
    {
        Scanner hv = new Scanner(System.in);
        System.out.print("No. of units consumed: ");
        int units = hv.nextInt();
        System.out.print("Do you want to pay online (y/n): ");
        char des =  hv.next().charAt(0);
        String fun = Character.toString( 128_512 );
        if (des == 'y')
        {
        double bill;

        if (units <= 50)
            bill = units * 3;
        else if (units <= 200)
            bill = (units - 50) * 4.80 + 150;
        else if (units <= 400)
            bill = (units - 200) * 5.80 + 870;
        else
            bill = (units - 400) * 6.20 + 2030;

        System.out.println("Total Amount: " + bill);
        double discount = (bill * 3)/100;
        bill = bill - discount;
        System.out.println("Discount : " + discount + " " + fun );
        System.out.println("Amount payable :" + bill);
        }
        else
            System.out.println("You missed the discount 🙁");
    }
}
