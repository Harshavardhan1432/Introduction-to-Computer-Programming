import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = hv.nextInt();
        System.out.print("Enter second number : ");
        int b = hv.nextInt();
        for (int i = a; i <= b; i++) {
            int c = 0;
            for (int j = 2; j <= Math.sqrt(i); j++)
            {
                if (i % j == 0)
                {
                    c++;
                    break;
                }
            }
            if (c == 0)
                System.out.print(i + " ");
        }
    }
}
