import java.util.Scanner;
public class Peterson_Number {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        int number = hv.nextInt();
        boolean isPeterson = isPetersonNumber(number);
        System.out.println("Is " + number + " a Peterson number? " + isPeterson);
    }

    public static boolean isPetersonNumber(int num) {
        int originalNum = num;
        int sumOfFactorials = 0;
        while (num > 0) {
            int digit = num % 10;
            sumOfFactorials += factorial(digit);
            num /= 10;
        }
        return sumOfFactorials == originalNum;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

