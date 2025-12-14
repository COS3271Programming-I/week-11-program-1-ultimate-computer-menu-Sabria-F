public class Dice {

    public int[] rollDice(){

        //This integer array will hold the first roll, the second roll, and the sum of the rolls.
        int[] result = new int[3];

        //Radomly choose a integer between 1 and 6 and set it equal to the first index in the result array.
        result[0] = (int)(Math.random()*6)+1;

        //Same thing, but this time we set it equal to the second place.
        result[1] = (int)(Math.random()*6)+1;

        //Set the third place in the array equal to the sum of the other two.
        result[2] = result[0] + result[1];

        //Return the result.
        return result;
    }
}
