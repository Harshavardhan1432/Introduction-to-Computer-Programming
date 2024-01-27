import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String sg = hv.nextLine();
        System.out.print("The no of vowels in " + sg + " is " + count(sg));
    }
    public static int count (String str)
    {
        int vowel = 0;
        for (int i = 0; i < str.length(); i++)
        {
            char character = str.charAt(i);
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u')
                vowel++;
        }
        return vowel;
    }
}
