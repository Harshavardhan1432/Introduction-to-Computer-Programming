import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = hv.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++)
        {
            double h = 1/(Math.pow(i,2));
            sum += h;
        }
        System.out.println(sum);
    }
}
