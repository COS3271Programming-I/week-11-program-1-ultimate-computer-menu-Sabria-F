public class BinaryCalculator {

    public String useBinaryCalculator(int function, String binaryNumber1, String binaryNumber2){
       
        //This string holds the result.
        String r;

        //I chose the names xi and yi to signify the these variables will be the integer equivalents of x and y.
        int xi;
        int yi;

        //Get the first binary number from the user and convert it to an int:
        xi = Integer.parseInt(binaryNumber1,2);

        //Get the second binary number from the user and convert it to an int:
        yi = Integer.parseInt(binaryNumber2,2);

        System.out.print("\n");

        //Performing the calculations on the integers, converting them back to binary strings, then printing the results to the screen:
        r = switch (function) {
            case 1 -> Integer.toBinaryString(xi+yi);
            case 2 -> Integer.toBinaryString(xi-yi);
            case 3 -> Integer.toBinaryString(xi*yi);
            default -> Integer.toBinaryString(xi/yi);
        };

        //Return the result.
        return r;
    }

}
