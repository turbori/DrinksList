/*
Define a method printDrinksList() that takes three string parameters and outputs as follows, ending with a newline. The method should not return any value.

Ex: If the input is cocoa tea soda, then the output is:

Drinks list:
A) cocoa
B) tea
C) soda
 */

import java.util.Scanner;

public class DrinksList {

    /* Your code goes here */

    public static void printDrinksList(String s1, String s2, String s3){
        System.out.println("Drinks list:");
        System.out.println("A) " + s1);
        System.out.println("B) " + s2);
        System.out.println("C) " + s3);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String drink1;
        String drink2;
        String drink3;

        drink1 = scnr.next();
        drink2 = scnr.next();
        drink3 = scnr.next();

        printDrinksList(drink1, drink2, drink3);
    }
}