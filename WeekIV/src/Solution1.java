import java.util.Arrays;
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        /*
        Write a Java program that implements the static method capitalize()
         which capitalizes the first letter of each word in a sentence.
         */
        Scanner src= new Scanner(System.in);
        String input= src.nextLine();
        //capitalize(input);
        System.out.println(capitalize(input));
    }
    public static String capitalize(String strr){
        String forArray=strr.trim();
        String outputStrr="";
        String[] arrStrr= forArray.split(" ");
        for (String word : arrStrr){
           char oldChar=word.charAt(0);
           char newChar=word.toUpperCase().charAt(0);
           // String addWord=word.replace(word.charAt(0),word.toUpperCase().charAt(0));
            String addWord=word.replace(oldChar,newChar);
            outputStrr=outputStrr.concat(addWord+ " ");
        }
        return outputStrr;
    }
}
