import java.util.Arrays;
import java.util.Scanner;

public class BinaryAddition {
    private static int[] binary1;
    private static int[] binary2;

    public static void main(String[] args) {
        input();
        System.out.println(Arrays.toString(binary1));
        System.out.println(Arrays.toString(binary2));
    }

    private static void input() {
        Scanner console= new Scanner(System.in);
        System.out.println("Enter first Binary No: ");
        String given1=console.nextLine();
        String trimed=given1.trim();
        String[] arrGiven1=trimed.split(" ");
        System.out.println("Enter first Binary No: ");
        String given2=console.nextLine();
        String trimed2=given2.trim();
        String[] arrGiven2=trimed2.split(" ");
        checkinBinary(arrGiven1,arrGiven2);
    }

    private static void checkinBinary(String[] arrGiven1, String[] arrGiven2) {

        for (int i = 0; i <arrGiven1.length ; i++) {
            if(isInteger(arrGiven1[i])){
                binary1[i]=Integer.parseInt(arrGiven1[i]);

            }else{
                System.out.println("Inout error");
            }
        }
        for (int i = 0; i <arrGiven2.length ; i++) {
            if(isInteger(arrGiven1[i])){
                binary2[i]=Integer.parseInt(arrGiven2[i]);
            }else{
                System.out.println("Inout error");
            }
        }
    }
    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        }
        catch(NullPointerException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }
}
