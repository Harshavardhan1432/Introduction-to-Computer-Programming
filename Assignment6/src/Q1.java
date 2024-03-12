import java.util.Scanner;
public class Q1 {
    public static int additionSimple(int x, int y)
    {
        return x + y;
    }
    public static int subtractionSimple(int x, int y)
    {
        return y - x;
    }
    public static int multiplicationSimple(int x, int y)
    {
        return x*y;
    }
    public static double divisionSimple(int x, int y)
    {
        if (x==0)
            return -1;
        else
            return (double) y /x;
    }
    public static int remainderSimple(int n, int m)
    {

        return n%m;
    }
    public static double squareRootSimple(int n)
    {
        return Math.sqrt(n);
    }

    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = hv.nextInt();
        System.out.print("Enter second number : ");
        int b = hv.nextInt();
        System.out.println("Choose the operator : ");
        String operator = hv.next();
        switch(operator)
        {
            case "+":
                System.out.println("The addition of " + a + " and " + b + additionSimple(a,b));
                break;
            case "-":
                System.out.println("The subtraction of " + a + " and " + b + subtractionSimple(a,b));
                break;
            case "*":
                System.out.println("The multiplication of " + a + " and " + b + multiplicationSimple(a,b));
                break;
            case "/":
                if (a == 0)
                    System.out.println("Invalid");
                else
                    System.out.println("The division of " + a + " and " + b + divisionSimple(a,b));
                break;
            case "%":
                System.out.println("The remainder of " + a + " and " + b + remainderSimple(a,b));
                break;
            case "Root":
                System.out.println("The square root of " + a + " and " + squareRootSimple(a));
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
