import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        String binary = input.nextLine();
        System.out.println("Enter second binary number: ");
        String binary1 = input.next();

        String[] strr= binary.split(" ");
        String[] strr1= binary1.split(" ");
        int decimal1 =binaryToDecimal(strr);
        int decimal2=binaryToDecimal(strr1);
        System.out.println(binaryAddition(decimal1,decimal2));

    }

    private static String binaryAddition(int decimal, int decimal2) {
        int sumofDecimals= decimal+decimal2;
        String bianry= Integer.toBinaryString(sumofDecimals);
        return bianry;
    }

    private static int binaryToDecimal(String[] n) {
        int decimal=0;
        int power =n.length-1;
        for (int i=0; i<n.length;i++){
            int digit=Integer.parseInt(n[i]);
            //System.out.printf("The value of digit is %d\n",digit);
            decimal+= digit* Math.pow(2,power);
            //System.out.printf("The value of deciaml at index %d is %d\n",i,decimal);
            power--;
        }
        return decimal;
    }
}

