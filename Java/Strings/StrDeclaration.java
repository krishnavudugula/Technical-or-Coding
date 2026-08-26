package Strings;
import java.util.*;
public class StrDeclaration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        String name = sc.nextLine();

        System.out.println("Your name is: "+ name); //next() and nextLine() difference must be noticed.

        System.out.println(name.length());

        //charAt

        for(int i=0; i<name.length(); i++){
            System.out.print(name.charAt(i) + " ");
        }
    }
}
