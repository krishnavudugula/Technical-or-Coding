public class IsPrime {
    public static Boolean isPrime(int n) {
        if(n<2){
            return false;
        }
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        for(int i= 10; i<100; i++){
            if(isPrime(i)){
                System.out.printf("%d is a prime number\n",i);
            }
            else {
                System.out.printf("%d is not a prime number\n",i);
            }
        }
    }
}
