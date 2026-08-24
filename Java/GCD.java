public class GCD {
    static int gcd(int a, int b) {

    while (b != 0) {

        int remainder = a % b;

        a = b;
        b = remainder;
    }

    return a;
}
 public static void main(String[] args) {
    System.out.println(gcd(16,8));
 }
}

