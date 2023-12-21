import java.util.Arrays;
import java.util.Scanner;

public class Multidimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] arr = new int[3][2];
        System.out.println("Enter the elements of array: ");
        System.out.println(arr.length);
    for(int i=0;i<arr.length;i++){
        for(int j=0; j<arr[i].length; j++){
            arr[i][j]= sc.nextInt();
        }
        
    }
    for(int i=0;i<arr.length;i++){
        
            System.out.print(Arrays.toString(arr[i]));
            System.out.println();
        }
        
    }
}

