import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        /*
        Write a Java program that asks a user to enter three numbers and print out the least one.
         */
        Scanner src = new Scanner(System.in);
        System.out.println("User enters three numbers a,b,c. ");
        int num1= src.nextInt();
        int num2= src.nextInt();
        int num3= src.nextInt();
        if (num1==num2 && num2==num3){
            System.out.println("They are all equal");

        }else{
            if (num1<=num2 && num1<=num3){
                System.out.println("The least of these three numbers is "+num1);
            }else if(num2<=num1 && num2<=num3){
                System.out.println("The least of these three numbers is "+num2);
            }else if(num3<=num1 && num3<=num2){
                System.out.println("The least of these three numbers is "+num3);
            }

        }
    }
}
