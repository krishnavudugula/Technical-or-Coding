import java.util.*;
public class CompareChar {
    public static void main(String[] args) {
        String str = "KrishnaVudugula2005@gmail.com#@";
        String s1 = str.toLowerCase();
        char[] s2 = s1.toCharArray();
        int vowels = 0;
        int consonants = 0;
        int specialCharacter = 0;
        int numbers = 0;

        for(char ch: s2){
            if(Character.isLetter(ch)){
                if(ch == 'a'|| ch == 'e' || ch=='i' || ch=='o'|| ch=='u'){
                    vowels++;
                }    
                else {
                    consonants++;
                }            
            }
            else if(Character.isDigit(ch)){
                    numbers++;
            }
            else {
                specialCharacter++;
            }
        }
        System.out.println(vowels);
        System.out.println(consonants);
        System.out.println(numbers);
        System.out.println(specialCharacter);

    }
}
