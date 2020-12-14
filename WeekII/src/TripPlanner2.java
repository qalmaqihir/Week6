import java.util.Scanner;

public class TripPlanner2 {
    public static void main(String [] args) {
        // Part 1: Greeting
        //greeting();

        // Part 2: Travel Time and Budget
        travelTimeBudget();

        // Part 3: Time difference
        // timeDifference();

        // Part 4: Country Area
        // countryArea();
    }

    public static void greeting(){
        // write your code here

    }

    private static void travelTimeBudget(){
        // write your code here
        System.out.println("\"How many days are you going to spend traveling? ");
        Scanner src=new Scanner(System.in);
        int days = src.nextInt();
        System.out.println("How much money, in USD, are you planning to spend on your trip: ");
        double money= src.nextInt();
        System.out.println("What is the three letter currency symbol for your travel destination? ");
        String sYmbol= src.next();
        System.out.printf("How many %s are there in 1 USD? \n",sYmbol);
        double convert= src.nextFloat();
        //System.out.println(" ");
        int hr= days*24;
        int mins= hr*60;
        int secs= mins*60;
        double moneyPerDay =  money/days;
        //Conversion and auto casting
        double moneyPerDayh=  moneyPerDay*100;
        int moneyPerDayi=(int)moneyPerDayh;
        double moneyPerDayr = moneyPerDayi/100.0;
        //Conversion and auto casting
        double totalmoney= money*convert;
        double perDayERU= totalmoney/days;
        double perDayERUh= perDayERU*100;
        int perDayERUi= (int) perDayERUh;
        double perDayERUr = perDayERUi/100.0;
        System.out.println("If you are traveling for "+days+" days that is same as "+hr+" hours or "+mins+" minutes or "+secs+" seconds.");
        System.out.println("If you are going to spend $"+(int)money+" USD that means per day you can spend up to $"+moneyPerDayr+" USD");
        System.out.printf("Your total budget in %s is %.1f %s, which per day is %.2f %s\n***********",sYmbol,totalmoney,sYmbol,perDayERUr, sYmbol);
    }

    public static void timeDifference(){
        // write your code here
    }

    public static void countryArea(){
        // write your code here
    }
}

