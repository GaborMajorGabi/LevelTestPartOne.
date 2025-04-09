package main;

public class Main {
    public static void main(String[] args) {

        //The limits of the interval
        int lowerLimit = 1345634868 + 1;
        int upperLimit = 1345639868 - 1;

        //We go through all the numbers in the interval
        for (int i = lowerLimit; i <= upperLimit; i++) {
            //Check if it is divisible by 3
            if (i % 3 == 0) {
                //We write the number on a separate line
                System.out.println(i);
            }
        }
    }
}

/**
 * Write a Java program that meets the following requirements: ➢ the program prints the numbers divisible by 3
 * between 1345634868 and 1345639868 to the standard output such that ➢ each number is placed on a separate line ➢
 * the limits of the specified interval are not printed!
 */
