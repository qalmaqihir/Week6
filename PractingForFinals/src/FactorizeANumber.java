import java.util.Arrays;

public class FactorizeANumber {
    /*
    Create a function that takes a number as its argument and returns an array of all its factors.
        Examples
        factorize(12) ➞ [1, 2, 3, 4, 6, 12]
        factorize(4) ➞ [1, 2, 4]
        factorize(17) ➞ [1, 17]
     */
    public static void main(String[] args) {
        factorize(60);
        //factorize(17);

    }
    public static int[] factorize(int number){
        int[] allFactors=new int[number/2];
        int index=0;
        for(int i =1; i<=number;i++){
            if(number%i==0){
                allFactors[index]=i;
                index++;
            }
        }
        int indexOfZero=findIndexOfZero(allFactors);
        int[] newArray=Arrays.copyOf(allFactors,indexOfZero);
        System.out.println(Arrays.toString(allFactors));
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }
    public static int findIndexOfZero(int[] arr){
        int len=arr.length;
        int k=0;
        while(k!=len){
            if(arr[k]==0){
                return k;
            }else{
                k++;
            }
        }
        return -1;
    }

}
