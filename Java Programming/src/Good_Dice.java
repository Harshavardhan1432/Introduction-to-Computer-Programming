//import java.util.Scanner;
public class Good_Dice {
    public static void main(String[] args) {
//        Scanner hv = new Scanner(System.in);
//        System.out.print("Enter the value of x : ");
//        int x = hv.nextInt();
//        System.out.print("Enter the value of y : ");
//        int y = hv.nextInt();
//        System.out.println((x+y > 6) ? "Good Turn":"Not a Good Turn");

        int dice1 = (int)(Math.random()*6);
        int dice2 = (int)(Math.random()*6);
        System.out.println("Dice 1 : " + dice1);
        System.out.println("Dice 2 : " + dice2);
        System.out.println((dice2 + dice1 >= 6) ? "Good Turn":"Not a Good Turn");
    }
}
