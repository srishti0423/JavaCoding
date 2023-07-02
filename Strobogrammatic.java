import java.util.Scanner;

public class Strobogrammatic {
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        // String num = "1";
        int len = num.length();
        int left = 0;
        int right = len-1;
        boolean Value = false;
        while(left<=right){
            if(num.charAt(left)=='0' && num.charAt(right)=='0')
            {
                Value = true;
            }
            else if(num.charAt(left)=='1' && num.charAt(right)=='1')
            {
                Value = true;
            }
            else if(num.charAt(left)=='8' && num.charAt(right)=='8')
            {
                Value = true;
            }
            else if(num.charAt(left)=='6' && num.charAt(right)=='9')
            {
                Value = true;
            }
            else if(num.charAt(left)=='9' && num.charAt(right)=='6')
            {
                Value = true;
            }
            else{
                Value = false;
            }
            left++;
            right--;
        }
        if(Value == true){
            System.out.println("Strobogrammatic");
        }
        else{
            System.out.println("Non Strobogrammatic");
        }
    }
}