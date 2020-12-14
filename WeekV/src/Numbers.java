import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        /*
        Write a Java program that accepts an integer ( n ) and
        computes the value of n+nn+nnn.
        In case of wrong input, you must print out text "error".
         */

        Scanner src= new Scanner(System.in);

        boolean n = src.hasNextInt();
        if(!src.hasNextInt()){
            System.out.println("error");
        }else{
            try
            {
                int input=0;
                input=Math.abs(src.nextInt());
                int number= input;
                //converting int to string
                String number1= Integer.toString(number);
                String number2= number1.concat(number1);
                String number3=number2.concat(number1);

                // checking valid integer using parseInt() method
                Integer.parseInt(number1);
                int n1= Integer.parseInt(number1);
                int n2= Integer.parseInt(number2);
                int n3= Integer.parseInt(number3);
                //calling the function sum()
                sum(n1,n2,n3);
            }
            catch (NumberFormatException e)
            {
                System.out.println("error");
            }

        }

    }

    private static void sum(int n1,int n2, int n3) {
        int total=n1+n2+n3;
        if(n1==n2 && n1==n3 && n1==0){
            System.out.println("0 + 00 + 000 = 0");
        }
        else{
            System.out.printf("%d + %d +%d = %d", n1,n2,n3,total);
        }

    }

}

