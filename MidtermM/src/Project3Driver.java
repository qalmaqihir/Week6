import java.util.*;  // Importing Keyboard input.
// import java.util.concurrent.TimeUnit; // Importing TimeUnit conversion system.


/* DRIVER CLASS */
public class Project3Driver {

    public static void main(String[] args) {
        // Design Outline
        Scanner scan = new Scanner(System.in); // Initializing keyboard input called "scan" for the main method.
        // Main method

        // Get input values
        System.out.print("Enter your name: "); // Printing out asking user their name
        String name = scan.next(); 		 // Initializing String "name" and taking user input
        System.out.print("Enter 'A' for Addition, 'S' for Subtraction, 'M' for Multiplication, 'D' for Division: "); // Printing out asking user for type of math operation they want to perform
        String ops = scan.next();	 // Initializing String "ops" and taking user input for type of math problem they will be performing
        while(!ops.equals("A") && !ops.equals("S") && !ops.equals("M") && !ops.equals("D") && !ops.equals("a") && !ops.equals("s") && !ops.equals("m") && !ops.equals("d"))
        {
            System.out.println("Wrong Input!!!");
            System.out.print("Enter 'A' for Addition, 'S' for Subtraction, 'M' for Multiplication, 'D' for Division: "); // Printing out asking user for type of math operation they want to perform
            ops = scan.next();
        }
        String caseName = null;			 // Initializing a string as caseName to let user know what operation they undertook.
        System.out.print("Please tell me your highest number: "); // Asking user their highest number by printing out
        int maxRange =0 ;    //	Initializing integer maxRange for the highest digit user wants to use and taking user input
        while(true)
        {
            try
            {
                maxRange = Integer.parseInt(scan.next());	 //	Number of Problems the user wants to do by invoking getProbNum method in the session class.
            }
            catch(Exception ex)
            {
                System.out.print("The entry was not valid");
                continue;
            }
            if(maxRange<1)
            {
                System.out.print("The entry was not valid");
                continue;
            }
            break;
        }
        System.out.print("Please tell me your lowest number: "); // Asking user their lower number by printing out
        int minRange = 0  ; // Initializing integer maxRange for the lowest digit user wants to use and taking user input
        while(true)
        {
            try
            {
                minRange = Integer.parseInt(scan.next());	 //	Number of Problems the user wants to do by invoking getProbNum method in the session class.
            }
            catch(Exception ex)
            {
                System.out.print("The entry was not valid");
                continue;
            }
            if(minRange<1)
            {
                System.out.print("The entry was not valid");
                continue;
            }
            break;
        }
        System.out.print("Please tell me the number of problems you want to do: "); // Asking user by printing out
        int numProblem = 0;
        while(true)
        {
            try
            {
                numProblem = Integer.parseInt(scan.next());	 //	Number of Problems the user wants to do by invoking getProbNum method in the session class.
            }
            catch(Exception ex)
            {
                System.out.print("The entry was not valid");
                continue;
            }
            if(numProblem<1)
            {
                System.out.print("The entry was not valid");
                continue;
            }
            break;
        }
        int sysAns = 0;					 // Initializing integer sysAns, which is the Answer the system will calculate
        int userAns = 0;				 // Initializing integer useAns, which is the Answer the user will input

        int[] list1 = new int[numProblem]; // Initializing list1 array to save values of random number 1
        int[] list2 = new int[numProblem]; // Initializing list2 array to save values of random number 2
        int[] listAns = new int[numProblem]; // Initializing listAns array to save value of number of problems
        String[] listResult = new String[numProblem]; // Initializing listResult array and saving the results of "Correct" and/or "Incorrect"
        int[] listSysAns = new int[numProblem]; // Initializing listSysAns array to save the system answers.
        int s = 0; // Initializing s to keep count of user's score in the main method.
        String[] mathOps = new String[numProblem]; // Initializing mathOps array to save the operator used for each questions.

        long startTime = System.currentTimeMillis();  // Starting time for the clock when the user starts the application.

        // For Loop to keep the application running for whatever number of executions needed that the user inputs for the numProblem.
        for (int i = 0; i < numProblem; i++) { //i is number of instances which will decrease till i becomes 0 and then the loop will not execute anymore.

            int rand1 = Problems.getRand1(maxRange, minRange); // initializing rand1 to get a random number from getRand1 method in Problems class
            int rand2 = Problems.getRand2(maxRange, minRange); // initializing rand2 to get a random number from getRand2 method in Problems class

            /* Operation cases (switch) for string ops. In the getOperation method, user will select what Operation they want
             * to do.
             */
            switch (ops.toUpperCase())
            {
                //  Addition: If user presses A for input, it will start case 'A', for Addition.
                case "A":{
                    caseName = "Addition"; // Case name Addition activated for the Session Summary. It is a permanent variable.
                    mathOps[i] = " + "; // Saving operator in mathOps at i location
                    Problems.Addition(rand1, rand2); // Sending information to the method for Addition
                    sysAns = Problems.sysAnsA(); // System calculates the Addition problem, but does not show to user.
                    break; // Stops the case here and does not let it flow to the next Case, as it will execute unwanted code.
                }

                //  Subtraction: If user presses S for input, it will start case 'S', for Subtraction.
                case "S": {
                    caseName = "Subtraction";	// Case name Subtraction activated for the Session Summary. It is a permanent variable.
                    mathOps[i] = " - "; // Saving operator in mathOps at i location
                    Problems.Subtraction(rand1, rand2); // Sending information to the method for Subtraction
                    sysAns = Problems.sysAnsS();	// System calculates the Subtraction problem, but does not show to user.
                    break; // Stops the case here and does not let it flow to the next Case, as it will execute unwanted code.
                }

                //  Multiplication: If user presses M for input, it will start case 'M', for Multiplication.
                case "M":{
                    caseName = "Multiplication"; // Case name Multiplication activated for the Session Summary. It is a permanent variable.
                    mathOps[i] = " * "; // Saving operator in mathOps at i location
                    Problems.Multiplication(rand1, rand2); // Sending information to the method for Multiplication
                    sysAns = Problems.sysAnsM(); // System calculates the multiplication problem, but does not show to user.
                    break; // Stops the case here and does not let it flow to the next Case, as it will execute unwanted code.
                }

                //  Division: If user presses D for input, it will start case 'D', for Division.
                case "D": {
                    caseName = "Division"; // Case name Division activated for the Session Summary. It is a permanent variable.
                    mathOps[i] = " / "; // Saving operator in mathOps at i location
                    Problems.Division(rand1, rand2); // Sending information to the method for Division
                    sysAns = Problems.sysAnsD(); // Calculates and sysAns for the user.
                    break; // Stops the case here and does not let it flow to the next Case, as it will execute unwanted code.
                }
            }

            listSysAns[i] = sysAns; // Saving value of sysAns to listSysAns in an array location
            list1[i] = rand1; // Saving value of rand1 to list1 array
            list2[i] = rand2; // Saving value of rand2 to list2 array
            userAns = 0; // Answer that the user inputs
            while(true)
            {
                try
                {
                    userAns = Integer.parseInt(scan.next());	 //	Number of Problems the user wants to do by invoking getProbNum method in the session class.
                }
                catch(Exception ex)
                {
                    System.out.print("The entry was not valid");
                    continue;
                }
                if(userAns<1)
                {
                    System.out.print("The entry was not valid");
                    continue;
                }
                break;
            }
            listAns[i] = userAns; // Saving user answer to listAns in one of the location

            session.getResult(userAns, sysAns, listResult, i, s); // Invoking getResult method in the session class to check if user is Correct or Incorrect. s is also sent with the latest value during the current loop
            s = session.getUserScore(); // s returns with the new userScore if the result was correct;
        }

        long endTime = System.currentTimeMillis(); // Program ending time counted in millisecond.
        session.sessionSummary(numProblem, s, endTime, startTime, name, caseName, list1, list2, mathOps, listSysAns, listAns, listResult); // Invoking sessionSummary method in session class by sending variable values
        scan.close(); // Closing the keyboard input for the main method.
    }

}