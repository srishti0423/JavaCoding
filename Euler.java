import java.util.Scanner;
public class Euler {
    public int gcd(int a, int b) {
        if(a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        Euler obj = new Euler();
        int n = sc.nextInt();
        int counter = 0;
        for(int i = 1; i < n; i++) {
            if(obj.gcd(i, n) == 1) {
                counter++;
            }
        }
        System.out.println("Euler's Phi value for " + n + " is: " + counter);
        sc.close();
    }
}
