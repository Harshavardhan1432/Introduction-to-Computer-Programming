public class HQ1 {
        public static void main(String[] args) {
            int n = 10;

            int sum1 = 0;
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum1 += i * i;
                sum += i;
            }
            int sum2 = sum * sum;
            int diff = sum2 - sum1;
            System.out.println("The difference between the sum of the squares and the square of the sum of the first " +
                    n + " natural numbers is: " + diff);
        }
    }