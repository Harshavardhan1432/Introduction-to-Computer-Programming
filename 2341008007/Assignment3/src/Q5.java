import java.util.Scanner;
public class Q5
{
    public static void main(String [] args)
    {
        Scanner hv = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = hv.nextInt();
        boolean check = year >= 1 && year <= 9999 && ((year % 100 == 0) ? (year % 400 == 0) : (year % 4 == 0));
            System.out.println(check);
    }
}
