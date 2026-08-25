package Arrays;
import java.util.*;

public class NullCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        for(int i=0; i<size; i++ ){
            System.out.println(number[i]); //prints default values when array not initialized with any number in it. int -> 0, float -> 0.0, Bool -> false.
        }
    }
}
