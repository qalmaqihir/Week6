import java.util.Arrays;

public class AlmostPalindrome {
    /*
    A string is an almost-palindrome if, by changing only one character, you can make it a palindrome.
     Create a function that returns true if a string is an almost-palindrome and false otherwise.

        Examples
        almostPalindrome("abcdcbg") ➞ true
        // Transformed to "abcdcba" by changing "g" to "a".

        almostPalindrome("abccia") ➞ true
        // Transformed to "abccba" by changing "i" to "b".

        almostPalindrome("abcdaaa") ➞ false
        // Can't be transformed to a palindrome in exactly 1 turn.

        almostPalindrome("1234312") ➞ false
     */
    public static void main(String[] args) {
        almostPalindrome("abcdcbg");
    }

    public static void almostPalindrome(String str){
        String[] strArray=str.split("");
        System.out.println(Arrays.toString(strArray));
        boolean flag=false;
        String checkedEnd="";
        int index=0;
        int n=1;
        while(!flag&&index!=str.length()){
            if(strArray[index]!=strArray[strArray.length-n]){
                checkedEnd+=strArray[index];
                flag=true;
                System.out.println(checkedEnd);
            }else{
                checkedEnd+=strArray[strArray.length-n];
                System.out.println(checkedEnd);
                n++;
                index++;
            }
        }
        int index2=0;
        int k=2;
        while(flag && index2!=strArray.length-1){
            checkedEnd+=strArray[strArray.length-k];
            k++;
            index2++;
            System.out.println(checkedEnd);
        }
        String[] checkedArray=checkedEnd.split("");
        System.out.println(Arrays.toString(checkedArray));
        int index3=0;
        int m=1;
        while(index3!=(checkedArray.length-1)/2){
            if(checkedArray[index3]==checkedArray[checkedArray.length-m]){
                System.out.println("true");
                index3++;
            }
            else{
                //System.out.println("false");
                index3++;
            }

        }

    }
}
