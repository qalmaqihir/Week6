import java.util.Arrays;
import java.util.Scanner;

public class SplitSentence {
    public static void main(String[] args) {
        System.out.println("Write Your sentence: ");
        Scanner src= new Scanner(System.in);
        String input = src.nextLine();
        //System.out.println(input);
        split(input);

    }

    private static void split( String input) {
        String out1=input.replace("'","");
        System.out.println(out1);
        String out2=out1.replaceAll("[^a-zA-Z]", " ");
        System.out.println(out2);
        String[] out=out2.split(" ");

       // System.out.println(Arrays.toString(out));
       output(out);
    }

    private static void output(String[] outSplit) {
        boolean loop=true;
        while (loop){
            for (String string : outSplit ){
                if (string.equals("")){

                }
                else{
                    System.out.println(string);
                }
            }
            loop=false;

        }
    }
}
