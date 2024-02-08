import java.util.Scanner;

public class Problem2_ConvertToAnyBase {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int d = hv.nextInt();
        System.out.print("Enter the target base: ");
        int t = hv.nextInt();
        String result = convertToAnyBase(d, t);
        System.out.println("Decimal Number: " + d);
        System.out.println("Converted to Base " + t + ": " + result);
        hv.close();
    }

    public static String convertToAnyBase(int n, int b) {
        String result = "";

        while (n > 0) {
            int remainder = n % b;
            char digit = getDigit(remainder);
            result = digit + result;
            n /= b;
        }
        return result;
    }

    public static char getDigit(int remainder) {
        if (remainder < 10)
            return (char) ('0' + remainder);
        else
            return (char) ('A' + remainder - 10);
    }
}