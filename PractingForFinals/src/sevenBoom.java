public class sevenBoom {
    /*
    Create a function that takes an array of numbers and return "Boom!"if the number 7 appears in the array.
    Otherwise, return "there is no 7 in the array".

        Examples
        sevenBoom([1, 2, 3, 4, 5, 6, 7]) ➞ "Boom!"
        // 7 contains the number seven.

        sevenBoom([8, 6, 33, 100]) ➞ "there is no 7 in the array"
        // None of the items contain 7 within them.

        sevenBoom([2, 55, 60, 97, 86]) ➞ "Boom!"
        // 97 contains the number seven.
     */
    public static void main(String[] args) {
        int[] arr1={1, 2, 3, 4, 5, 6, 7};
        int[] arr2={8, 6, 33, 100};
        int[] arr3={2, 55, 60, 97, 86};
       // sevenBoom(arr1);
        System.out.println("Checking for sevenBoom([1, 2, 3, 4, 5, 6, 7])");
        System.out.println(sevenBoom(arr1));
        System.out.println("Checking for sevenBoom([8, 6, 33, 100])");
        System.out.println(sevenBoom(arr2));
        System.out.println("Checking for sevenBoom([2, 55, 60, 97, 86])");
        System.out.println(sevenBoom(arr3));


    }
    public static String sevenBoom(int[] arr){
        String out="";
        boolean flag=true;
        int index=0;
        while (flag&&index!=arr.length){
            if(arr[index]==7||arr[index]%7==0){
                flag=false;

            }else{
                index++;
            }
        }
        if(!flag){
            out+="Boom";
        }else{
            out+="there is no 7 in the array";
        }
        return out;
//        for (int number:arr ) {
//            if(number==7){
//                out+= "Boom!";
//            }else{
//                out+= "there is no 7 in the array";
//            }
//        }

    }
}
