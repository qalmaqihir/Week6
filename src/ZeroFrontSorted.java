import com.sun.source.tree.ArrayAccessTree;

import java.util.Arrays;
import java.util.Scanner;

public class ZeroFrontSorted {
    /*
    Write a function that returns an array that contains the exact same numbers as the given array,
     but rearranged so that all the zeros are grouped at the start of the array. The order of the non-zero
     numbers does not matter but has to arranged in order of appearance in the original array. So {1, 0, 0, 1}
     becomes {0 ,0, 1, 1}. In case when inputs are not integers, you must output the  "input error" message.
     You may modify and return the given array or make a new array. The input size <= 100.
     */
    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);
        String arryStr=src.nextLine();
        String arryStrTrim=arryStr.trim();
        System.out.println(zeroFront(arryStrTrim));
    }
    public static String zeroFront(String str){
        String[] strArray = str.split(" ");
        String inputError="input error";
        String output="";
        // converting into int array
        int[] arrInt= new int[strArray.length];
        //integer check
        for (int i=0;i<strArray.length;i++){
            if (isInteger(strArray[i])){
                int digit=Integer.parseInt(strArray[i]);
                arrInt[i]=digit;
            }else{
                return inputError;
            }
        }
        Arrays.sort(arrInt);
        for(int i: arrInt){
            output+= i+" ";
        }
        return output;

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
