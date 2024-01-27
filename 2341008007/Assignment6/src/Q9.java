import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.println("Enter your password : ");
        String password = hv.nextLine();
        System.out.println(isValidPassword(password)?"Valid":"Invalid");
    }
    public static boolean isValidPassword (String password)
    {
        return ((password.length() > 8) && onlylettersanddigits(password) && atleastDigits(password));
    }
    public static boolean onlylettersanddigits (String password) {
        for (int i = 0; i < password.length(); i++) {
            int a = password.charAt(i);
            return ((a >= 48 && a <= 57) || (a >= 65 && a <= 90) || (a >= 97 && a <= 122));
        }
        return false;
    }
    public static boolean atleastDigits (String password)
    {
        int count = 0;
        for (int i = 0; i < password.length(); i++)
        {
            int a = password.charAt(i);
            if (a >= 48 && a <= 57)
                count++;
            }
            return (count >= 2);
    }
}
