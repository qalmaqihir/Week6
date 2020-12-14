import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    private static String[] strArray;
    private static double[] toCompare;
    /*
    Given the size of an array of doubles as N, get all numbers from the user.
    Afterward, find and output the second largest element from the array,
     */
    public static void main(String[] args) {
        input();
        if(!isInteger(strArray)){
            System.out.println("input error");

        }else{
            System.out.println(secondLargest(strArray));
        }

    }
    public static double secondLargest(String[] check){
//        System.out.println(Arrays.deepToString(check));
        toCompare=new double[check.length];
        // Array without the first max number.
        double[] nextMaxCompare= new double[toCompare.length];
        for (int i = 0; i <check.length ; i++) {
            toCompare[i]=Math.abs(Double.parseDouble(check[i]));
        }
        double maxNo = toCompare[0];
        double maxNo2=nextMaxCompare[0];
        for (int i = 1; i < toCompare.length ; i++) {
            if(maxNo<toCompare[i]){
                maxNo=toCompare[i];
//                System.out.printf("Current value is %f To compare next is %f%n",maxNo,toCompare[i]);
            }
        }
        for (int i = 0; i < toCompare.length; i++) {
            if(toCompare[i]!=maxNo){
                nextMaxCompare[i]=toCompare[i];
            }
        }
        for (int i = 1; i < nextMaxCompare.length ; i++) {
            if(maxNo2<nextMaxCompare[i]){
                maxNo2=nextMaxCompare[i];
//                System.out.printf("Current value is %f  in next-to-comapre, To compare next is %f%n",maxNo2,nextMaxCompare[i]);
            }
        }

//        System.out.println(Arrays.toString(nextMaxCompare));
//        System.out.println(Arrays.toString(toCompare));
        return maxNo2;
    }

    private static void input() {
        Scanner console= new Scanner(System.in);
        int sizeOfArray= console.nextInt();
        double[] ourArray=new double[sizeOfArray];
        for (int i = 0; i <sizeOfArray ; i++) {
            String inputNo= console.next();
            if(isInteger(inputNo)){

            }

        }
//        String input=console.nextLine();
//        String trimed=input.trim();
//        strArray=trimed.split(" ");
    }
    public static boolean isInteger(String[] s) {
        boolean itIs=true;
        for (String i : s){
            try {
                Double.parseDouble(i);
            } catch(NumberFormatException e) {
                itIs=false;
            } catch(NullPointerException e) {
                itIs=false;
            }
            // only got here if we didn't return false
            return itIs;
        }
        return itIs;
    }
}

