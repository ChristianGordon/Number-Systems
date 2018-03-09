/**
 * Write a description of class Java here.
 * 
 * @author Christian Gordon 010508833 
 * @version 2-17-2017
 */
import java.util.Scanner;

public class Hexadecimal {
    public static void main(String[] args) {
        System.out.print("Enter a hexadecimal number: ");
        Scanner sc = new Scanner(System.in);
        String inputasHexadecimal = sc.nextLine();
        try {
            Integer Decimal = Integer.parseInt(inputasHexadecimal , 16);
            System.out.println("Decimal Number : " + Decimal);
        }
        catch(NumberFormatException ne){
            System.out.println("Input is not valid");
        }
        finally{
            sc.close();
        }
    }
}