import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner hv = new Scanner (System.in);
        System.out.print("Enter the first number: ");
        int first = hv.nextInt();
        System.out.print("Enter the second number: ");
        int second = hv.nextInt();
        System.out.print("Enter the third number: ");
        int third = hv.nextInt();
        int sum = 0;
        for (int i = first; i <= second; i=i+third)
        {
            System.out.print(i + " ");
            sum+=i;
        }
        System.out.print("\nThe Sum of the displayed numbers is " + sum);
        hv.close();
    }
}
