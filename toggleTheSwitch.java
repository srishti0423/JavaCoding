import java.util.Arrays;
import java.util.Scanner;

public class toggleTheSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of bulbs:");
        int n = sc.nextInt();
        boolean[] bulbsArray = new boolean[n];
        Arrays.fill(bulbsArray, Boolean.FALSE);
        // for (int i = 0; i < bulbsArray.length; i++) {
        //     System.out.println(bulbsArray[i]);
        // }
        for (int i = 1; i < n + 1; i++) {// for every row
            // System.out.println("i:" + i);
            for (int j = 0; j < n; j++) {// for every column or index of array
                if ((j + 1) % i == 0) {
                    // System.out.println(j);
                    bulbsArray[j] = !bulbsArray[j];
                }
            }
        }
        System.out.println("On bulbs are:");
        for (int i = 0; i < bulbsArray.length; i++) {
            if(bulbsArray[i]==true){
                System.out.println(i+1);
            }
        }

    }
}
