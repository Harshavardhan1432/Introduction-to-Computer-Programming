import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.println("Enter the the size of array : ");
        int n = hv.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter " + n + " elements in array");
        for (int i = 0; i < n; i++)
            arr[i] = hv.nextInt();
        System.out.println("Reversal Algorithm : ");
        for (int j = n - 1; j>=0; j--)
            System.out.print(arr[j] + " ");
    }
}
