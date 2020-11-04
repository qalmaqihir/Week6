import java.util.Arrays;
import java.util.Scanner;

public class ShiftRight {
    private static int n;
    private static int[] number;
    public static void main(String[] args) {
        input();
        System.out.println(shiftRight(number,n));;
    }

    public static void input(){
        Scanner input=new Scanner(System.in);
        String numberStr="";
        int i=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your numbers, press return to end.");
        while(scanner.hasNextLine()){
            String s=scanner.nextLine();
            if(!s.isEmpty() && isInteger(s)){
                numberStr+=" "+s.strip();
                i++;
            }else if (!s.isEmpty() && !isInteger(s)){
                System.out.println("Not a legal number. Try again!");
            }else{
                break;
            }
        }

        String[] numberStr2= numberStr.strip().split(" ");
        number=new int[numberStr2.length];
        for (int j = 0; j <number.length ; j++) {
            number[j]=Integer.parseInt(numberStr2[j]);
        }
        System.out.println("Enter N: ");
        n=input.nextInt();
    }

    private static String shiftRight(int[] number, int n) {
        String sorted="";
        int[] shifted= new int[number.length];
        int i=0;
        int k=0;
        int shift=i+n;

        while(shift<=number.length-1){
            shifted[shift]=number[i];
            shift+=1;
            i++;
        }
        while(shift>number.length-n){
            shifted[k]=number[number.length-n+k];
            k++;
            shift--;
        }

        for (int j = 0; j <shifted.length ; j++) {
            if(j==shifted.length-1){
                sorted+=Integer.toString(shifted[j])+" ";
            }else{
                sorted+=Integer.toString(shifted[j])+", ";
            }
        }
        return sorted;

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
