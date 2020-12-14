import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        /*
        Write a Java program that implements static method roundSum() so that given 3 ints:
        a, b, and c; return the sum of their rounded values. We'll round an int value up to the
        next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20.
        Alternately, round down to the previous multiple of 10 if its rightmost digit is
         less than 5, so 12 rounds down to 10.
         */
        Scanner src= new Scanner(System.in);
        System.out.println("Enter three integers: ");
        int a= src.nextInt();
        int b= src.nextInt();
        int c= src.nextInt();
        System.out.printf("Rounded Sum is "+roundSum(a,b,c));
        }
        public static int roundSum(int a, int b, int c){
        int total = a+b+c;
        int result=0;
        if (total%10>=5){
            return  ((total/10)+1)*10;
        }
        else{
            return (total/10)*10;
        }
    }
}
