
import java.util.Arrays;
import java.util.Scanner;

public class BalancedArray {
    private static String givenArray;
    public static void main(String[] args) {
        input();
//        balanced(givenArray);
        String checkInput="";
        String[] arrayStr1= givenArray.trim().split(" ");
        for (String s:arrayStr1) {
            checkInput+=s;
        }

        if(isInteger(checkInput)){
            balanced(arrayStr1);
        }else{
            System.out.println("Error");
        }
//        System.out.println(Arrays.toString(arrayStr1));

    }

    private static void balanced(String[] a) {

        int[] numberArray=new int[a.length];
        for (int i = 0; i < a.length ; i++) {
            numberArray[i]=Integer.parseInt(a[i]);
        }
        int total=0;
        for (int n:numberArray ) {
            total+=n;
        }
        if(total%2==0){
            System.out.println("Can be balanced");
        }else{
            System.out.println("Can not be balanced");

        }
//        System.out.println(Arrays.toString(numberArray));
    }

    public static void input(){
        Scanner src= new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        givenArray= src.nextLine();
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
