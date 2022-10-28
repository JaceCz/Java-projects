package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

/** A FibonacciCalculatorTester class the provides a menu choice
 * for displaying the Fibonacci numbers, get their nth number
 * and check to see if the user entered a Fibonacci number
 */
public class FibonacciCalculatorTester {
    public static void main(String[] args) {
        System.out.println("The Fibonacci Mystery");

        FibonacciCalculator fc = new FibonacciCalculator();

        Scanner input = new Scanner(System.in);

        char c;

        do {
            System.out.println("\nPlease make a selection: \n \n Display Fibonacci numbers upto a value (A).\n Print n Fibonacci numbers (B).\n Check if a number is Fibonacci (C). \n Please press Q to quit (Q).");
            System.out.print("\nChoice: ");
            c = Character.toUpperCase(input.next().charAt(0));
            switch (c) {
                case 'A':

                    System.out.println("Enter a number to get the Fibonacci numbers: ");

                    int num = input.nextInt();

                    if (fc.isFibonacciNumber(num)) {
                        System.out.print(num + "  is a valid Fibonacci number");
                    }
                    else {
                        System.out.printf(num + "  is not a valid Fibonacci number");
                    }
                    fc.printSequence(num);
                    break;

                case 'B':
                    System.out.println("Enter a number to get the first n Fibonacci numbers:  ");

                    int num1 = input.nextInt();
                    fc.printSequence(num1);
                    break;

                case 'C':
                    System.out.println("Enter a number to check if it's a Fibonacci number:  ");

                    int num2 = input.nextInt();
                    if (fc.isFibonacciNumber(num2)) {
                        System.out.print(num2 + "  is a valid Fibonacci number");
                    }
                    else {
                        System.out.printf(num2 + "  is not a valid Fibonacci number");
                    }
                    break;
            }
        }
        while (c != 'Q') ;
        System.out.println("\nHave an Awesome Day!");
    }
}
