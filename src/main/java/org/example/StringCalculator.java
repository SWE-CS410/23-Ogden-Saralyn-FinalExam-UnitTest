package org.example;

public class StringCalculator {
    public static int add(String numbers) {
        int returnValue=0;
        String[] numbersArray = numbers.split(",|\n");
        if (numbersArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        } else {
            for (String number : numbersArray) {
                int integer = Integer.parseInt(number.trim());
                if (integer < 0) {
                    throw new RuntimeException("Negatives not allowed");
                }
                if (!number.trim().isEmpty() && integer < 1000) {
                    returnValue+=integer; // If it is not a number, parseInt will throw an exception
                }
            }
        }
        return returnValue;

    }
}
