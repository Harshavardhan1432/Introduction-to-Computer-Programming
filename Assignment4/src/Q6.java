import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.println("Enter a number : ");
       int a = hv.nextInt();
        System.out.println("Enter another number : ");
        int b = hv.nextInt();
        int result = 1;
        for (int i = 1; i<=b; i++)
        {
            result *= a;
        }
        System.out.println(a + " raised to the power of " + b + " is: " + result);
    }
}
