import java.util.Scanner;
public class HQ5 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = hv.nextInt();
        int a = 0, b = 1;
        System.out.print("Fibonacci Series is ");
        if (n == 1)
            System.out.print(a);
        else if (n == 2)
            System.out.println(a + "," + b);
        else {
            System.out.print(a + "," + b + ",");
            for (int i = 3; i <= n; i++)
            {
                int sum = a + b;
                System.out.print(sum + ",");
                a = b;
                b = sum;
            }
        }

    }
}
