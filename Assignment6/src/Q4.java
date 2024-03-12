import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter the year after 2000 : ");
        int year = hv.nextInt();
        for (int i = 2000; i <= year; i++)
        {
            System.out.println("Number of days in " + i + " is " + numberOfDaysInAYear(i));
        }
    }
    public static int numberOfDaysInAYear(int year)
    {
        return ((year % 100 == 0) ? (year % 400 == 0) : (year % 4 == 0))? 366 : 365;
    }
}
