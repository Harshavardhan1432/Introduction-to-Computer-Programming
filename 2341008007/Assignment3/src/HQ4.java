import java.util.Scanner;
public class HQ4 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int n = hv.nextInt();
        System.out.println( n % 30 == 0);
        System.out.println( n % 5 == 0 || n %  6 == 0);
        System.out.println((n % 5 == 0 || n % 6 == 0));
    }
}
