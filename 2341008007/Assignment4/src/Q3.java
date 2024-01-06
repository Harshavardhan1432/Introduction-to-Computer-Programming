import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = hv.nextInt();
        int sum = 0;
        int i = 0;
        while (i<n) {
            int random = (int) (Math.random() * (n)) + 1;
            System.out.print(random + " ");
            sum = sum + random;
            i++;
        }
        System.out.println("\nAverage of " + n + " random numbers are " + sum/n);
        hv.close();
    }
}
