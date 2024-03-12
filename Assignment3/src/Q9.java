import java.util.Scanner;
public class Q9
{
    public static void main(String[] args) {
        Scanner hv =  new Scanner(System.in);
        System.out.println("Enter the value of a, b, c: ");
        int a = hv.nextInt();
        int b = hv.nextInt();
        int c = hv.nextInt();
        if (a > b && a > c) {
            System.out.println("Largest Number: " + a);
            System.out.println("2nd largest number: " + Math.max(b,c));
        }
        else if (b > a && b > c) {
            System.out.println("Largest Number: " + b);
            System.out.println("2nd largest number: " + Math.max(a, c));
        }
        else {
            System.out.println("Largest Number: " + c);
            System.out.println("2nd largest number: " + Math.max(a, b));
        }
    }
}
