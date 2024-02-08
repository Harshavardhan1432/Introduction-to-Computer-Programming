//  2   5   10  17  ....n Series

import java.util.Scanner;

public class Series_2 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        int n = hv.nextInt();
        int i, p;
        for (i = 1; i <= n; i++) {
            p = (i * i) + 1;
            System.out.print(p + " ");
        }
    }
}

