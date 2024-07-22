package com.wipro.calculator;

import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        // Prompt user for the second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Prompt user for the operator
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        // Perform the operation based on the user input
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Error! Invalid operator.");
                return;
        }

        // Display the result
        System.out.println("The result is: " + result);
    }
}






