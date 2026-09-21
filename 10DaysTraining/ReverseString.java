import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        String name = "Welcome to My World!";
        String[] words = name.split(" "); // [Welcome, to, My, World!]
        System.out.println(Arrays.toString(words));

        for(int i=words.length-1; i>=0; i--){
            System.out.print(words[i] + " "); //World! My to Welcome.
        }

        String reversed = new StringBuilder(name).reverse().toString();

        System.out.println(reversed);

        for(int i=0; i<words.length; i++){
            reversed = new StringBuilder(words[i]).reverse().toString();
            System.out.print(reversed + " ");
        }



    }
}