public class Calculator {

    public Double useCalculator(int function, Double x, Double y){

        //This will hold the result.
        Double result;

        //Test which function is to be performed and assign the result to the result variable.
        result = switch (function) {
            case 1 -> x + y;
            case 2 -> x * y;
            case 3 -> Math.pow(x,y);
            default -> Math.log(x)/Math.log(y);
        };

        //Return the result.
        return result;
    }

}
