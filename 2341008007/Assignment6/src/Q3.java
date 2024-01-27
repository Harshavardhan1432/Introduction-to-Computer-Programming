import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = hv.nextInt();
        System.out.println(n + (isPalindrome(n) ? " is " : " is not ") + "a palindrome number.");
    }

    public static int reverse (int number)
    {
        int rev = 0;
        while (number > 0)
        {
            int r = number % 10;
            rev = rev * 10 + r;
            number /= 10;
        }
        return rev;
    }
    public static boolean isPalindrome (int number)
    {
        return number == reverse(number);
    }
}
