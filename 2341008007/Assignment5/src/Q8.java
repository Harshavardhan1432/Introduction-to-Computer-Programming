import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = hv.nextInt();
        int sum = 0;
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--)
                sum += j;
        }
        System.out.println(sum);
    }
}
