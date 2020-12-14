import java.util.Arrays;

public class perfectSquarePatch {
    /*
    Create a function that takes an integer and outputs an n x nsquare solely consisting of the integer n.

        Examples
        squarePatch(3) ➞ [
          [3, 3, 3],
          [3, 3, 3],
          [3, 3, 3]
        ]

        squarePatch(5) ➞ [
          [5, 5, 5, 5, 5],
          [5, 5, 5, 5, 5],
          [5, 5, 5, 5, 5],
          [5, 5, 5, 5, 5],
          [5, 5, 5, 5, 5]
        ]

        squarePatch(1) ➞ [
          [1]
        ]

        squarePatch(0) ➞ []
     */

    public static void main(String[] args) {
//        squarePatch(3);
        System.out.println("Checking for squarePatch(3) ");
        System.out.println(squarePatch(3));
        System.out.println("Checking for squarePatch(5) ");
        System.out.println(squarePatch(5));
        System.out.println("Checking for squarePatch(1) ");
        System.out.println(squarePatch(1));
        System.out.println("Checking for squarePatch(0) ");
        System.out.println(squarePatch(0));
    }

    private static int[][] squarePatch(int n) {
        int[][] output=new int[n][n];
        if(n==0){
            int[][] emptyArray={{}};
            return emptyArray;
        }else{
            for (int i = 0; i < n; i++) {
                int[] newarr= new int[n];
                for (int j = 0; j < n; j++) {
                    newarr[j]=n;
                }
                output[i]=newarr;
            }
            System.out.println(Arrays.deepToString(output));
            return output;
        }
    }
}
