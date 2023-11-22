import java.util.Scanner;
import java.util.Random;
public class HQ1 {
    public static void main(String[] args) {
        Random r = new Random();
        int guess = r.nextInt(0,2);
        Scanner hv = new Scanner(System.in);
        System.out.println("rock (0), paper (1), scissor (2): ");
        int user = hv.nextInt();
        System.out.println("You Guess " + user);
        System.out.println("Computer guess " + guess);
        if (guess == user)
            System.out.println("Its a draw");
        else if ((user == 0 && guess == 2) || (user == 1 && guess == 0) || (user == 2 && guess == 1))
            System.out.println("You Won");
        else
            System.out.println("Computer won");
    }
}
