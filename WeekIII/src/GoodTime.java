import java.util.Scanner;

public class GoodTime {
    /*
    Write a Java program that asks a user to enter a time of the day (integer number from 0 to 24).
      If time is between 0 and 5, the program prints "Good night!". If time is less than 10:00,
      then print “Good morning!”.
    If time is less than 20:00, then print “Good day!”, otherwise it prints “Good evening!”.
     */
    public static void main(String[] args) {
        System.out.println("A user enters an integer. ");
        Scanner src =new Scanner(System.in);
        int time=src.nextInt();
        if (time<0 || time >24){
            System.out.println("Not acceptable time.");
        }else if(time >=0 && time <=5){
            System.out.println("Good night!");
        }
        else if(time <10){
            System.out.println("Good morning!");
        }
        else if (time < 20){
            System.out.println("Good day!");
        }
        else{
            System.out.println("Good evening!");
        }
    }
}
