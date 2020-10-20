import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringPlay {
    public static void isNumber (String userInput){
        if(!StringUtils.isNumeric(userInput)){
            System.out.println("\"" + userInput + "\"" + " is not a number.");
        } else {
            System.out.println("\"" + userInput + "\"" + " is a number.");
        }
    }

    public static void flipCase (String userInput){
        System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));
    }

    public static void stringReversed(String userInput){
        System.out.println("Reversed: " + StringUtils.reverse(userInput));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("please enter a sentence: ");
        String userInput = s.nextLine();
        System.out.println("You entered: " + userInput);
        isNumber(userInput);
        flipCase(userInput);
        stringReversed(userInput);
    }
}
