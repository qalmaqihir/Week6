import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    private static double[] arryOfDoubles;
    public static void main(String[] args) {
        /*
        Given the size of an array of doubles as N, get all numbers from the user.
         Afterward, find and output the second largest element from the array,
         */
        input();

        System.out.println(secondLargestd(arryOfDoubles));

        }

    private static double secondLargestd(double[] arryOfDoubles) {
        double[] withoutMax= new double[arryOfDoubles.length];
        double max1=arryOfDoubles[0];
        double max2=withoutMax[0];

        for(double n: arryOfDoubles){
            if(max1<n){
                max1=n;
            }
        }int n=0;
//        for (int i = 0; i <arryOfDoubles.length ; i++)
//            if(max2!=max1){
//                if(max2<arryOfDoubles[i]){
//                    max2=arryOfDoubles[i];
//                }
//        }
        for (int i = 0; i <arryOfDoubles.length; i++) {
            if(arryOfDoubles[i]==max1){
                continue;
            }
            else{
                withoutMax[i]=arryOfDoubles[i];
            }
        }
//        System.out.println("Array without the max1");
//        System.out.println(Arrays.toString(withoutMax));
//        System.out.println("Arry with max included ");
//        System.out.println(Arrays.toString(arryOfDoubles));
        for(double m: withoutMax){
            if(max2<m){
                max2=m;
            }
        }
        return max2;
    }

    //Getting input
    private static void input() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter N: ");

        int lenghtOfArray = console.nextInt();
        arryOfDoubles=new double[lenghtOfArray];
        for (int i = 0; i < arryOfDoubles.length ; i++) {
            String item=console.next();
            if(isInteger(item)){
                arryOfDoubles[i] = Double.parseDouble(item);
            }
            else{
                System.out.println("input error");
            }

        }
//        System.out.println(Arrays.toString(arryOfDoubles));
    }

    //Checking input (if double proceed, else not
    public static boolean isInteger(String s) {
        boolean itIs=true;
            try {
                Double.parseDouble(s);
            } catch(NumberFormatException e) {
                return false;
            } catch(NullPointerException e) {
                return false;
            }
            // only got here if we didn't return false
            return true;
    }
}



