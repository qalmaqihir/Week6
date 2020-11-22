import java.util.Scanner;


public class Calculator {
    private static int number1;
    private static String symbol;
    private static int number2;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String inputs=console.nextLine().trim();

        String[] input=inputs.split(" ");
        number1= Integer.parseInt(input[0]);
        symbol= input[1];
        number2= Integer.parseInt(input[2]);
        checkSybmol(symbol);
    }
    public static void checkSybmol(String symbol){
        switch (symbol) {
            case "+":
                System.out.println(addition(number1, number2));
                break;
            case "-":
                System.out.println(subtraction(number1, number2));
                break;
            case "*":
                System.out.println(multiplication(number1, number2));
                break;
            case "/":
                if (number2 == 0) {
                    System.out.println("Error");
                } else {
                    System.out.println(division(number1, number2));
                }
            case "%":
                if (number2 == 0) {
                    System.out.println("Error");
                } else {
                    System.out.println(div(number1, number2));
                }

        }
    }

    private static int div(int number1, int number2) {
        return number1%number2;
    }
    private static int addition(int number1, int number2) {
        // add your code here
        return number1+number2;
    }

    private static int subtraction(int number1, int number2) {
        // add your code here
        return number1-number2;
    }

    private static int multiplication(int number1, int number2) {
        // add your code here
        return number1*number2;
    }

    private static int division(int dividend, int divisor) {
        // add your code here
        return dividend/divisor;

    }
}
