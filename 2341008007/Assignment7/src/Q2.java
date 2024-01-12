import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter number o f elements ");
        int n = hv.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = 1 + (int) ((100 - 1) * Math.random());
            if (prime(arr[i]))
                count++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nThe number of prime numbers are " + count);
    }

    public static boolean prime(int x) {
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0)
                return false;
            }
                return true;
    }
}
