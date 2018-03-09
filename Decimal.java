/**
 * Write a description of class Java here.
 * 
 * @author Christian Gordon 010508833 
 * @version 2-17-2017
 */
import java.util.Scanner;

class Decimal
{
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        System.out.print("Enter a decimal number to convert into hexadecimal: ");
        int num = sc.nextInt();

        String str = Integer.toHexString(num);
        System.out.println("Decimal to hexadecimal: " +str);
    }
}

class DectoBin {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        System.out.println("Enter a bin number: ");
        int binnum =in.nextInt();
        int binary=binnum;
        int decimal = 0;
        int power = 0;
        while(true) {
            if(binary == 0)
            {
                break;
            }
            else
            {
                int tmp = binary%10;
                decimal += tmp*Math.pow(2, power);
                binary = binary/10;
                power++;
            }
        }
        System.out.println("Bin="+binnum+" Dec="+decimal);
    }
}