import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = hv.nextInt();
        int s = 0;
        for(int i = 1; i < n; i++)
        {
            if (n % i == 0)
                s = s+i;
        }
        if (n == s)
            System.out.println(n + " is a perfect number");
        else
            System.out.println(n + " is not a perfect number");
    }
}
