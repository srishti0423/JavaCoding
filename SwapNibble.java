import java.util.Scanner;

public class SwapNibble {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scan.nextInt();

        // Extract two bytes from the number
        byte b1 = (byte) ((number >> 8) & 0xFF);
        byte b2 = (byte) (number & 0xFF);

        // Swap 1st and 3rd nibble
        byte t1, t3;
        t1 = (byte) ((b1 >> 4) & 0x0F);
        t3 = (byte) ((b1 << 4) & 0xF0);
        b1 = (byte) (t1 | t3);

        // Swap 2nd and 4th nibble
        byte t2, t4;
        t2 = (byte) ((b2 >> 4) & 0x0F);
        t4 = (byte) ((b2 << 4) & 0xF0);
        b2 = (byte) (t2 | t4);

        // Reconstruct the number after swapping nibbles
        int swappedNumber = ((b1 & 0xFF) << 8) | (b2 & 0xFF);
        System.out.println();
        System.out.println("Reg ID: 21BHI10034");
        System.out.println("Name: Srishti Gautam");
        System.out.println("After swapping the nibbles, The new number obtained is: " + swappedNumber);

        scan.close();
    }
}
