package BitManipulation;

public class BitManipulation {
    public static void main(String[] args) {
        
        int n =5;
        int pos= 2;
        int bitMask = 1 << pos;
        System.out.println(bitMask);
        //get Bit - (&)
        if((bitMask & n) == 0){
            System.out.println("bit was zero");
        } 
        else {
            System.out.println("bit was one");
        }

        //set Bit - (|)

        int newNumber = bitMask | n;
        System.out.println(newNumber);

        //clear Bit
        //1010 - positions : 3 2 1 0 (Right to Left)
        //clear 3rd bit (position=2)of a number n. (n=0010)
        //**Operation: AND with NOT** 
        int notBitMask = ~(bitMask);
        int newNumber2 = notBitMask & n;
        System.out.println(newNumber2);

    }
}
 