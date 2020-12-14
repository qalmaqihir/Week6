import java.util.Arrays;
import java.util.Scanner;

public class AdjacentArrayElements {
    private static int[] given =new int[10];
    /*
    Write a program that takes input 10 integer numbers and stores in an array.
    Afterward, count the series of 2 or more adjacent elements in an array and output that number.
     In cases when input:
    size is not 10 or
    all not integers
    your must print out an "error" message
     */
    public static void main(String[] args) {
        input();
        System.out.println(adjacentArrayElements(given));
    }

    private static int adjacentArrayElements(int[] given) {
        System.out.println("From within function");
        System.out.println(Arrays.toString(given));
        return 0;
    }

    private static void input() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        String inputs= console.nextLine();
       // System.out.printf("To be converted %s%n",inputs);
        String trimed=inputs.trim();
        //System.out.printf("Trimed string %s %n",trimed);
        String[] strArray=trimed.split(" ");
       // System.out.println("Array of Strings");
        //System.out.println(Arrays.toString(strArray));

        for (int i = 0; i < 10; i++) {
            if(isInteger(strArray[i])){
                given[i] = Integer.parseUnsignedInt(strArray[i]);
            }
            else{
                System.out.println("input error");
                break;
            }
        }
       // System.out.println("The Converted int array..");
       // System.out.println(Arrays.toString(given));
    }
    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        }
        catch(NullPointerException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }
}
