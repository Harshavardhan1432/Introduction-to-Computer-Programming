import java.util.Locale;
import java.util.Scanner;

public class Vowels_Consonants {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str1 = hv.nextLine();
        String str = str1.toLowerCase(Locale.ROOT);
        int vowels = 0, consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                vowels++;
            else if (str.charAt(i) == ' ')
                continue;
            else
                consonants++;
        }
        System.out.println("The String \"" + str1 + "\" has " + vowels + " vowels and " + consonants + " consonants");
    }
}
