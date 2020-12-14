import java.util.Scanner;

public class SumEvenFibonacciNumbers {
    /*
    Write a Java method that returns the sum of all even Fibonacci numbers.
    Consider all Fibonacci numbers that are less than or equal to n. Each new element in the Fibonacci sequence
     is generated by adding the previous two elements.

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

Constraints:
The following constraint applies for the input integer number n: 1<n≤1000

Even though the classic Fibonacci sequence starts with the first two integers: 1 and 1, in the given problem,
the Fibonacci sequence starts with 1 and 2.
     */
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter the n: ");
        int input= scr.nextInt();
        SumEvenFibNumber(input);
    }

    private static void SumEvenFibNumber(int a) {
        int firstFibo=1;
        int nextFibo=2;
        int evenFibSum=0;
        do{
            if(nextFibo%2==0){
                evenFibSum+=nextFibo;
            }
            //swapping the seq
            int newFibo=nextFibo+firstFibo;
            firstFibo=nextFibo;
            nextFibo=newFibo;
        }while(nextFibo<a);
        System.out.println(evenFibSum);
    }
}
