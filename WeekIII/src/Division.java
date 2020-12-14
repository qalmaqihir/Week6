import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        /*
        Write a Java program that returns the result of the division of two numbers
        that were given by the user. In case of incorrect input,
        the program must print an error message: “Incorrect input!”.
         */
        System.out.println("Enter a dividend: ");
        Scanner src = new Scanner(System.in);
        int dividend= src.nextInt();
        System.out.println("Enter a divisor: ");
        int divisor= src.nextInt();
        if (divisor!=0){
            int quotient = dividend/divisor;
            System.out.println("Quotient is : "+ quotient);
        }else{
            System.out.println("Incorrect input!");
        }



    }
}
