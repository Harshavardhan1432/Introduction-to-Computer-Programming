import java.util.Scanner;
public class HQ4 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        double x = hv.nextDouble();
        double t = 1, sum = 0;
        int i = 0;
        do {
            sum += t;
            i += 2;
            t = -t*x*x/(i*(i-1));
        }
        while (Math.abs(t) > 0.000001);
        System.out.println(sum);

    }
}