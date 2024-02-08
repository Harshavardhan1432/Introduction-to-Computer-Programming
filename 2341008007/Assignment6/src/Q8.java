import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String string = hv.nextLine();
        System.out.println(isPalindrome(string));
    }
    public static boolean isPalindrome (String str)
    {
//        int left = 0, right = str.length() - 1;
//        while (left < right)
//        {
//            if (str.charAt(left) != str.charAt(right))
//                return false;
//            left++;
//            right--;
//        }
//        return true;
        String check ="";
        for (int i = str.length()-1; i >= 0; i--)
            check += str.charAt(i);
        return (str.equals(check));
    }
}
