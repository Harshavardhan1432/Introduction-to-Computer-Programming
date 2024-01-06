import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner hv = new Scanner (System.in);
        int num;
        int guess = (int) (Math.random()*(10))+1;
        do {
        System.out.println("Enter any random number from 1 to 10 : ");
        num = hv.nextInt();

            if (guess > num)
                System.out.println("Too low, try again");
            else
                System.out.println("Too high, try again");
        } while (num != guess);
            System.out.println("Good guess");
        hv.close();
    }
}
