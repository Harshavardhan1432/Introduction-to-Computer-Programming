import java.util.Random;
import java.util.Scanner;
public class Q4 {
    public static void main(String [] args)
    {
        Random ran = new Random();
        int guess = ran.nextInt(0,9);
        Scanner hv = new Scanner(System.in);
        System.out.println("Please enter a number between 1 to 9");
        int number = hv.nextInt();
        if (guess == number)
            System.out.println("You got it right");
        else if (guess == --number ^ guess == ++number)
            System.out.println("Almost got it");
        else
            System.out.println("You got it wrong");
        System.out.println("The computer guess was " + guess);
    }
}
