import java.util.Scanner;

public class WordLengthes {
    private static String sentence;
    public static void main(String[] args) {
        input();
        wordLenghts(sentence);
    }
    public static void input(){
        Scanner src= new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        sentence= src.nextLine();
    }
    public static void wordLenghts(String str){
        String[] words= str.split(" ");
        for(int i=1; i<words.length;i++){
            for(int j =0; j<words[i].length();j++){
                int wordlength=words[i].length();
                System.out.printf("%d: %d%6s%n",i,wordlength,"*");
            }

        }
    }

}
