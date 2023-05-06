import java.util.Scanner;
public class randomNumberGuess {
    public static void main(String[] args) {
        
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100: ");
        int guessnumber = myobj.nextInt();
        System.out.println("The guessing number is : " + guessnumber);

        int randomNumber = (int) (Math.random() * 100);
        System.out.println("The random number is " + randomNumber);
    

    if(guessnumber == randomNumber){
        System.out.println("your guess is correct");
    }
    else if (guessnumber < randomNumber){
        System.out.println("Kindly guess a higher number");
    }
    else if (guessnumber > randomNumber){
        System.out.println("Kindly guess a lower number");
    }

    

    
} 
}

