import java.util.Scanner;
public class Assignment2_HQ1 {

    public static void main(String[] args) {

        Scanner hv = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minutes = hv.nextLong();
        long minutes1 = 365 * 24 * 60;
        long years = minutes / minutes1;
        long remaining = minutes % minutes1;
        long days = remaining / (24 * 60);
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
    }
}
