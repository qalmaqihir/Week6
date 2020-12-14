import org.w3c.dom.ls.LSOutput;

import java.math.BigInteger;
import java.util.Arrays;

public class GrainsTest {
    public static void main(String[] args) {
        //representing chess as double array

        validateSquare(12);
        //grainsOnSquare(4);

    }
    public static void grainsOnSquare(int n){
        //BigInteger square=BigInteger.valueOf(0);
        BigInteger square=new BigInteger("0");

        BigInteger[] chessArray= new BigInteger[n];
        chessArray[0]= BigInteger.valueOf(1);chessArray[1]= BigInteger.valueOf(2);
        for(int i=2;i<chessArray.length;i++){
            chessArray[i]=(chessArray[i-1]).multiply(chessArray[i-1]);
        }
        System.out.println(Arrays.toString(chessArray));
        for(int i=0;i<n;i++){
            square=square.add(chessArray[i]);
        }
        System.out.println(square);
    }


    public static void validateSquare(int n) throws ArithmeticException{
        if (n > 0 && n < 65) {
            grainsOnSquare(n);
        } else {
            System.err.println("Square out of Chesss Board");
        }
    }
}
