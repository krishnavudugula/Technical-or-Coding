//Take an array as input from the user. Search for a given number x and print the at which it occurs.

package Arrays;
import java.util.*;

public class ArrayElementDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int numbers[] = new int[size];
        
        //input
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        //array length.. (no. of elements in an array)

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == x){
                System.out.println("x found at index: " + i);
            }
        }
    }
}
