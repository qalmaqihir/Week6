import java.util.Scanner;

public class TripPlanner {
    public static void main(String [] args) {
        // Part 1: Greeting
        // greeting();

        // Part 2: Travel Time and Budget
        // travelTimeBudget();

        // Part 3: Time difference
        // timeDifference();

        // Part 4: Country Area
        countryArea();
    }

    public static void greeting(){
        // write your code here

    }

    private static void travelTimeBudget(){
        // write your code here

    }

    public static void timeDifference(){
        // write your code here
    }

    public static void countryArea(){
        // write your code here
        /** None -> None
         Ask the user the area of their travel destination country in km2.
         Then you’ll want to convert that to miles2 and report those results back to the user.
         */
        System.out.println("What is square area of your destination country in km2? ");
        Scanner src=new Scanner(System.in);
        double areaInKm= src.nextDouble();
        double areaInMiles= areaInKm*0.386102154245;
        double areaInMilesh= areaInMiles*100;
        int areaInMlesi=(int) areaInMilesh;
        double areaInMilesr= areaInMlesi/100.0;
        System.out.printf("In miles2 is %.2f\n",areaInMilesr);
        System.out.println("***********\n\n'");

    }
}