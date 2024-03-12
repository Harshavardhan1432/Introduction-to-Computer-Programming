import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter the word : ");
        String word = hv.next();
        System.out.print("Enter the character to be counted : ");
        char character = hv.next().charAt(0);
        System.out.print("The character '" + character + "' in the word \"" + word + "\" is " + count(word,character));
    }
    public static int count(String str, char a)
    {
        int count = 0;
        for (char c : str.toCharArray())
        {
            if (c == a)
                count++;
        }
        return count;
    }
}
