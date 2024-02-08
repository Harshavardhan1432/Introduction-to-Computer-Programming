//1
//23
//345
//4567
//56789
public class Pattern_6 {
        public static void main(String[] args) {
            int n = 5; // Number of rows

            for (int i = 1; i <= n; i++) {
                int num = i;
                for (int j = 1; j <= i; j++) {
                    System.out.print(num);
                    num++;
                }
                System.out.println();
            }
        }
    }
