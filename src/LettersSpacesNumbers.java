import java.util.Arrays;
import java.util.Scanner;

public class LettersSpacesNumbers {
    /*
    Write a Java program to count the letters, spaces, numbers and other characters of an input string.
Input:
The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
Output:
letter: 34
space: 14
number: 10
other: 7
     */
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String input = src.nextLine();
        System.out.println(lettersSpacesNumbersCheck(input));

    }public static void lettersSpacesNumbersCheck(String s){
        String[] stringArray=s.split(" ");
        System.out.println(Arrays.deepToString(stringArray));
        int countLetters=0;
        int countSpaces=stringArray.length-1;
        int countNumbers=0;
        int countOthers=0;
        String letters = "(.*[A-Za-z].*)";
        String number = "(.*[0-9].*)";
        String others = "(.*^[A-Za-z0-9]*.)";
        for (String word : stringArray){
            //System.out.println(Arrays.deepToString(stringArray));
            for (int i = 0; i <word.length() ; i++) {
                String[] comparing =word.split("");
                // System.out.println(Arrays.deepToString(comparing));
                if (comparing[i].matches(letters)){
                    countLetters+=1;
                }
                else if(comparing[i].matches(number)){
                    countNumbers+=1;
                }
                else if(comparing[i].matches(others)){
                    countOthers+=1;
                }
            }
            System.out.println(String.format(" letter: %d%nspace: %d%nnumber: %d%nother: %d%n",countLetters,countSpaces,countNumbers,countOthers));
        }

    }
}


}
