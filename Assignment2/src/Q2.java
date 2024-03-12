import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner hv = new Scanner(System.in);
		System.out.println("Please enter the Distance");
		double kilometers = hv.nextDouble();
		double meters = kilometers * 1000;
		double feet = kilometers * 3280.8399;
		double inch = kilometers * 39370.0787;
		double centimeters = kilometers * 100000;
		System.out.println(kilometers + " km is " + meters + " m");
		System.out.println(kilometers + " km is " + feet + " ft");
		System.out.println(kilometers + " km is " + inch + " in");
		System.out.println(kilometers + " km is " + centimeters + " cm");
	}

}
