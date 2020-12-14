import java.util.Arrays;

public class ArrOfMultiples {
    /*
    Create a function that takes two numbers as arguments (num, length) and returns an array of multiples of num until the array length reaches length.

        Examples
        arrayOfMultiples(7, 5) ➞ [7, 14, 21, 28, 35]

        arrayOfMultiples(12, 10) ➞ [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]

        arrayOfMultiples(17, 6) ➞ [17, 34, 51, 68, 85, 102]
     */
    public static void main(String[] args) {

//        System.out.println("Checking for arrayOfMultiples(7, 5)");
//        System.out.println(arrayOfMultiples(7, 5));
//        System.out.println("Checking for arrayOfMultiples(12, 10)");
//        System.out.println(arrayOfMultiples(12, 10));
//        System.out.println("Checking for arrayOfMultiples(17, 6)");
        System.out.println(arrayOfMultiples(17, 6));
        //arrayOfMultiples(17, 6);
    }

    private static int[] arrayOfMultiples(int num, int length) {
        int[] arr=new int[length];
        int mult=1;
        for (int i = 0; i <length ; i++) {
            arr[i]=num*mult;
            mult++;
        }
        //System.out.println(Arrays.toString(arr));
        return arr;
    }
}
