import java.util.Scanner;

public class GPA {
    /*
    Write a Java program that converts the 100 point grades into the letter grades.
     */
    public static void main(String[] args) {
        System.out.println("The user enters a grade. ");
        Scanner src = new Scanner(System.in);
        double grade = src.nextDouble();
        if ( grade >=93 && grade <=100){
            System.out.println("A 4.0");
        }
        else if ( grade >=90 && grade <=92){
            System.out.println("A- 3.67");
        }
        else if ( grade >=87 && grade <=89){
            System.out.println("B+ 3.33");
        }
        else if ( grade >=83 && grade <=86){
            System.out.println("B 3.0");
        }
        else if ( grade >=80 && grade <=82){
            System.out.println("B- 2.67");
        }
        else if ( grade >=77 && grade <=79){
            System.out.println("C+ 2.33");
        }
        else if ( grade >=70 && grade <=76){
            System.out.println("C 2.0");
        }
        else if ( grade >=60 && grade <=69){
            System.out.println("D 1.0");
        }else if (grade >=0 && grade <=59){
            System.out.println("F 0.0");
        }else{
            System.out.println("Incorrect grade!");
        }
    }
}
