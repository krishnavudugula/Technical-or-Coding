import java.util.*;
public class Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zero = 0;
        char choice;
        
    do {
        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        if(n>0){
            System.out.println(++positive);
        }
        else if(n<0){
            System.out.println(++negative);
        }
        else {
            System.out.println(++zero);
        }

        System.out.print("Do you want to continue? (y/n): ");
        choice = sc.next().charAt(0);

    } while(choice =='y'|| choice =='Y');

    System.out.println("Positive Count: " + positive);
    System.out.println("Negative Count" + negative);
    System.out.println("Zero Count" + zero);
    }
}
