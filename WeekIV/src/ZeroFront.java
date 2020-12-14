import java.util.Arrays;
import java.util.Scanner;

public class ZeroFront {

        /*
    Write a function that returns an array that contains the exact same numbers as the given array,
     but rearranged so that all the zeros are grouped at the start of the array. The order of the non-zero
     numbers does not matter but has to arranged in order of appearance in the original array. So {1, 0, 0, 1}
     becomes {0 ,0, 1, 1}. In case when inputs are not integers, you must output the  "input error" message.
     You may modify and return the given array or make a new array. The input size <= 100.
     */
        public static void main(String[] args) {
            Scanner src = new Scanner(System.in);
            String given=src.nextLine();
            String trimed= given.trim();
            String[] strArray=trimed.split(" ");
            String array="";
            for (String s: strArray) {
                array+=s;
            }
//            System.out.println(Arrays.toString(strArray));
//            System.out.println(array);

            if(!isInteger(array)){
                System.out.println("input error");
            }else{
                System.out.println(zeroFront(strArray));
            }
        }
        public static String zeroFront(String[] s){
            String zeros="";
            String remaining="";
            for (String i: s) {
                if(i.equals("0")){
                    zeros+=i+" ";
                }else{
                    remaining+=i+" ";
                }
            }
            return zeros+remaining;
        }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        } catch(NullPointerException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }
}

