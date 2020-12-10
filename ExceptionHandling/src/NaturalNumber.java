import java.util.Arrays;

public class NaturalNumber {
    public static void main(String[] args) {

        checkNumber(6);
        checkNumber(24);
        checkNumber(8);
    }
    public static void checkNumber(int num){
        int[] arrayNum=new int[num];

        int k=1;
        int j=0;
        for(int i=1;i<num;i++){
            if(num%k==0){
                arrayNum[j]=k;
                k++;
                j++;
            }else{
                k++;
            }
        }
        int sum=0;
        for (int n:arrayNum) {
            sum+=n;
        }
        if(sum==num){
            System.out.printf("%d is a perfect number\n",num);
        }else if(sum>num){
            System.out.printf("%d is a Abundant number\n",num);;
        }else{
            System.out.printf("%d is a Deficient number\n",num);
        }
        System.out.println(Arrays.toString(arrayNum));
    }
}
