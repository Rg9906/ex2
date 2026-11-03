
package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- CALCULATOR ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int num = sc.nextInt();
            if (num == 0) {
                System.out.println("Goodbye!");
                break;
            }
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();
            if (num == 1) {
                System.out.println("Addition: " + (a + b));
            }
            else if (num == 2) {
                System.out.println("Subtraction: " + (a - b));
            }
            else if (num == 3) {
                System.out.println("Multiplication: " + (a * b));
            }
            else if (num == 4) {
                if (b == 0) {
                    System.out.println("Cannot divide by zero!");
                }
                else {
                    System.out.println("Division: " + (a / b));
                }
            }
            else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
