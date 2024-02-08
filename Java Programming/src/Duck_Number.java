import java.util.Scanner;
public class Duck_Number {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = hv.nextInt();
        System.out.println(num + (duck_number(num)? " is a duck number." : " is not a duck number."));
    }
    public static boolean duck_number(int num)
    {
        while (num > 0)
        {
            int digit = num % 10;
            if (digit == 0)
                return true;
            num /= 10;
        }
        return false;
    }
}
