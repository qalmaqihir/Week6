import java.util.Scanner;

public class Factorials1 {
    public static void main(String[] args) {
// add your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int n = input.nextInt();
        if (n>=0){
            System.out.println("X X!\n");
            for(int i=0; i<= n; i++){
                System.out.println(i + " "+factorialOfN(i));
            }}
        else{
            System.out.println("Incorrect input!");
        }

    }

    private static long factorialOfN(int n) {
        int x = 1;
// add your code here
        for (int i = 1; i <= n; i++) {
            x = x * i;
        }
        return x;

    }
}
