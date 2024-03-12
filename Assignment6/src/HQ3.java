import java.util.Scanner;
public class HQ3 {
    public static void main(String[] args) {
        Scanner hv = new Scanner (System.in);
        System.out.println("Enter the string : ");
        String string = hv.nextLine();
        System.out.println("The middle of the string is " + string + " is " + MiddleChar(string));
    }
    public static String MiddleChar (String str)
    {
        int length = str.length();
        if (length % 2 == 0)
            return str.substring((length/2),(length + 1)/2);
        else
            return str.substring((length/2),(length + 2)/2);
    }
}
