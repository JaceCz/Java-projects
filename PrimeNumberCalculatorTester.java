package Assignment2;

import java.util.Scanner;
/** A PrimeNumberCalculatorTester class the provides a menu choice
 * for displaying the prime numbers upto a value, prime numbers between 2 values
 * and generate the unique prime factorization of a number
 */
public class PrimeNumberCalculatorTester {

    public static void main(String[] args) {
        System.out.println("The Prime Number Magic Portal");

        PrimeNumberCalculator pnc = new PrimeNumberCalculator();

        Scanner input = new Scanner(System.in);

        char c;

        do {
            System.out.println("\nPlease make a selection:\n \n Prime numbers upto a value (A).\n Primes between 2 numbers (B).\n Unique Prime factorization of a number (C).\n Please press Q to quit (Q).");
            System.out.print("\nChoice: ");
            c = Character.toUpperCase(input.next().charAt(0));
            switch (c) {
                case 'A':

                    System.out.println("Enter a number to get the primes: ");
                    int num = input.nextInt();
                    for (int i = 2; i <= num; i++) {
                        System.out.printf("\n %d %s", i, pnc.isPrime(i) ? "PRIME :)": "NOT A PRIME :(");
                    }
                    break;

                case 'B':

                    System.out.println("Enter 2 numbers starting with the upper number to get Primes:  ");

                    int upper = input.nextInt();
                    int lower = input.nextInt();
                    System.out.printf("\n Primes between %d and %d :", lower, upper);
                    for (int i = lower; i <= upper; i++) {
                        if (pnc.isPrime(i)) {
                            System.out.printf("%10d", i);
                        }
                    }
                    break;

                case 'C':

                    System.out.println("Enter a number to get the prime factorization:  ");
                    int num1 = input.nextInt();
                    System.out.print(pnc.getUniquePrimeFactorization(num1) + "\n");
                    break;
                    }
            }
            while (c != 'Q') ;
            System.out.println("\nHave an Awesome Day!");
        }
    }






