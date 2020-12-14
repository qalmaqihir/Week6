import java.util.Scanner;

public class HelloOrBye {
    public static void main(String[] args) {
        /*
        Ask a user to enter a letter. If the entered letter is in the text ‘Hello World!’,
        then your program must print out “Hello”, otherwise ‘Bye’.
         */
        System.out.println("A user enters any single letter. ");
        String check= "Hello World!";
        Scanner scr=new Scanner(System.in);
        char letter = scr.next().charAt(0);
        int i=0;
        boolean found=false;
        while (i<=(check.length()-1) && !found){
            if (check.toLowerCase().charAt(i)==letter || check.charAt(i)==letter || check.toUpperCase().charAt(i)==letter){
                found=true;
                System.out.println("hello");
                break;
            }
            else{
                i++;
                if(i==(check.length())){
                    System.out.println("Bye");
                    break;
                }

            }
        }
//        for (int i=0; i<check.length();i++){
//            if (check.toLowerCase().charAt(i)==letter || check.charAt(i)==letter){
//                System.out.println("Hello");
//            }else{
//                System.out.println("Bye");
//            }
//        }
    }
}
