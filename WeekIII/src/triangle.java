import java.util.Scanner;

public class triangle {
    /*
    Write a Java program that asks a user to enter the three angles of a triangle.
    If the sum of three angles entered is equal to 180,
    then prints out “It is a valid triangle.”, otherwise "It is not a valid triangle."
     */
    public static void main(String[] args) {
        System.out.println("Enter the three angles: ");
        Scanner src= new Scanner(System.in);
        int angle1= src.nextInt();
        int angle2= src.nextInt();
        int angle3 = src.nextInt();
        if (angle1 ==0 || angle2==0 || angle3==0){
            System.out.println("It is not a valid triangle.");
        }
        else if ((angle1+angle2+angle3)==180){
            System.out.println("It is a valid triangle.");
        }else{
            System.out.println("It is not a valid triangle.");
        }
    }
}
