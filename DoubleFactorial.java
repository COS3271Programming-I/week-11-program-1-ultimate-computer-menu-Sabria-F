public class DoubleFactorial {

    public int calculateDoubleFactorial(int opperand){

        //Set the result to have a default of 1.
        int result = 1;

        //Test if the opperand is less than or equal to 0.
        //This is to keep the program from going on endlessly.
        if(opperand <= 0){
            //return the result.
            //This is what actually stops the code.
            return result;
        }

        //Call and return the function but set the opperand to be two lower than before.
        //Also, multiply by the opperand, this will calculate the double factorial.
        return calculateDoubleFactorial(opperand - 2) * opperand;
    }
}
