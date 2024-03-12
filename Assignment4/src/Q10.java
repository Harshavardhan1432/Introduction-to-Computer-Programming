import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner hv = new Scanner (System.in);
        System.out.print("Enter a number : ");
        int n = hv.nextInt();
        int result = 0, max = 0;
        for (int i = 1; result <= n; i++)
        {
            if (result < n)
                max = result;
            result = (int)(Math.pow(3, i));
        }
        System.out.println("The largest power of 3 less than or equal to " + n + " is " + max);
    }
}
