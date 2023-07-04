import java.util.Scanner;

public class aliceApple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. apples trees in north:");
        int N = sc.nextInt();
        System.out.println("Enter no. apples trees in south:");
        int S = sc.nextInt();
        System.out.println("Enter no. apples trees in west:");
        int W = sc.nextInt();
        System.out.println("Enter no. apples trees in east:");
        int E = sc.nextInt();
        System.out.println("Enter client requirement:");
        int M = sc.nextInt();
        System.out.println("Enter client color code requirement: (1 - for green, 2 - for red)");
        int color = sc.nextInt();
        System.out.println("Enter how many apples will be given by the each tree:");
        int K = sc.nextInt();
        int sum = 0;
        if (color == 1) {
            if (sum < M) {
                sum += N*K;
                if(sum<M){
                    sum += W*1;
                    if(sum<M){
                        sum += E*1;
                    }
                }
            }
        }
        else if(color == 2){
            if (sum < M) {
                sum += S*K;
                if(sum<M){
                    sum += W*1;
                    if(sum<M){
                        sum += E*1;
                    }
                }
            }
        }
        String apColor = (color==1)?"green":"red";
        if(sum==M){
            System.out.println("Requirement satisfied for "+sum+" "+apColor+" apples.");
        }
        else{
            System.out.println("Sorry! Requirement not satisfied. Available "+apColor+" apples are:"+sum);
            
        }

    }
}
