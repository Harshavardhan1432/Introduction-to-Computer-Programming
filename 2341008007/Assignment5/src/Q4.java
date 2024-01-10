import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner hv =  new Scanner(System.in);
        System.out.print("Enter the value of m : ");
        int m = hv.nextInt();
        System.out.print("Enter the value of n : ");
        int n = hv.nextInt();
        for (int i = m; i <= n; i++)
        {
            int f = 1;
            for (int j = 1; j<=i; j++)
            {
                f *= j;
            }
            System.out.println("Factorial of " + i + " is " + f);
        }
    }
}
