import java.util.Scanner;
public class HQ4 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String string = hv.nextLine();
        System.out.println("The number of words in the String " + string + " is " + word(string));
    }
    public static int word (String string)
    {
        int count = 1;
        for (int i = 0; i < string.length() - 1; i++)
        {
            if (string.charAt(i) == ' ' && string.charAt(i+1) != ' ')
                count++;
        }
        return count;
    }
}
