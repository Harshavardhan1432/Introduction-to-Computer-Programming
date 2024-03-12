
public class CL3 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args [0]);
		int num2 = Integer.parseInt(args [1]);
		int r1 = (int)Math.random()*(num2-num1+1)+num1;
		int r2 = (int)Math.random()*(num2-num1+1)+num1;
		System.out.println(r1 + r2);
	}
}
