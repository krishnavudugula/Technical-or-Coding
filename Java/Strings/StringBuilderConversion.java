package Strings;
public class StringBuilderConversion {    
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Krishna");  
        System.out.println(sb);  

        //charAt
        System.out.println(sb.charAt(2));

        //setCharAt(index,char)
        sb.setCharAt(0, 'a');
        System.out.println(sb);
        
        //insert(index,char)
        sb.insert(1,'k');
        System.out.println(sb);

        //delete
        sb.delete(0, 1); //end is non inclusive
        System.out.println(sb);

        sb.append(" M");
        sb.append("u");
        sb.append("r");
        sb.append("a");
        sb.append("r");
        sb.append("i");
        System.out.println(sb);
        System.out.println(sb.length());

        //reversing string
        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
