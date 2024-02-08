public class Neon_Number {
    public static void main(String[] args) {
        int sum = 0, rem, pow;
        for (int i = 100; i <= 800; i++) {
            pow = (int) Math.pow(i, 2);
            while (pow != 0) {
                rem = pow % 10;
                sum += rem;
                pow = pow / 10;
                if (i == sum)
                    System.out.print(i);
            }

        }
    }
}
