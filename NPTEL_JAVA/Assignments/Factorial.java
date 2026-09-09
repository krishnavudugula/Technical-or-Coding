package NPTEL_JAVA.Assignments;
import java.util.*;;
public class Factorial {
    public static int factorial(int x){
        if(x ==0 || x==1){
            return 1;
        } else {
            return x * factorial(x-1); //recursive approach
        }

    // public static int factorial(int nums){

        // int result = 1;

        // for(int i=1; i<=nums; i++){
        //     result *= i;
        // }
        // return result;     ---> Loop approach
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(factorial(x));
    }
}
