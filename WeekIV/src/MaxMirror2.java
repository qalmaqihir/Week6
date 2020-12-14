import java.util.Arrays;
import java.util.Scanner;

public class MaxMirror2 {
    /*
    We'll say that a "mirror" section in an array is a group of contiguous elements such that
     somewhere in the array, the same group appears in reverse order.
      For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part).
      Implement a Java static method maxMirror() that returns the size of the largest mirror section
      found in the given array. The inputs size <= 100.

maxMirror ( [ 1, 2, 3, 8, 9, 3, 2, 1] ) → 3
maxMirror ( [ 7, 1, 2, 9, 7, 2, 1 ] ) → 2
     */
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String given=src.nextLine();
        String trimed= given.trim();
//        System.out.println(trimed);
        String[] strArray=trimed.split(" ");
        String array="";
        for (String s: strArray) {
            if(!isInteger(s)){
                System.out.println("input error");
            }else{
                array+=s;
            }
        }
        System.out.println(maxMirror(strArray));
//            System.out.println(Arrays.toString(strArray));
//            System.out.println(array);

    }
    public static int maxMirror(String[] strArray){
        int total=1;
        for (int i = 0; i <strArray.length ; i++) {
            int n=1;
            String compare=strArray[i];
            while (n<strArray.length){
                if (compare.equals(strArray[n])){
                    //System.out.println(compare);
                    System.out.println("Found "+strArray[i]);
                    strArray[i]="x";
                    System.out.println("Next to compare "+strArray[strArray.length-(strArray.length-n)-1]);
                    n++;
                    total+=1;

                }else{
                    n++;
                }
                compare=strArray[strArray.length-(strArray.length-i)-1];

                n++;

            }
            System.out.println(Arrays.deepToString(strArray));
        }

        return total;
    }

    public static boolean isInteger(String s) {
        try {
//            Integer.parseInt(s);
            Integer.parseUnsignedInt(s);
        } catch(NumberFormatException e) {
            return false;
        } catch(NullPointerException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }

}

