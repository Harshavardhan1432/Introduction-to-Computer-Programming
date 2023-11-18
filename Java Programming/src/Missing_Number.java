import java.util.*;
public class Missing_Number
{
        public static void main(String[] args) {
            try (Scanner hv = new Scanner(System.in)) {
                System.out.println("Please enter number");
                int n = hv.nextInt();
                int sum = (n * (n + 1)) / 2; // Sum of first n natural numbers

                int sumOfNumbers = 0;
                for (int i = 1; i <= n - 1; i++) {
                    int num = hv.nextInt();
                    sumOfNumbers += num;
                }

                int missingNumber = sum - sumOfNumbers;
                System.out.println(missingNumber);
            }
        }
    }

