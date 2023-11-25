public class CL7
{
    public static void main(String[] args) {
                int num1 = Integer.parseInt(args[0]);
                int num2 = Integer.parseInt(args[1]);
                int num3 = Integer.parseInt(args[2]);
                System.out.println((num1 <= num2 * num3) || (num2 <= num1 * num3) || (num3 <= num1 * num2));
            }
    }
