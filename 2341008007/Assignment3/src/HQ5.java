import java.util.*;
public class HQ5 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("What is your gender (M or F): ");
        char gender = hv.next().charAt(0);
        System.out.print("First Name: ");
        String f_name = hv.next();
        System.out.print("Last Name: ");
        String l_name = hv.next();
        System.out.println("Age: ");
        int age = hv.nextInt();
        switch (gender)
        {
            case 'M':
                if (age <= 18)
                    System.out.println("Then I shall call you " + f_name + " " + l_name);
                else
                    System.out.println("Then I shall call you Mr. " + f_name + " " + l_name);
                break;
            case 'F':
                if (age > 18) {
                    System.out.println("Are you married? [Y/N] ");
                    char m = hv.next().charAt(0);
                    if (m == 'Y')
                        System.out.println("Then I shall you Mrs. " + f_name + " " + l_name);
                    else
                        System.out.println("Then I shall you Ms. " + f_name + " " + l_name);
                }
                else
                    System.out.println("Then I shall you " + f_name + " " + l_name);
                break;
            default:
                System.out.println("Invalid choice");
        }

    }
}
