import java.util.Scanner;
public class Q9
{
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = hv.nextInt();
        int dup = num, rev = 0;
        while (num != 0)
        {
            int r = num % 10;
            if (r != 0)
                rev = rev * 10 + r;
            num /= 10;
        }
        int rem = 0;
        while (rev != 0)
        {
            int r = rev % 10;
            rem = rem * 10 + r;
            rev /= 10;
        }
        System.out.println("After removing zeros from the number " + dup + " the new number is " + rem);
        }
    }