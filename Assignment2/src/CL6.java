public class CL6 {
    public static void main(String[] args) {
        if (args.length > 0) {
            char myChar = args[0].charAt(0);
            System.out.println("The ASCII value of '" + myChar + "' is: " + (int) myChar);
        }
    }
}
