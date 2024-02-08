/* A library charges a fine for books in return late on the following basis
First 5 days            4/day
6 to 10 days            6/day
More than 10 days       8/day

Calculate the fine assuming that the book in return the last date
 */

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.println("Please enter the no. days");
        int days = hv.nextInt();
        double fine;
        if (days <= 5)
            fine = days * 4;
        else if (days <= 10)
            fine = 20 + (days - 5) * 6;
        else
            fine = 50 + (days - 10) * 8;
        System.out.println("The Total Amount to be paid " + fine);

    }
}
