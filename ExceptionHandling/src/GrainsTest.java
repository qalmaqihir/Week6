import java.math.BigInteger;
import java.util.Arrays;

public class GrainsTest {
    public static void main(String[] args) {
        //representing chess as double array
        //int[][] chess=new int[8][8];
        //Using simple arrya

        BigInteger[] chessArray= new BigInteger[32];
        chessArray[0]= BigInteger.valueOf(1);chessArray[1]= BigInteger.valueOf(2);
        for(int i=2;i<chessArray.length;i++){
            chessArray[i]=(chessArray[i-1]).multiply(chessArray[i-1]);
        }
        System.out.println(Arrays.toString(chessArray));
    }
}
