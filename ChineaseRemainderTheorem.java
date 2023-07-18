import java.util.Scanner;
public class ChineaseRemainderTheorem {//using formula
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of congruent equations:");
        int n = sc.nextInt();
        int a_array[] = new int[n];
        int m_array[] = new int[n];
        int M_array[] = new int[n];
        int M_inv_array[] = new int[n];
        int M = 1;
        System.out.println("Enter values for the array of 'a' elements:");
        for(int i=0;i<n;i++){
            System.out.println("Enter a"+i+":");
            a_array[i] = sc.nextInt();
        }
        System.out.println("Enter values for the array of 'm' elements:");
        for(int i=0;i<n;i++){
            System.out.println("Enter m"+i+":");
            m_array[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            M *= m_array[i];
        }
        for(int i=0; i<n;i++){
            M_array[i] = (M/m_array[i]);
        }
        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                if(((M_array[i]*(j+1))%m_array[i])==1){
                    // System.out.println("j:"+j);
                    M_inv_array[i] = j+1;
                }
            }
        }
        // for(int i=0;i<n;i++){
        //     System.out.println("a"+(i+1)+":"+a_array[i]);
        //     System.out.println("m"+(i+1)+":"+m_array[i]);
        //     System.out.println("M"+(i+1)+":"+M_array[i]);
        //     System.out.println("(M^-1)"+(i+1)+":"+M_inv_array[i]);
        // }
        System.out.println("M"+":"+M);
        int X=0;
        for(int i=0;i<n;i++){
            X += (a_array[i]*M_array[i]*M_inv_array[i]);
            
            
        }
        X = X%M;
        System.out.println("X is:"+X);
    }
}
