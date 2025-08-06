package Swetha2;
import java.util.*;

public class test{
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        if (isPrime(num) && isPrime(reverse(num)))
            System.out.println("Twisted Prime Number");
        else
            System.out.println("Not Twisted Prime Number");
    }
}
