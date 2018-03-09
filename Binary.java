/**
 * Write a description of class Java here.
 * 
 * @author Christian Gordon 010508833 
 * @version 2-17-2017
 */
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        System.out.println("Binary to Hexadecimal conversion");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        int number = Integer.parseInt(sc.nextLine(), 2);
        String hexadecimal = Integer.toHexString(number);
        System.out.println(hexadecimal);
    }
}