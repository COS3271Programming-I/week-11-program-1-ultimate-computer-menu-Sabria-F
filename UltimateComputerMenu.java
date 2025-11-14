import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UltimateComputerMenu {

    //Initiate a new scanner called userinput.
    static Scanner userinput = new Scanner(System.in);

    //Define the main method.
    public static void main(String[] args) {

        //This variable stores whether or not the user wants to continue using the super computer.
        String continueProgram = "y";
        //This variable helps us keep track of which method the user chose.
        int taskNum;

        //Formatting.
        System.out.println("\n");

        //Greet the user.
        System.out.println("Welcome to the Ultimate Computer.");

        //This loop will keep running as long as the user wants to continue using the computer.
        while (continueProgram.equalsIgnoreCase("y")){

            //Formatting.
            System.out.println("\n");

            //Display the list of methods so the user can choose which one they want.
            System.out.println("Here is the list of tasks that you can choose from:");
            System.out.println("1) Display Favorite Saying");
            System.out.println("2) Display Text Art");
            System.out.println("3) Calculator");
            System.out.println("4) Binary Calculator");
            System.out.println("5) Give Encouragement.");
            System.out.println("6) Roll Dice");
            System.out.println("7) Oppish Translator");
            System.out.println("8) Display Fibonacci Sequence");
            System.out.println("9) Calculate Double Factorial");

            //Formatting.
            System.out.println("\n");

            //Ask the user which method they want to run.
            taskNum = intTry("Enter the number that corresponds to the task you want to do --> ");

            //Formatting.
            System.out.println("\n");

            //Test if the user wants to run the first method.
            if(taskNum == 1){
                
                //Get the favorite saying and store it as a string called favSaying.
                String favSaying = getFavoriteSaying();

                //Display the saying.
                System.out.println("My favorite saying is:\n" + favSaying);

                //Formatting.
                System.out.println("\n");
            }

            //Test if the user wants run the second method.
            else if(taskNum == 2){

                //Get the text art and store it as a string called textArt.
                String textArt = getTextArt();

                //Display the text art.
                System.out.println(textArt);

                //formatting.
                System.out.println("\n");
            }

            //Test if the user wants to run the third method.
            else if(taskNum == 3){

                //Display a list of the functions that the calculator can perform.
                //This is so that the user can choose which function they want.
                System.out.println("""
                                   Here are the opperations you can perform:
                                   1) Addition (x + y)
                                   2) Multiplication (x * y)
                                   3) Exponentiation (x^y)
                                   4) Take the Logarithm (log y (x))""");
                
                //Formatting.
                System.out.println("\n");

                //Ask the user which funtion they want to execute.
                //Call the error trapping method for integers.
                int operation = intTry("Enter the number for the opperation you wish to perform --> ");
            
                //Prompt the user for the value for x.
                //Call the error trapping method for doubles.
                Double x = doubleTry("Enter a value for x --> ");
                
                //Prompt the user for the value for y.
                //Call the error trapping method.
                Double y = doubleTry("Enter a value for y --> ");

                //Formatting.
                System.out.println("\n");

                //Display the result with a format string in order to round it to two decimal places.
                System.out.format("The result is: %5.2f%n", useCalculator(operation, x, y));

                //Formatting.
                System.out.println("\n");
            }

            //Test if the user wants to run the fourth method.
            else if(taskNum == 4){

                //Display a list of functions that the binary calculator can perform.
                System.out.println("""
                        Here are the operations you can perform:
                        1) Addition (x + y)
                        2) Subtraction (x - y)
                        3) Multiplication (x * y)
                        4) Division (x / y)
                        """);
                
                //Formatting.
                System.out.println("\n");

                //Prompt the user to choose which function they want to execute.
                //Call error trapping method.
                int operation = intTry("Enter the number for the opperation you wish to perform --> ");

                //Prompt user for the value for x.
                //Call error trapping method.
                String x = stringTry("Enter a binary number for x --> ");

                //Prompt user for the value for y.
                //Call error trapping method.
                String y = stringTry("Enter a binary number for y --> ");

                //Formatting.
                System.out.println("\n");

                //Call the binary calculator function, and display the result.
                System.out.println("The result is: " + useBinaryCalculator(operation, x, y));

                //Formatting.
                System.out.println("\n");
            }

            //Test if the user wants to run the fifth method on the list.
            else if(taskNum == 5){
                
                //Prompt the user for their age.
                //Call the error trapping method.
                int userAge = intTry("Enter your age in years --> ");

                //Prompt the user to enter how they are doing.
                //Call the error trapping method.
                String userStatus = stringTry("How are you doing today? (Enter: Good or Bad) --> ");

                //Formatting.
                System.out.println("\n");

                //Call the giveEncouragement method, and display the resulting message.
                System.out.println(giveEncouragement(userAge, userStatus));

                //Formatting.
                System.out.println("\n");
            }

            //Test if the user wants to run the sixth method.
            else if(taskNum == 6){

                //Call the rollDice method.
                //This will be an integer array with the value of the first die, value of the second die, and the sum, respectively.
                int[] results = rollDice();

                //Display the value of the first die.
                System.out.println("The value of the first die is: " + results[0]);

                //Display the value of the second die.
                System.out.println("The value of the second die is: " + results[1]);

                //Display the sum of both dice.
                System.out.println("The sum of the two dice is: " + results[2]);

                //Formatting.
                System.out.println("\n");
            }

            //Test if the user wants to run the seventh method.
            else if(taskNum == 7){

                //Prompt the user for a string that they want to translate.
                String englishString =  stringTry("Enter an English string that you want translated to Oppish --> ");

                //Formatting.
                System.out.println("\n");

                //Display the string in Oppish.
                System.out.println("Translated to Oppish:");

                System.out.println(translateToOppish(englishString));

                //Formatting.
                System.out.println("\n");
            }

            //Test if the user wants to run the eighth method.
            else if(taskNum == 8){

                //Prompt the user for how many of the numbers they want to display.
                int length = intTry("How many Fibonacci numbers you want to display? (Choose an integer between 1 and 32) --> ");

                //Formatting.
                System.out.println("\n");

                //Display the Fibonacci numbers as an array with the length that the user chose.
                System.out.println("Here is the first " + length + " numbers of the Fibonacci Sequence:");

                //Call the method, and convert it to a string.
                System.out.println(Arrays.toString(calculateFibonacci(length)));

                //Formatting.
                System.out.println("\n");
            }

            //Test if the user wants to run the ninth method.
            else if(taskNum == 9){

                //Prompt the user for the number they want to take the double factorial of.
                //Call the error trapping method.
                int opperand = intTry("Enter the number you want to take the double factorial of --> ");

                //Formatting.
                System.out.println("\n");

                //Call the double factorial method, and display the result.
                System.out.println("The double factorial of " + opperand + " is: " + calculateDoubleFactorial(opperand));

                //Formatting.
                System.out.println("\n");
            }

            //Ask the user if they want to continue using the computer.
            continueProgram = stringTry("Do you want to do another task with the super computer? (Enter y or Y for yes, any else for no) --> ");

            //Formatting.
            System.out.println("\n");
        }

        //Tell the user that the program is ending.
        System.out.println("The program is ending...");

        //Formatting.
        System.out.println("\n");

        //Close the scanner.
        userinput.close();
    }

    //This method traps errors when entering an integer.
    static int intTry(String message){
        //This variable holds the user's response.
        int response;

        //This loop will run until a value is returned to the method.
        //This is so that if the user enters an incorrect value they will just be prompted again.
        while(true){

            //Run this code and check for errors.
            try {
                System.out.print(message);
                //Get the user's response.
                response = userinput.nextInt();
                userinput.nextLine();
                //Return the response to the method. This is the way the loop will end.
                return response;
            }
            //If an error is thrown this code will run.
            catch (InputMismatchException e) {
                userinput.nextLine();
            }
        }
    }

    //This method does the same thing but, it makes sure that the user entered a double instead of an integer.
    static Double doubleTry(String message){
        Double response;

        while(true){

            try {
                System.out.print(message);
                response = userinput.nextDouble();
                userinput.nextLine();
                return response;
            }
            catch (InputMismatchException e) {
                userinput.nextLine();
            }
        }
    }

    //Again, same thing, but for strings.
    static String stringTry(String message){
        String response;

        while(true){

            try {
                System.out.print(message);
                response = userinput.nextLine();
                return response;
            }
            catch (InputMismatchException e) {
                userinput.nextLine();
            }
        }
    }

    //This is where the code from my Favorite Saying app will go.
    static String getFavoriteSaying(){
        String saying = "";
        return saying;
    }

    //This is for the Text Art app.
    static String getTextArt(){
        String textArt = "";
        return textArt;
    }

    //The code from the Calculator app will be here.
    static Double useCalculator(int function, Double x, Double y){
        Double result = 0.00;
        return result;
    }

    //For the Binary Calculator code.
    static String useBinaryCalculator(int function, String binaryNum1, String binaryNum2){
        String result = "";
        return result;
    }

    //For the Encouragement app code.
    static String giveEncouragement(int age, String status){
        String message = "";
        return message;
    }

    //Dice App code.
    static int[] rollDice(){
        int[] results = new int[3];

        return results;
    }

    //Oppish translator code here.
    static String translateToOppish(String englishString){
        String result = "";
        return result;
    }

    //Fibonacci Sequence generator code here.
    static int[] calculateFibonacci(int length){
        int[] result = new int[length];
        return result;
    }

    //The Double Factorial code will go here.
    static int calculateDoubleFactorial(int opperand){
        int result = 0;
        return result;
    }
}