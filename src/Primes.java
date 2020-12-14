import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        /*
        Write a Java program Primes that finds all possible prime numbers in the range of (1, n],
        where 1 < n ≤ 1000. Solve the problem by implementing and using the helper method isPrime(number)
        which determines whether the given argument is prime or not.
         */
        Scanner src= new Scanner(System.in);
        int number=src.nextInt();

        for (int i=2; i<=number;i++){
            if (isPrime(i)){
                System.out.print(i+" ");
            }
            else{
                ;
            }
        }
    }

    public static boolean isPrime(int num) {
        boolean result=true;
        if (!(num==2 || num==3 || num==5 ||num==7 ||num==11 || num==13 || num==17 || num==19 || num==23 || num==29 || num==31)){
            if (!(num%2==0 || num%3==0 || num%5==0 ||num%7==0 || num%11==0 || num%13==0 || num%17==0 || num%19==0 || num%23==0 ||num%29==0 || num%31==0)){
                result=result;
            }else{
                result=false;
            }
        }else if(num==2 || num==3 || num==5 ||num==7 ||num==11 || num==13|| num==17 || num==19 || num==23 || num==29 || num==31){
            result=result;
        }else {
            result=false;
        }
        return result;
    }

}
