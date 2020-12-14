import java.util.Scanner;

public class EvenOdd {
    /*
    Write a Java program that asks a user to enter a number and prints out
    if it is odd or even.
     */
    public static void main(String[] args) {
        System.out.println("A user enters any number. ");
        Scanner src= new Scanner(System.in);
        int number=src.nextInt();
        if (number%2==0 && number!=0){
            System.out.println("This number is even");
        }
        else if (number==0){
            System.out.println("0 is not odd nor even");
        }else{
            System.out.println("This number is odd");
        }
    }
}
