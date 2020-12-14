import java.util.Scanner;

public class Decimal2Binary {
    public static void main(String[] args) {

        int decimalNumber;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        decimalNumber = console.nextInt();

        System.out.printf("Binary of %d is %s", decimalNumber, decimalToBinary(decimalNumber));
    }

    private static String decimalToBinary(int decimalNumber) {
        StringBuilder binary = new StringBuilder();
        while(decimalNumber>0){
            binary.append(decimalNumber%2);
            decimalNumber=decimalNumber/2;
        }

        while(binary.length()<8){
            binary.append(0);
        }

        binary.reverse();
        return binary.toString();

    }
}