import java.util.Scanner;

class CodeChef {
    public static void main(String[] args) {
        // your code goes here
        Scanner hv = new Scanner(System.in);
        int bps = hv.nextInt();
        int threshold = hv.nextInt();
        if (bps >= 1 && threshold <= 100) {
            if (bps <= threshold && bps != threshold) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        } else
            System.out.println("Invalid");
    }
}

