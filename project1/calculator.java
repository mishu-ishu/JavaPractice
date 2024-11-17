/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1;
import java.util.Scanner;

/**
 *
 * @author Maira
 */
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Enter first number:");
            double num1 = sc.nextDouble();
            
            System.out.println("Enter second number:");
            double num2 = sc.nextDouble();
            
            System.out.println("Choose an operation: +, -, *, /");
            char operation = sc.next().charAt(0);
            
            double result = 0;
            boolean validOperation = true;
            
            switch (operation) {
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
                        System.out.println("Error: Division by zero is not allowed.");
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("Invalid operation. Please choose +, -, *, or /.");
                    validOperation = false;
            }
            
            if (validOperation) {
                System.out.println("Result: " + result);
            }
            
            System.out.println("Do you want to perform another calculation? (y/n)");
            choice = sc.next().charAt(0);
            
        } while (choice == 'y' || choice == 'Y');
        
        System.out.println("Calculator program terminated.");
    }
}
