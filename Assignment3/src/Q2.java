import java.util.Scanner;
public class Q2 {
    public static void main(String [] args)
    {
        Scanner hv = new Scanner(System.in);
        System.out.println("Please enter the amount of water consumed in ml");
        int x = hv.nextInt();
        if (x >= 5000)
            System.out.println("Yes, Alice is following doctor’s advice");
        else
            System.out.println("No, Alice is not following doctor’s advice");
    }
}
