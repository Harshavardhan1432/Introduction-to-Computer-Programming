import java.util.Scanner;

public class Bouncy_Number {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = hv.nextInt();

        boolean isBouncy = isBouncyNumber(num);
        System.out.println(num + (isBouncy ? " is" : " is not") + " a Bouncy Number.");
        hv.close();
    }

    public static boolean isBouncyNumber(int num) {
        boolean increasing = false;
        boolean decreasing = false;
        int prevDigit = num % 10;
        num /= 10;

        while (num > 0) {
            int digit = num % 10;
            if (digit < prevDigit) {
                increasing = true;
            } else if (digit > prevDigit) {
                decreasing = true;
            }
            prevDigit = digit;

            num /= 10;

            if (increasing && decreasing) {
                return true;
            }
        }
        return false;
    }
}

