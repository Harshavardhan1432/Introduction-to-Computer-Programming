import java.util.Scanner;
public class HQ1
{
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = hv.nextLine();
        int c = repeat(str);
        if (c != -1)
            System.out.println("The first non repeated character in String is " + str.charAt(c));
        else
            System.out.println("No non repeated character");
    }
    public static int repeat (String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            boolean isString = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isString = false;
                    break;
                }
            }
                if (isString)
                    return i;
        }
        return -1;
    }
}
