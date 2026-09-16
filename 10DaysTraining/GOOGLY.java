public class GOOGLY {
    public static boolean isPrime(int sum){
        for(int i=2; i<sum; i++){
            if(sum%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 1345;
        int sum = 0;
        while(n>0){
            int d = n%10;
            sum += d;
            n/=10;
            // rev = rev*10 + d;

        }
        if(isPrime(sum)){
            System.out.println("GOOGLY");
        }
        else {
            System.out.println("NOT GOOGLY");
        }
        
    }
}
