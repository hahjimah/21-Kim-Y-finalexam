package finalproject;

import java.util.*;

public class StringCalculator 
{
    public static int add(final String numbers) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n");
        List negativeNumbers = new ArrayList();
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                int numberInt = Integer.parseInt(number.trim());
                if (numberInt < 0) {
                    negativeNumbers.add(numberInt);
                } else if (numberInt < 1000) {
                    returnValue += numberInt;
                }
            }
        }
        if (negativeNumbers.size() > 0) {
            throw new RuntimeException("Negatives not allowed");
        }
        return returnValue;
    }
}
