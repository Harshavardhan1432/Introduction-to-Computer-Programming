import java.util.Scanner;
public class Q7 {
    public static void main(String [] args)
    {
        Scanner hv = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = hv.nextInt();
        int i, j = 2;
        System.out.println("a\tb\tpow(a, b)");
        for (i = 1; i <= n; i++)
        {
            int k = (int)(Math.pow(i,j));
            System.out.println(i + "\t" + j + "\t" + k);
            j++;
        }
    }
}
