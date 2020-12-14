import java.security.SecureRandom;
import java.util.Arrays;

public class Arrya{
    public static void main(String[] args) {
//        //declaring the arrays
//        //int [] c;
//        // c= new int[12];
//        int[] c= new int[12];
//        c[9]=323;
//        c[8]=33;
//        c[7]=32;
//        c[6]=23;
//        c[5]=3230;
//
//        int[] a,b,c;// all are arrays of type int
//        int d[],e,f;// just d is an array of int...
//
//        System.out.println(Arrays.toString(c));
//        //Instead of assigning items to each index, we can use the below syntax for our comfort...
//        int[] n= {12,2,4,5,7,55,43};
//        System.out.println(Arrays.toString(n));
//        // a good practice to use an arrylength and update it as we need...
//        final int ARRAY_LENGTH= 20;
//        int[] namedArray= new int[ARRAY_LENGTH];
//        System.out.println(Arrays.toString(namedArray));
//        int [] nn= new int[12];
//        nn[0]=12;
//        nn[3]=-33;
//        System.out.println(Arrays.toString(nn));
//        int[] array= new int[10];
//        System.out.printf("%s%8s%n ", "Index", "Value");
//        for (int i = 0; i <array.length ; i++) {
//            System.out.printf("%d%8d%n",i, array[i]);
//        }
//        int[] m={3,4,5,6,7,8,9};
//        System.out.println(Arrays.toString(m));
//        final int ARRAY_LENGTH=10;
//        int total=0;
//        int[] array_fixed= new int[ARRAY_LENGTH];
//        for (int i = 0; i <ARRAY_LENGTH; i++) {
//            array_fixed[i]=2+2*i;
//        }
//        System.out.printf("%s%8s%n ", "Index", "Value");
//        for (int i = 0; i <array_fixed.length ; i++) {
//            System.out.printf("%d%8d%n",i, array_fixed[i]);
//        }
//        System.out.println("The sum of the above array is: ");
//        for (int i = 0; i <array_fixed.length ; i++) {
//            total+=array_fixed[i];
//        }
//        System.out.println(total);
//
//        int[] array={4,0,0,2,0,5,1,0,0,3};
//        System.out.println("Grade distribution: ");
//        for (int i = 0; i < array.length ; i++) {
//            if(i==10){
//                System.out.printf("%5d: %n",100);
//            }
//            else{
//                System.out.printf(" %02d-%02d: ",i*10,i*10+9);
//
//            }
//            for (int star = 0; star < array[i] ; star++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        SecureRandom rndm= new SecureRandom();
        int[] frequency=new int[7];
        for (int i = 0; i < 60_000; i++) {
            ++frequency[1+rndm.nextInt(6)];
        }
        //Using for in loop

        for(int value:frequency){
            System.out.println(value);
        }
        System.out.printf("%s%10s%n", "Face", "Frequency");
        for (int i = 0; i < frequency.length; i++) {
            System.out.printf("%4d%10d%n",i, frequency[i]);
        }



    }

}
