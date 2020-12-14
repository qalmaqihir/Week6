import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {
    private static double[] arryOfDoubles;
    public static void main(String[] args) {
        /*
        Given the size of an array of doubles as N, get all numbers from the user.
         Afterward, find and output the second largest element from the array,
         */
        input();

        System.out.println(secondSmallest(arryOfDoubles));

    }

    private static double secondSmallest(double[] arryOfDoubles) {
        double[] withoutMin= new double[arryOfDoubles.length];
        double min1=arryOfDoubles[0];

        for(double n: arryOfDoubles){
            if(min1>n){
                min1=n;
            }
        }
        int n=0;

        for (int i = 0; i <arryOfDoubles.length; i++) {
            if(arryOfDoubles[i]==min1){
//                continue;
                withoutMin[i]=10000.0;
            }
            else{
                withoutMin[i]=arryOfDoubles[i];
            }
        }
//        System.out.println("Array without the min1");
//        System.out.println(Arrays.toString(withoutMin));
//        System.out.println("Arry with min included ");
//        System.out.println(Arrays.toString(arryOfDoubles));
        double min2=withoutMin[0];
        for(double m: withoutMin){
            if(min2>m){
                min2=m;
            }
        }
//        System.out.printf("First min = %.3f and second min %.3f%n",min1,min2);
        return min2;
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
//       System.out.println(Arrays.toString(arryOfDoubles));
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



