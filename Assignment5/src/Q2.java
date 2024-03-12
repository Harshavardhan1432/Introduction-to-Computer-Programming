import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = hv.nextInt();
        int c1 = 0, c2 = 0, temp = num, sum = 0;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if ( num % i == 0) {
                c1++;
                break;
            }
        }
        while (num > 0)
        {
            int q = num % 10;
            sum = sum * 10 + q;
            num /= 10;
        }
        for (int j = 2; j <= Math.sqrt(sum); j++)
        {
            if (sum % j == 0) {
                c2++; break;
            }
        }
        if (c1 == 0 && c2 == 0)
            System.out.println(temp + " is a twisted prime");
        else
            System.out.println(temp + " is not a twisted prime");
    }
}
