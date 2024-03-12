import java.util.Scanner;
public class Q6 {
    public static void main(String [] args)
    {
        Scanner hv = new Scanner(System.in);
        System.out.println("Enter the units consumed");
        int units = hv.nextInt();
        double bill;
        if (units <= 50)
            bill = units * 3;
        else if (units <= 200)
            bill = (units - 50) * 4.80 + 150;
        else if (units <= 400)
            bill = (units - 200) * 5.80 + 870;
        else
            bill = (units - 400) * 6.20 + 2030;
        System.out.println(bill);
    }
}
