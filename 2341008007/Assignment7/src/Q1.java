import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = hv.nextInt();
        int sum = 0;
        int [] arr = new int[n];
        System.out.print("Enter the values in array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = hv.nextInt();
            sum += arr[i];
        }
            System.out.println("Sum : " + sum);
            System.out.println("Average : " + (double)(sum / n));
        }
    }

