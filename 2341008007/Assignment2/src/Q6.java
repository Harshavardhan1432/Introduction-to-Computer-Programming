import java.util.Scanner;
public class Q6 {
    public static void main(String [] args)
    {
        Scanner hv = new Scanner(System.in);
        System.out.print("Please enter the time: ");
        double time = hv.nextDouble();
        double distance = 0.5 * 32.174 * time * time;
        System.out.println("Distance Travelled : " + distance);
    }
}
