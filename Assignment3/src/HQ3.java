import java.util.Scanner;
public class HQ3 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        int num = hv.nextInt();
        String month = switch (num)
        {
            case 1 -> "January"; case 2 -> "February"; case 3 -> "March"; case 4 -> "April";
            case 5 -> "May"; case 6 -> "June"; case 7 -> "July"; case 8 -> "August";
            case 9 -> "September"; case 10 -> "October"; case 11 -> "November"; case 12 -> "December";
            default -> "Invalid";
        };
        System.out.println(month);
    }
}
