import java.util.Scanner;
public class Remove_WhiteSpaces
{
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = hv.nextLine();
        System.out.println("After removing whitespaces : " + removeWhiteSpaces(str));
    }
    public static String removeWhiteSpaces(String str) {
        return str.replaceAll("\\s", "");
    }
}
