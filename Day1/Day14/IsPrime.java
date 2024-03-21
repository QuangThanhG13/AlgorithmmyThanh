package Day14;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        int n;
        boolean isPrime;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number: ");
        n = scanner.nextInt();

        for (int i = 2; i <= n; i++) {
            isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break; // Once we find a divisor, no need to check further
                }
            }
            if (isPrime) {
                System.out.println(i + " is a prime number.");
            }
        }
    }
}
