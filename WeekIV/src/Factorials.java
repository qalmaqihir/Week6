import java.awt.geom.NoninvertibleTransformException;
import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        // add your code here
        Scanner input= new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int n= input.nextInt();

        if(n<0){
            System.out.print("incorrect result");
        }else{
            System.out.print("X    X!\n");
            for (int i = 0; i <=n; i++) {
                System.out.printf("%-4d%d\n",i,factorialOfN(i));
            }
        }
    }

    private static long factorialOfN(int n) {
        // add your code here
        int m=1;
        for (int i =0 ; i <=n ; i++) {
            if(i==0 || i==1){
                m=m;
            }
            else
            {
                m=m*i;
            }
        }
        return m;
        }
    }
