import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String args[]) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        /*int arr[] = {1,2,3,4,5,6,7};
        for(int i=0; i < 7; i++) {
            System.out.print(arr[i]+" ");
        }  */
        /*String[] arr = new String[4];
        
        for(int i= 0;i < arr.length;i++) {
            arr[i] = sc.next();
            
        }
        arr[3] = "Srishti";
        System.out.print(Arrays.toString(arr));*/
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }   
    static void change(int[] arr) {
        arr[5] = 99;
    }
}
