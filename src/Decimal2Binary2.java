import java.util.Scanner;

public class Decimal2Binary2 {
    /*
    Write a Java program DecimalToBinary that implements the static method decimalToBinary()
    which converts decimal number N to its binary representation.
Note: You are not allowed to use a built-in subroutine like Integer.toBinaryString().
     */
    public static void main(String[] args) {
        // Taking the Number N from the user
        System.out.println("Enter an integer number: ");
        Scanner input= new Scanner(System.in);
        int number=input.nextInt();
        decimalToBinary(number);

    }
    public static int decimalToBinary(int n){
        // String to store the binary digits
        String binaryDigits=" ";
        int digits= Integer.parseInt(binaryDigits);
        int counter;
        //Conversion part
        while(n==1 || n==0){
            binaryDigits = binaryDigits.concat(Integer.toString(n%2)) ;
            counter = n;
            n=n/2;
        }
        System.out.println(binaryDigits);
        return digits;
    }

}
