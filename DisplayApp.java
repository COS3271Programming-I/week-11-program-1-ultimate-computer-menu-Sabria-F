public class DisplayApp {

    public String displayFavoriteSaying() {

        //This string will contain the entire message.
        String message;

        //Create two string variables named a and b containing the first two phrases of the saying:
        String a,b;

        a = "\tOnly one life 'twill soon be past,\n";
        b = "\tonly what's done for God will last.\n";

        //Append the two strings to the message.
        message = a + b;

        //Add the second part of the saying, keeping the formatting.        
        message += String.format("%44s%55s","And when I die how glad I shall be,\n","If the lamp of my life has burnt out for thee.\n");

        //Append the name of the author, again keeping the formatting I added previously.
        message += String.format("%50s","-c.t. studd".toUpperCase());

        //return the message.
        return message;

    }
}
