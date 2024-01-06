import java.util.Scanner;
public class HQ4
{
    public static void main(String[] args) {
            Scanner hv = new Scanner(System.in);
            System.out.print("Enter a number (N): ");
            int n = hv.nextInt();
            int sum = 0;
            long product = 1;
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0)
                    sum += i;
                else
                    product *= i;
            }
            System.out.println("Sum of all even numbers from 1 to " + n + " is: " + sum);
            System.out.println("Product of all odd numbers from 1 to " + n + " is: " + product);
            hv.close();
        }
    }
