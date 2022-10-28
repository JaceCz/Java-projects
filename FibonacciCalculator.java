package Assignment2;


import java.util.Scanner;

/** A Fibonacci class that allows the user to validate and generate Fibonacci numbers.
 * @author 20173559
 */
public class FibonacciCalculator {

    /** A method that checks to see if the integer
     * the user entered is a valid Fibonacci number.
     * @param number integer to test
     * @return true if number is Fibonacci
     */
    public boolean isFibonacciNumber(int number) {
        int[] fib = getFibonacciSequence(number);
        for (int i = 0; i < number; i++) {
            if (fib[i] == number) {
                return true;
            }
        }
        return false;
    }

    /** A method that gets the nth number in the
     * Fibonacci sequence
     * @param number
     * @return
     */
    public int getFibonacciNumber(int number) {
        int[] fib = getFibonacciSequence(number);
        return  fib[number-1];
    }

    /** A method that generates the Fibonacci sequence
     * @param number
     * @return
     */
    public int[] getFibonacciSequence(int number) {
        int[] fib = new int[number];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < number; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib;
    }

    /** A method that sets the template for the display menu
     * @param number
     */
    public void printSequence(int number) {
        int[] fib = getFibonacciSequence(number);
        System.out.printf("\n The Fibonacci sequence for " + number + " numbers are: ");
        for(int i=0; i < number; i++) {
            System.out.print( fib[i] + "  ");
        }
    }
}























