import java.util.Enumeration;
import java.util.Scanner;

public class ReverseTriangleOfNumbers {
    /*
    Given N as an input integer, print a triangle from N until 1. For anything other than int input, print the "Incorrect input" message.

Constraints:
The input integer number is constrained by the following range: 1≤n≤30

Sample I/O:
Enter N: 5
1 2 3 4 5
  1 2 3 4
    1 2 3
      1 2
        1
     */
    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);

        boolean n = src.hasNextInt();
        if(!src.hasNextInt()){
            System.out.println("Enter N: ");
            System.out.println("Incorrect input");
        }else{
            try {
                int input = 0;
                input = Math.abs(src.nextInt());
                int number = input;
                reverseTheTriagnle(number);

            }  catch (NumberFormatException e)
            {
                System.out.println("Incorrect input");
            }
        }
    }
    public static void reverseTheTriagnle(int n){
        System.out.println("Enter N: ");
        int loop =n;
        int count=0;
        while(n!=0){
            String gap="";
            int counter=1;
            for (int i = 1; i <=count ; i++) {
                gap+="  ";
            }
            for (int j = 0; j<loop; j++) {
                gap+=" "+counter;
                counter++;
            }
            count++;
            loop--;
            System.out.println(gap);
            n--;
        }
    }


}
