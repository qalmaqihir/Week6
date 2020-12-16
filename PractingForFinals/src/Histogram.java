public class Histogram {
    /*
    histogram([1, 3, 4], "#") ➞ "#\n###\n####"
    #
    ###
    ####

histogram([6, 2, 15, 3], "=") ➞ "======\n==\n===============\n==="

======
==
===============
===

histogram([1, 10], "+") ➞ "+\n++++++++++"

+
++++++++++
     */
    public static void main(String[] args) {
        int[] arr1={1,3,4};

        System.out.println(histogram(arr1,"#"));
        int[] arr2={1,10};
        System.out.println(histogram(arr2,"+"));
        int[] arr3={2,4,5,6};
        System.out.println(histogram(arr3,"o"));
    }
    public static String histogram(int[] arr, String symbol){
        String output="";

        for(int i=0; i<arr.length;i++){
            for (int j = 1; j <=arr[i] ; j++) {
                output+=symbol;
                //System.out.printf(symbol);
            }
            //System.out.println("");
            output+="\n";
        }
        return output;
    }
}
