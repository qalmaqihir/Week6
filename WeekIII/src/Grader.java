import java.util.Scanner;

public class Grader {
    /*
    Write a Java program that outputs the message “passed” or “failed” based on the user’s input.
    If the user enters the number in range [50, 100] program must print out the message “passed”,
    if the number is in the range [0, 50) program prints out the message “failed”, otherwise program
    must print out “Incorrect grade!”.
     */
    public static void main(String[] args) {
        System.out.println("Enter his/her grade. ");
        Scanner src =new Scanner(System.in);
        int grade= src.nextInt();
        if (grade>=50 && grade <=100){
            System.out.println("Passed");
        }else if (grade >=0 && grade <50){
            System.out.println("Failed");
        }else{
            System.out.println("Incorrect grade!");
        }
    }
}
