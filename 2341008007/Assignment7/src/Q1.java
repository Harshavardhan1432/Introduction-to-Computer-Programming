
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        int n = hv.nextInt();
        int[] arr = new int[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            arr[1] = 1 + (int) ((n - 1) * Math.random());
            sum += arr[1];
        }
        System.out.println("The sum is:" + sum);
        System.out.println("The avg is:" + (sum / n));
        for (int i = 0; i < n; i++) {
            System.out.print(arr[1] + " ");
        }
    }
}
