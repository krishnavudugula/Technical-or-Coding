import java.util.*;
public class Strings {
    public static String[] splitString(String str) {
        StringBuilder name = new StringBuilder();
        StringBuilder specialChar = new StringBuilder(); 
        StringBuilder number = new StringBuilder();
        char[] s2 = str.toCharArray();

        for(char ch: s2){
            if(Character.isAlphabetic(ch)){
                name.append(ch);
            } else if(Character.isDigit(ch)){
                number.append(ch);
            } else {
                specialChar.append(ch);
            }
        }
        return new String[] {name.toString(), specialChar.toString(), number.toString()};
    }
    public static void main(String[] args) {
        String str = "K#ish##M#r#r##1235ewdsderc@34657";
        for(String str1 : splitString(str)){
            System.out.println(str1);
        }
    }
}
