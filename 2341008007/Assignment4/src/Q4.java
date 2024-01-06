import java.util.Scanner;
public class Q4
    {
        public static int gcd(int a, int b)
        {
            if (a == 0)
                return b;
            else
                return gcd(b%a,a);
    }
        public static void main(String[] args) {
            Scanner hv = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int n1= hv.nextInt();
            System.out.println("Enter the second number: ");
            int n2= hv.nextInt();
            int g = gcd(n1,n2);
            System.out.println("GCD of " + n1 + " and " + n2 + " is " + g);
            hv.close();
        }
}
