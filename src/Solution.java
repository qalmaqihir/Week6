import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int numberOfLines= src.nextInt();
        String word1="";
        while(numberOfLines!=0){
            word1+=src.next()+ " ";
            numberOfLines--;
        }

        System.out.println(capitalization(word1));
    }
    public static String capitalization(String a){
        String[] words=a.split(" ");
        int loop=0;
        String result="";
        while(loop!= words.length){
            String word=words[loop];
            if (word.length()>10){
                char firstWord=word.charAt(0);
                char lastWord=word.charAt(word.length()-1);
                result+=String.valueOf(firstWord)+(word.length()-2)+String.valueOf(lastWord) +"\n";
            }else
            {
                result+=word+"\n";
            }
            loop++;
        }
        return result;
    }
}
