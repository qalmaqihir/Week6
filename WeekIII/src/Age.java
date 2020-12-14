import java.util.Scanner;

public class Age {
    /*
    Write a Java program that asks a user to enter his/her age.
    If the user's age is in the range of [18, 150] (18 ≤ age ≤ 150),
     program prints “Old enough!”,  when the given age is smaller than
     the given range it must print “Too young”, and
     otherwise prints "Incorrect age."
     */
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age= src.nextInt();
        if (age>=18 && age<=150){
            System.out.println("Old enough!");
        }else if (age<18 && age >0){
            System.out.println("Too young");
        }else{
            System.out.println("Incorrect age.");
        }
    }
}
