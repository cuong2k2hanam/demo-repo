import java.util.Scanner;

public class Solution {

    static int gcd(int a, int b) {
        // if (a == Integer.MIN_VALUE && b == Integer.MIN_VALUE) {
        //     return  Integer.MIN_VALUE;
        // }
        // if (a == Integer.MIN_VALUE) {
        //     a = (int) (-((long) a) % b);
        // }
        // if (b == Integer.MIN_VALUE) {
        //     b = (int) (-((long) b) % a);
        // }
        // if (a == 0) {
        //     return b;
        // } else if (b == 0) {
        //     return a;
        // }
        // if (a < 0) {
        //     a = -a;
        // }
        // if (b < 0) {
        //     b = -b;
        // }
        // if (a >= b) {
        //     return gcd(a % b, b);
        // } else {
        //     return gcd(a, b % a);
        // }
        while( a != 0 && b != 0 ){
            if(a >= b) a = a % b;
            else b = b % a;
        }
        return a !=0 ? a : b;
    }

    /**
     * for arrays of size 250, 500, 1000, 2000, and so forth.
     */
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int a = scanner.nextInt();
         int b = scanner.nextInt();
         int c = gcd(a, b);
         System.out.println(c);
         scanner.close();
    }
}