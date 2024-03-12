import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Please enter the number");
        int n = hv.nextInt();
        int n1 = n;
        int sum = 0;
        while (n != 0)
        {
            int p = n % 10;
            sum = sum + p;
            n = n / 10;
        }
        if (sum % 9 == 0)
            System.out.println("The number " + n1 + " is divisible by 9");
        else
            System.out.println("The number " + n1 + " is not divisible by 9");
        hv.close();
    }
}
