import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SplitSentencer {
    public static void main(String[] args) {
        /*
        Write a Java program that reads one line of input text and
         breaks it up into words. The words should be output one per line.
          A word is defined to be a sequence of letters.
           Any characters in the input that are not letters should be
           discarded.
         */
        System.out.println("Write Your sentence: ");
        Scanner src= new Scanner(System.in);
        String input = src.nextLine();
        System.out.println(input);
        String out= input.replaceAll("[^a-zA-Z0-9]"," ");
        System.out.println(out);
        String[] outSplit=out.split(" ",0);
        System.out.println(Arrays.toString(outSplit));
        boolean loop=true;
        while (loop){
            for (String string : outSplit ){

                System.out.println(string);
            }
            loop=false;

        }

    }
}

