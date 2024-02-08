import java.util.Scanner;

public class Evil_Number {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = hv.nextInt();
        System.out.println(num + (evil_number(num) ? " is an evil number." : " not an evil number."));
    }

    public static boolean evil_number(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 2 == 1)
                count++;
            num /= 2;
        }
        return count % 2 == 0;
    }
}
