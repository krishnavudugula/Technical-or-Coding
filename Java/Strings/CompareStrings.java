package Strings;
//Strings are immutable (we have to convert them into StringBuilder to do operations such as delete,add)
public class CompareStrings {
    //.toCompare
    public static void main(String[] args) {
        String sentence = "Yo, i choose discipline";
        //substring(beg index - included, end index - non inclusive)
        System.out.println(sentence.substring(12, sentence.length()));
        // System.out.println(sentence.substring(12));
    }
    
}