import java.util.Scanner;
public class Assignment2_HQ2
{
    public static void main(String [] args)
    {
    Scanner hv = new Scanner(System.in);
    System.out.print("Enter the number of eggs: ");
    int eggs = hv.nextInt();
    int gross = eggs / 144;
    int remain = eggs % 144;
    int dozen = remain / 12;
    int remainingEggs = remain % 12;
    System.out.println("Your number of eggs is " + gross + " gross, " + dozen + " dozen, and " + remainingEggs+ ".");
        }
    }
