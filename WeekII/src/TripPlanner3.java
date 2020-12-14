import java.util.Scanner;

public class TripPlanner3 {
    public static void main(String [] args) {
        // Part 1: Greeting
        //greeting();

        // Part 2: Travel Time and Budget
        // travelTimeBudget();

        // Part 3: Time difference
         timeDifference();

        // Part 4: Country Area
        // countryArea();
    }

    public static void greeting(){
        //write your coder here

    }

    private static void travelTimeBudget(){
        // write your code here

    }

    public static void timeDifference(){
        // write your code here
        Scanner src= new Scanner(System.in);
        System.out.println(" \'What is the difference, in hours, between your home and your destination? ");
        int difference= src.nextInt();
        if (difference <12){
            if (difference> 0){
                System.out.println("That means that when it is midnight at home it will be "+difference+":00 in your destination and when it's noon at home it will be "+(difference+12) +":00 \n***********");
                System.out.println("\n\n'");
            }
            else{
                System.out.printf("That means that when it is midnight at home it will be "+(24+difference) +":00 in your destination and when it's noon at home it will be "+ (12+difference)+":00 \n***********");
                System.out.println("\n\n'");

            }
        }
        else
        {
            System.out.println("That means that when it is midnight at home it will be "+ (difference+12)+":00 in your destination and when it's noon at home it will be "+(difference%24)+":00 \n***********");
            System.out.println("\n\n'");
        }
    }



    public static void countryArea(){
        // write your code here
    }
}
