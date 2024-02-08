//1--------1
//12------21
//123----321
//1234--4321
//1234554321
public class Pattern_14 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // Print numbers in increasing order
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print dashes
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("--");
            }
            // Print numbers in decreasing order
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
