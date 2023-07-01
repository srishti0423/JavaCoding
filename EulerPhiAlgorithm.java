import java.util.Scanner;

public class EulerPhiAlgorithm {
    
    public static int eulerPhi(int n) {
        int result = n; // Initialize result as n
        
        // Consider all prime factors of n and subtract their multiples from result
        for (int p = 2; p * p <= n; p++) {
            // Check if p is a prime factor of n
            if (n % p == 0) {
                // Update result using Euler's formula: result = result * (1 - 1/p)
                while (n % p == 0) {
                    n /= p;
                }
                result -= result / p;
            }
        }
        
        // If n has a prime factor greater than sqrt(n), then there can be at most one such prime factor
        if (n > 1) {
            result -= result / n;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int phi = eulerPhi(n);
        System.out.println("Euler's Phi value for " + n + " is: " + phi);
        sc.close();
    }
}
