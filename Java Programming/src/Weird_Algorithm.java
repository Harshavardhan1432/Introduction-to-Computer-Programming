import java.util.*;
public class Weird_Algorithm
{
        public static void main(String[] args) {
            Scanner hv = new Scanner(System.in);
            System.out.println("Enter any number");
            int n = hv.nextInt();
            System.out.print(n + " ");
            while (n != 1) {
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = 3 * n + 1;
                }
                System.out.print(n + " ");
            }
        }
}