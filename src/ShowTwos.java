import java.util.Scanner;

public class ShowTwos {
    public static void main(String[] args) {
        /*
        Write a Java program that implements the method named showTwos that shows the factors of 2 in a given integer.
         */
        Scanner src=new Scanner(System.in);
        int input=src.nextInt();
        System.out.println(showTwos(input));
    }
    public static String showTwos(int n){
        String output=String.format("%d = ",n);
        if(n%2!=0){
            output+=String.format("%d ",n);
        }else {
            while(n%2==0){
                n=n/2;
                output+=String.format(" 2 * ");
            }
            output+=String.format("%d",n);
        }
        return output;
    }
}
