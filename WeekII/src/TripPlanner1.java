import java.util.Scanner;

public class TripPlanner1 {
    public static void main(String [] args) {
        // Part 1: Greeting
        greeting();

        // Part 2: Travel Time and Budget
        // travelTimeBudget();

        // Part 3: Time difference
        // timeDifference();

        // Part 4: Country Area
        // countryArea();
    }

    public static void greeting(){
        /** None -> None
         First you’ll want to greet your user and ask them their name.
         Once you have their name use it to greet your user, and then ask them
         where they would like to go. Finally tell you user their destination
         sounds like a great trip! All the code to accomplish Part 1 should be
         in its own method.
         */
        // write your code here
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name:");
        Scanner src= new Scanner(System.in);
        String name= src.nextLine();
        System.out.printf("Nice to meet you %s, where are you travelling to?",name);
        String destination= src.nextLine();
        System.out.printf("Great! %s City sounds like a great trip\n***********",destination);

    }

    private static void travelTimeBudget(){
        // write your code here

    }

    public static void timeDifference(){
        // write your code here
    }

    public static void countryArea(){
        // write your code here
    }
}
