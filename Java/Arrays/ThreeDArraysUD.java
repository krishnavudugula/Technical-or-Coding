package Arrays;
import java.util.*;
public class ThreeDArraysUD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking dimensions from user
        System.out.print("Enter number of pages: ");
        int pages = sc.nextInt();

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Creating 3D array
        int[][][] arr = new int[pages][rows][cols];

        // Taking array values from user
        System.out.println("Enter array values:");

        for (int i = 0; i < pages; i++) {
            System.out.println("Page " + (i + 1));

            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {

                    arr[i][j][k] = sc.nextInt();

                }
            }
        }

        // Displaying the array
        System.out.println("\n3D Array:");

        for (int i = 0; i < pages; i++) {

            System.out.println("Page " + (i + 1));

            for (int j = 0; j < rows; j++) {

                for (int k = 0; k < cols; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }

                System.out.println();
            }

            System.out.println();
        }

        sc.close();
    }
}
