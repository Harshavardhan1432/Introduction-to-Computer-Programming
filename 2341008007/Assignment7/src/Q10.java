import java.util.Scanner;
public class Q10 {
    static Scanner hv = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("a. Enter the size of the array : ");
        int n = hv.nextInt();
        int[] arr = new int[n];
        boolean check = true;
        while (check) {
            System.out.println("\nMenu : ");
            System.out.println("b. Display the array elements ");
            System.out.println("c. Insert an element at specific position ");
            System.out.println("d. Delete an element at a given position ");
            System.out.println("e. Exit");
            System.out.print("Enter your choice : ");
            char choice = hv.next().charAt(0);
            switch (choice) {
                case 'b': display(arr); break;
                case 'c': insert(arr); break;
                case 'd': delete(arr); break;
                case 'e': check = false; System.out.println(" Thank you..."); break;
                default: System.out.println("Invalid choice!");
            }
        }
    }
    public static void display (int [] arr)
    {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
    public static void insert(int[]arr) {
        System.out.print("Enter the position to insert element : ");
        int x = hv.nextInt();
        System.out.print("Enter the element for insert : ");
        int insert = hv.nextInt();
        for (int i = arr.length - 1; i > x; i--)
            arr[i] = arr[i - 1];
        arr[x] = insert;
        System.out.println("Element Inserted successfully!");
    }
    public static void delete(int [] arr) {
        System.out.print("Enter the position to delete element : ");
        int x = hv.nextInt();
        for (int i = x; i < arr.length - 1; i++)
            arr[i] = arr[i + 1];
        arr[arr.length - 1] = 0;
        System.out.println("Element deleted successfully!");
    }
}
