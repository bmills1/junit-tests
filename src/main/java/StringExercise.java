import com.google.common.base.Joiner;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Something:");
        String userInput = sc.nextLine();
        System.out.println("You entered: " + "\"" + userInput + "\"");
        //using StringUtils
//        StringUtils.center(userInput, userInput.length()+ 2, "\"")
        if (StringUtils.isNumeric(userInput)) {
            System.out.println("\"" + userInput + "\"" + "is a number.");
            //using StringUtils
//            System.out.println(StringUtils.center(userInput, userInput.length()+ 2, "\"") +  " is a number.");
        } else {
            System.out.println("\"" + userInput + "\"" + " is not a number.");
            //using StringUtils
//            System.out.println(StringUtils.center(userInput, userInput.length()+ 2, "\"") + " is not a number.");
        }
        System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));
        //using StringUtils
//        StringUtils.swapCase(StringUtils.replace(userInput, "\"", ""));
        System.out.println("Reversed: " + StringUtils.reverse(userInput));
        //using StringUtils
//        StringUtils.replace(userInput, "\"", "")
    }


}
//    Create a new class with a main method that prompts the user for input and does the following (using the Stringutils class)
//
//    Tells whether or not what the user entered is a number
//    Flips the case of the string
//    Reverses the string
//    Example Console Output
//
//
//    Enter Something: Life, The Universe, and Everything
//    You Entered: "Life, The Universe, and Everything"
//            "Life, The Universe, and Everything" is not a number
//    Flipped Case: lIFE, tHE uNIVERSE, AND eVERYTHING
//    Reversed: gnihtyrevE dna ,esrevinU eht ,efiL

