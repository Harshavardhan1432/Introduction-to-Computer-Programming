public class Automorphic_Number {
    public static void main(String[] args) {
        int rem, rem1;
        for (int i = 1; i <= 1000; i++) {
            rem = i % 100;
            rem1 = (int) (Math.pow(i, 2)) % 100;
            if ((rem == i) && (rem1 == i))
                System.out.println(i);
        }
    }
}
