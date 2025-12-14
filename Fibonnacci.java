public class Fibonnacci {

    public int[] calculateFibonacci(int length){

        //This array will hold the list of Fibonnacci numbers.
        int[] result = new int[length];

        //Create a for loop that will execute while i is less than or equal to the number passed to the method.
        for (int i = 1; i < length; i++){
            //Set the first value to be 1.
            if(i==1){
                result[i]=1;
            }
            //Calculate the next values.
            else{
                result[i] = result[i-1] + result[i-2];  
            }
        }

        //Return the result.
        return result;
    }

}
