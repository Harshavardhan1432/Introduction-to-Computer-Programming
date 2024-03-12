
public class CL5 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args [0]);
		int num2 = Integer.parseInt(args [1]);
		int num3 = Integer.parseInt(args [2]);
		 if (num1 > num2 && num1 > num3)
			 System.out.println(Math.min(num2, num3) + "\n" + Math.max(num2, num3) + "\n" + num1);
		 else if (num2 > num1 && num2 > num3)
			 System.out.println(Math.min(num1, num3) + "\n" + Math.max(num1, num3) + "\n" + num2);
		 else
			 System.out.println(Math.min(num1, num2) + "\n" + Math.max(num1, num2) + "\n" + num3);
	}
}
