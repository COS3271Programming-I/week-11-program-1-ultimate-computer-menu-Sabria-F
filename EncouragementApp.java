public class EncouragementApp {

    public String giveEncouragement(int age, String status){

        //This string will hold the encouragement to be given to the user.
        String encouragement = "";

        //Store a message in the variable if the user is doing well and is less than 18 years old.
        if(age<18 && status.equalsIgnoreCase("Good")) {
            
            encouragement = "I'm glad to hear your doing well. School must be going smoothly.";
        }

        //Store a message in the variable if the user is doing badly and is less that 18 years old.
        if (age<18 && status.equalsIgnoreCase("Bad")) {
            
            encouragement = "I am sorry to hear that. Remember that the Lord cares for his children.";
        }

        //Store a message in the variable if the user is between the ages of 17 and 40 and is doing well.
        if (age>17 && age<40 && status.equalsIgnoreCase("Good")) {
            
            encouragement = "Don't forget to thank the Lord for the blessings He gives.";
        }

        //Store a message in the variable if the user is between the ages of 17 and 40 and is doing badly.
        if (age>17 && age<40 && status.equalsIgnoreCase("Bad")) {
            
        encouragement = "Trust in the Lord with all your heart and lean not on your own understanding, ";
        encouragement += "in all your ways acknowledge Him and He will direct your paths.";
        encouragement += "\t\t\t\t\tProverbs 3:5-6";
        }

        //Store a message in the variable if the user is older than 39 and is doing well.
        if (age>39 && status.equalsIgnoreCase("Good")) {
            encouragement = "May you have many more years of walking with the Lord.";
        }

        //Store a message in the variable if the user is older than 39 and is doing badly.
        if (age>39 && status.equalsIgnoreCase("Bad")) {
            encouragement = "O praise the Lord, all ye nations:";
            encouragement += "praise him, all ye people.";
            encouragement += "For his merciful kindness is great toward us:";
            encouragement += "and the truth of the Lord endureth for ever.";
            encouragement += "Praise ye the Lord.";
            encouragement += "\t\t\tPsalm 117";
        }

        //Return the message.
        return encouragement;
    }

}
