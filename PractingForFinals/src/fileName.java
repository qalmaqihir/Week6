import java.util.Arrays;
import java.util.Scanner;

public class fileName {
    public static void main(String[] args) {
        System.out.println("Enter your file path: ");
        Scanner input = new Scanner(System.in);
        String pathName = input.nextLine();
        //getFileName(pathName);
        System.out.println(getFileName(pathName));
    }

    private static String getFileName(String pathName) {
        String[] splitedPathName= pathName.strip().split("/");
        System.out.println(Arrays.toString(splitedPathName));
        return "\""+splitedPathName[splitedPathName.length-1]+"\"";
    }
}
