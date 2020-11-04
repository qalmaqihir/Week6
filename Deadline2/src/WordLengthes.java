import java.util.Arrays;
import java.util.Scanner;

public class WordLengthes {
    private static String sentence;
    public static void main(String[] args) {
        input();
        wordLenghts(sentence);
        //System.out.println(wordLenghts(sentence));
    }
    public static void input(){
        Scanner src= new Scanner(System.in);
//        System.out.println("Enter your sentence: ");
        sentence= src.nextLine();
    }
    public static void wordLenghts(String str){
        String[] words=str.strip().split(" ");
        String[] wordsOnly=new String[words.length];
//        System.out.println(Arrays.toString(wordsOnly));

        for (int j=0;j< wordsOnly.length;j++ ){
            String addWord="";
            for (int i = 0; i <words[j].length() ; i++) {
                if(Character.isLetter(words[j].charAt(i))){
                    addWord+=words[j].charAt(i);
                }
            }
            wordsOnly[j]=addWord;
        }
       //System.out.println(Arrays.toString(wordsOnly));

        for (int i = 0; i < wordsOnly.length ; i++) {
            if(i==0 && wordsOnly[i].length()<10){
                System.out.printf("%2d: %d%4s",i+1,wordsOnly[i].length()," ");
            }
            else{
                if(wordsOnly[i].length()<10 ){
                    System.out.printf("%d: %d%5s",i+1,wordsOnly[i].length()," ");
                }else{
                    System.out.printf("%d: %d%4s",i+1,wordsOnly[i].length()," ");
                }
            }
            for (int j = 0; j <wordsOnly[i].length() ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
