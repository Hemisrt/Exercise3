package com.company.Greenlee;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    // Trenton Greenlee. 1/22/2020. Exercise3. CSCI 1660 - Android Programming Fundamentals (Java).

    // Importing Scanner input to be able to use user inputs for all data types.
    private static Scanner input = new Scanner(System.in);

    // Created a Variables class to have both variables act global within the program.
    private static class Variables {
        private static double fahrenheit;
        private static double celsius;
    }

    // Methods.
    // User inputting degrees fahrenheit.
    private static void userInput() {
        System.out.println("Enter a temperature in fahrenheit (Enter '-461' or lower to end the program): ");
        Variables.fahrenheit = input.nextDouble();
    }

    // Calculator to determine degrees fahrenheit into degrees celsius.
    private static void celsiusCalculator() {
        Variables.celsius = (Variables.fahrenheit - 32) / 1.8;
    }

    // Output to print out degrees celsius to the user.
    // Importing DecimalFormat class to restrict the value of Variables.celsius to only two decimal places.
    private static void output() {
        DecimalFormat celsiusFormat = new DecimalFormat("###.##");
        System.out.println("This temperature in Celsius is: " + celsiusFormat.format(Variables.celsius) + "C°");
    }

    public static void main(String[] args) {
        // Calling userInput() so the while loop can read the users inputted value for fahrenheit
        userInput();

        // Using a while loop to determine if the userInput() value is greater than or equal to -460.
        // Will not execute if 'less than -460'.
        // Will execute if greater than or equal to -460.
        // Calling celsiusCalculator() to calculate userInput() value into degrees celsius.
        // Calling output() to display the results from celsiusCalculator().
        // Calling upon userInput() again since the previous userInput value was true
        while (Variables.fahrenheit >= -460) {
            celsiusCalculator();
            output();
            userInput();
        }
    }
}