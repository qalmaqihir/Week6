import java.util.Scanner;

public class ZeroEnd {
    /*
    Write a Java program that implements the function named zeroEnd so that it returns an array
    that contains the exact same numbers as the given array, but rearranged so that all
    the zeros are grouped at the end of the array. The order of the non-zero numbers does not matter.
    So {1, 0, 0, 1} becomes {1 ,1, 0, 0}. n case when inputs are not integers,
     you must output the "Input error" message. You may modify and return the given array or make a new array.
      The input size <= 100.

zeroEnd ( [1, 0, 0, 1] ) → [1, 1, 0, 0]
zeroEnd ( [0, 1, 1, 0, 1] ) → [1, 1, 1, 0, 0]
zeroEnd ( [0, 1] ) → [1, 0]

     */
    private static String s;
    private static String[] strArray;
    public static void main(String[] args) {
        input();
        //
        String array="";
        for (String s: strArray) {
            array+=s;
        }
//            System.out.println(Arrays.toString(strArray));
//            System.out.println(array);
        if(!isInteger(array)){
            System.out.println("input error");
        }else{
            System.out.println(zeroEnd(strArray));
        }
    }

    private static void input() {
        Scanner src = new Scanner(System.in);
        String given=src.nextLine();
        String trimed= given.trim();
        String[] strArray=trimed.split(" ");
    }

    public static String zeroEnd(String[] s){
        String zeros="";
        String remaining="";
        for (String i: s) {
            if(i.equals("0")){
                zeros+=i+" ";
            }else{
                remaining+=i+" ";
            }
        }
        return remaining+zeros;
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
