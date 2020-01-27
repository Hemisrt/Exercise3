package com.company.Greenlee;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    // Trenton Greenlee. 1/22/2020. Exercise3. CSCI 1660 - Android Programming Fundamentals (Java).

    // Importing Scanner input to be able to use user inputs for all data types.
    private static Scanner input = new Scanner(System.in);

    // Methods.
    // Calculator to determine degrees fahrenheit into degrees celsius.
    static double celsiusCalculator(double fahrenheit) {
        double celsius = (fahrenheit - 32) / 1.8;
        return celsius;
    }

    // Output to print out degrees celsius to the user.
    // Importing DecimalFormat class to restrict the value of Variables.celsius to only two decimal places.
    private static void output(double celsiusValue) {
        DecimalFormat celsiusFormat = new DecimalFormat("###.##");
        double celsiusCalculation = (celsiusCalculator(celsiusValue));
        System.out.print("This temperature in Celsius is: " + celsiusFormat.format(celsiusCalculation) + " C°\n");
    }

    public static void main(String[] args) {
        /* Write a program that prompts a user to enter a temperature in Fahrenheit, converts it to Celsius,
        and displays the Celsius temperature. Separate the code that collects user input, the code that converts
        temperatures, and the code that displays the output into different methods. The program should repeat until
        the user enters a value less than -460 (approximately absolute zero).*/
        System.out.println("Enter a temperature in fahrenheit(Enter '-461' or lower to end the program): ");
        double fahrenheitInput = input.nextDouble();

        // Using a while loop to determine if the userInput() value is greater than or equal to -460.
        // Will not execute if 'less than -460'.
        // Will execute if greater than or equal to -460.
        // Calling celsiusCalculator() to calculate userInput() value into degrees celsius.
        // Calling output() to display the results from celsiusCalculator().
        // Calling upon userInput() again since the previous userInput value was true
        while (fahrenheitInput >= -460) {
            output(fahrenheitInput);
            System.out.println("Enter a temperature in fahrenheit(Enter '-461' or lower to end the program): ");
            fahrenheitInput = input.nextDouble();
        }
    }
}
