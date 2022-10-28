package Assignment2;



import java.util.Scanner;

/** A Fibonacci class that allows the user to validate and generate Fibonacci numbers.
 * @author 20173559
 */
public class FibonacciCalculatorCopy {

    /** A method that checks to see if the integer
     * the user entered is a valid Fibonacci number.
     * @param number
     * @return
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













/** if (n == 0 || n== 1)
 return 0;
 else if(n == 2)
 return 1;
 return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);

 }










 /** public boolean isFibonacciNumber(int number) {

 return false;
 }

 **/







/** public static void main(String[] args) {
 int counter = 1;

 do {
 System.out.printf("%d", counter);
 ++counter;
 }
 while (counter < 10);
 System.out.println();

 }


 /** VERSION 1
 * public static void main(String[] args) {
 * <p>
 * Scanner input = new Scanner(System.in);
 * <p>
 * System.out.print("Enter a number to get the Fibonacci series: ");
 * <p>
 * int maxNumber = input.nextInt();
 * // Set it to the number of elements you want in the Fibonacci Series
 * //int maxNumber = 10;
 * int previousNumber = 0;
 * int nextNumber = 1;
 * <p>
 * System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
 * <p>
 * for (int i = 1; i <= maxNumber; ++i)
 * {
 * System.out.print(previousNumber+" ");
 * /* On each iteration, we are assigning second number
 * to the first number and assigning the sum of last two
 * numbers to the second number
 * <p>
 * <p>
 * <p>
 * int sum = previousNumber + nextNumber;
 * previousNumber = nextNumber;
 * nextNumber = sum;
 * }
 * }
 *
 * VERSION 2
 *
 *   public static void main(String[] args) {
 *         System.out.println("The Fibonacci Calculator\n");
 *
 *         Scanner input = new Scanner(System.in);
 *
 *         System.out.print("Enter a number to get the Fibonacci series:  ");
 *
 *         int userNumber = input.nextInt();
 *         int firstNumber = 0;
 *         int secondNumber = 1;
 *
 *         System.out.printf("Fibonacci series for the first " + userNumber + " numbers is:" + "\n");
 *
 *         for (int i = 1; i <= userNumber; ++i) {
 *
 *             System.out.print("\n"+ firstNumber + "\n");
 *
 *             int nextSeries = firstNumber + secondNumber;
 *             firstNumber = secondNumber;
 *             secondNumber = nextSeries;
 *
 *         }
 *
 *         System.out.print("Enter a number to get the Fibonacci series for less than n:  ");
 *     }
 **/
