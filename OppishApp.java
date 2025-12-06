

public class OppishApp {

    public String translateToOppish(String s){

        //This string will hold the translated Oppish sentance.
        String result = "";

        //Initiate an integer i to control the while loop.
        int i = 0;

        //Run the loop while i is less than or equal to the length of the string minus 1. We had to subtract one because string indexing starts at zero.
        while(i<=(s.length())-1){

            //Test if the character is a vowel.
            if(String.valueOf(s.charAt(i)).equalsIgnoreCase("a")||String.valueOf(s.charAt(i)).equalsIgnoreCase("e")||String.valueOf(s.charAt(i)).equalsIgnoreCase("i")||String.valueOf(s.charAt(i)).equalsIgnoreCase("o")||String.valueOf(s.charAt(i)).equalsIgnoreCase("u")||String.valueOf(s.charAt(i)).equalsIgnoreCase("y")){

                //If it is, then add the character to the result. I used print instead of println so that no new lines will be added between letters.
                result += s.charAt(i);
            }

            //Test if the character is a space.
            else if(String.valueOf(s.charAt(i)).equalsIgnoreCase(" ")){
                //If it is, then add an underscore to the result.
                result += "_";
            }

            //Test if we have reached the end of the sentance.
            else if((i+1)<=(s.length())-1){

                //Test if the caracter is followed by another character that isn't a vowel. This will keep "opp" from being printed when there is a consonant cobination, and at the end of a word.
                if(!String.valueOf(s.charAt(i+1)).equalsIgnoreCase("a") && !String.valueOf(s.charAt(i+1)).equalsIgnoreCase("e") && !String.valueOf(s.charAt(i+1)).equalsIgnoreCase("i") && !String.valueOf(s.charAt(i+1)).equalsIgnoreCase("o") && !String.valueOf(s.charAt(i+1)).equalsIgnoreCase("u") && !String.valueOf(s.charAt(i+1)).equalsIgnoreCase("y")){

                    //If the character is followed by another character that isn't a vowel, add the character to the result.
                    result += s.charAt(i);
                }

                //Test if the character is not a vowel.
                else if(!String.valueOf(s.charAt(i)).equalsIgnoreCase("a") && !String.valueOf(s.charAt(i)).equalsIgnoreCase("e") && !String.valueOf(s.charAt(i)).equalsIgnoreCase("i") && !String.valueOf(s.charAt(i)).equalsIgnoreCase("o") && !String.valueOf(s.charAt(i)).equalsIgnoreCase("u") && !String.valueOf(s.charAt(i)).equalsIgnoreCase("y")){

                //If it isn't a vowel, add the character and an "opp" to the result.
                result += s.charAt(i) + "opp";
                }

                else{

                    result += s.charAt(i);

                }
            }

            //Test if the character is not a vowel.
            else if(!String.valueOf(s.charAt(i)).equalsIgnoreCase("a") && !String.valueOf(s.charAt(i)).equalsIgnoreCase("e") && !String.valueOf(s.charAt(i)).equalsIgnoreCase("i") && !String.valueOf(s.charAt(i)).equalsIgnoreCase("o") && !String.valueOf(s.charAt(i)).equalsIgnoreCase("u") && !String.valueOf(s.charAt(i)).equalsIgnoreCase("y") && (i+1)<=(s.length())-1){

                //If it isn't a vowel, add the character and an "opp" to the result.
                result += s.charAt(i) + "opp";
            }

            //If none of the other conditions are fulfilled simply add the character to the result.
            else{
                result += s.charAt(i);
            }

            //Redefine i to be 1 larger than the current value.
            i+=1;
        }
        
        //Return the result.
        return result;
    }
}
