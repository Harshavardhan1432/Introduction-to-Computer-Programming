import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner hv =  new Scanner(System.in);
        int[] counts = new int[101];
        System.out.println("Enter integers between 1 and 100 (end with 0):");
        int num;
        do {
            num = hv.nextInt();
            if (num >= 1 && num <= 100)
                counts[num]++;
            else if (num != 0)
                System.out.println("Please enter a number between 1 and 100.");
        } while (num != 0);
        System.out.println("Occurrences of each integer between 1 and 100:");
        for (int i = 1; i <= 100; i++) {
            if (counts[i] > 0)
                System.out.println(i + " occurs " + counts[i] + " time." );
        }
        hv.close();
    }
}