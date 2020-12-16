import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};

        System.out.println(sum(arr1));

    }
    public static int sum(int[] arr){
        if(arr.length==0){
            return 0;
        }else if(arr.length==1){
            return arr[0];
        }else{
            return arr[arr.length-1] + sum(Arrays.copyOf(arr,arr.length-1));
        }
    }
}
