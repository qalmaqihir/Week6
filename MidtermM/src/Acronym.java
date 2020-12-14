import java.util.Arrays;
import java.util.Collection;

public class Acronym {
    private String phrase;

    public Acronym(String phrase) {
        this.phrase = phrase;
    }

    public String get(){
        phrase = phrase.toUpperCase();
        String[] phraseArray = phrase.trim().split(" ");
        System.out.println(Arrays.toString(phraseArray));
        String acronm = "";
        for (String element : phraseArray) {

            String[] extra=element.split("-");
            System.out.println(Arrays.toString(extra));
            if (extra.length>1){
                for(String c:extra){
                    acronm += (c.charAt(0));
                }
            }
            else{
                acronm += (extra[0].charAt(0));
            }

        }
        return acronm;
    }
}