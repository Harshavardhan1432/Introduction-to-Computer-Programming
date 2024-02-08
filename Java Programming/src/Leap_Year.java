import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = hv.nextInt();
        System.out.println(year + (isLeapYear(year) ? " is a leap year." : " is not a leap year"));
    }

    public static boolean isLeapYear(int year) {
//        if (year < 1 || year > 9999)
//            return false;
//        else {
//            if (year % 100 == 0) {
//                return year % 400 == 0;
//            } else return year % 4 == 0;
        return (year < 1 || year > 9999) && ((year % 100 == 0) ? (year % 400 == 0) : year % 4 == 0);
    }
}