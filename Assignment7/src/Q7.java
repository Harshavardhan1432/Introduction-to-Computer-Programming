import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter a decimal integer: ");
        int decimal = hv.nextInt();
        System.out.println("Octal representation: " + convertToOctal(decimal));
        hv.close();
    }
    public static String convertToOctal(int n) {
        String octal = "";
        while (n > 0) {
            int remainder = n % 8;
            octal = remainder + octal;
            n /= 8;
        }
        return octal;
    }
}
