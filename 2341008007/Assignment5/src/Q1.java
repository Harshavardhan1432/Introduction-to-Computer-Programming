import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = hv.nextInt();
        System.out.print("Enter second number : ");
        int b = hv.nextInt();
        int sum = 0, sum1 = 0;
        for (int i = 1; i <= a/2; i++)
        {
            if (a % i == 0)
                sum += i;
        }
        for (int j = 1; j <= b/2; j++)
        {
            if (b % j == 0)
                sum1 += j;
        }
        if (sum == b && sum1 == a)
            System.out.println(a + " and " + b + " are amicable numbers");
        else
            System.out.println(a + " and " + b + " are not amicable numbers");
    }
}
