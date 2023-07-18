import java.util.Scanner;
public class ArrayEquilibrium {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<size;i++){
            sum += arr[i];
        }
        int left_sum = 0;
        for(int i=0;i<size;i++){
            sum -= arr[i];
            if(left_sum == sum){
                System.out.println("Equilibrium index is: "+i);
            }
            left_sum += arr[i];
        }
        sc.close();
    }
}