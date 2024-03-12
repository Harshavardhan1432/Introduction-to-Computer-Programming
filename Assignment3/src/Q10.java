import java.util.*;
public class Q10 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int marks = hv.nextInt();
        char grade = switch (marks / 10) {
            case 10 -> 'O';
            case 9 -> '0';
            case 8 -> 'A';
            case 7 -> 'B';
            case 6 -> 'C';
            case 5 -> 'D';
            case 4 -> 'E';
            default -> 'F';
        };
        System.out.println("Marks : " + marks + "\nGrade : " + grade);
    }
}
