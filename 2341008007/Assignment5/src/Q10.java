import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = hv.nextInt();
        int a = 0,b = 1, c = 1;
        System.out.println(a + " " + b + " " + " " + c);
        for (int i = 4; i <= n; i++)
        {
            int sum = a + b + c;
            System.out.print(sum + " ");
            a = b;
            b = c;
            c = sum;
        }
    }
}
