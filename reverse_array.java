import java.util.Scanner;

public class reverse_array {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = size-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }



    
}
