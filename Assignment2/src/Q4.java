import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner hv =  new Scanner(System.in);
		System.out.println("Please enter the number between 1 to 1000");
		int number = hv.nextInt();
		int digit = 0,sum = 0;
		if (number > 0 && number <= 1000)
		{
				digit = number % 10;
				sum = sum + digit;
				number = number/10;
				digit = number % 10;
				sum = sum + digit;
				number = number/10;
				digit = number % 10;
				sum = sum + digit;
				number = number/10;
				
				System.out.println("The sum of the given number: " + sum);
		}
		else
			System.out.println("Invalid Value");
	}
}
