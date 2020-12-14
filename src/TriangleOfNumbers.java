import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        /*
        Write a Java program that implements the static method printTriangle()
         which receives an integer N as an argument, and prints a triangle until N in the
         format shown below.
         Enter N: 5
            1
           12
          123
         1234
        12345
         */
        Scanner src=new Scanner(System.in);
        System.out.println("Enter N: ");
        int input=src.nextInt();

        printTriangle(input);
    }

    public static void printTriangle(int n) {
        int counter=1;

//        int k=n;
//        int j=n;
//        while(k!=0){
//            while(j!=0){
//                gap+=" ";
//                j--;
//            }
//            gap+=counter;
//            counter++;
//            System.out.println(gap);
//            k--;
//        }
        String gap="";
        for (int i = n; i > 0 ; i--) {

            while(n!=0){
                gap+=" ";
                n--;
            }
            gap+=counter;
            counter++;
            System.out.println(gap);
        }
    }
}

