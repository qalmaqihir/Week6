import java.io.*;
import java.util.*;
class MatrixMultiplication{

    public static void main(String[] args)  {

        int array[][] = new int[3][3];
        int array1[][] =new int[3][3];
        int array2[][] = new int[3][3];

        Scanner scan=new Scanner(System.in);

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j <3; j++) {
                System.out.println("Matrix 1st ["+i+"]["+j+"]:");
                array[i][j]=scan.nextInt();
            }
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.println("Matrix 2nd ["+i+"]["+j+"]:");
                array1[i][j]=scan.nextInt();
            }
        }

        //write your logic here
        int loop=0;
        for (int i = 0; i <array1.length ; i++) {
            System.out.println(Arrays.toString(array[i]));
            System.out.println(Arrays.toString(array1[i]));
            for (int j = 0; j <array[i].length ; j++) {
//                System.out.println(array[i][j]);
//                System.out.println(array1[i][j]);
                array2[i][j]+=array[i][j]*array1[j][i];
            }
            loop++;
        }

        //end


        System.out.println("Multiply of both matrix:");

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(array2[i][j]+" ");
            }
            System.out.println();
        }

    }

}

