import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        /*
        A palindromic number or palindrome number is a number that remains the same when its digits are reversed.
        Like 16461. Write a Java program that implements the helper method isPalindrome() that decides
         whether a given int number is a palindrome or not.
        Do not use strings and string functions or arrays and array functions!!!
         */
        Scanner src= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input=src.nextInt();
        System.out.println(isPalindrome(input));
    }
    public static String isPalindrome(int n){
        String result1="This number is not a palindrome";
        String result2="This number is a palindrome";
        int checkStart=n;
        int checkEnd=n;
        int count=0;
        boolean found =true;
        while(n!=0){
            n=n/10;
            count++;
        }
        while(count!=0){
            int first=checkStart%10;
            int mod = (int)(10*(Math.pow(10,count)/100.0));
            int last = checkEnd/mod;
            if (first==last && found){
                checkEnd=(checkEnd)-(last*mod);
                checkStart/=10;
                count--;
                found=true;
            }
            else {
                found= false;
                break;
            }
        }
        if(found){
            return result2;
        }else{
            return result1;
        }
    }
}
