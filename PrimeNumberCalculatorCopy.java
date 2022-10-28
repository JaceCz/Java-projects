package Assignment2;

/** A PrimeNumber class that allows the user to generate primes
 * and generate the prime factorization of numbers
 * @author 20173559
 */
public class PrimeNumberCalculatorCopy {

    /** A method that checks to see if the number
     * entered by the user is a valid prime number
     * @param number number to test
     * @return true if number is prime
     */
    public boolean isPrime(int number) {
        if (number == 2)
            return true;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    /** A method that gets the unique product of primes
     * for any number entered by the user
     * @param number number to factor
     * @return String formatted product of primes
     */
    public String getUniquePrimeFactorization(int number) {
        String result = " ";

        while (number % 2 == 0) {
            System.out.print( 2 + "   ");
            number /= 2;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                System.out.printf( i + "    ");
                number /= i;
            }
        }

        if (number > 2) {
            result =  (number + "           ");
        }
        return result;
    }
}

/**   String result = "";
 int a = 1;

 while (a <= number) {

 if (number % a == 0) {
 int b = 1, c = 0;
 while (b <= a) {
 if (a % b == 0)
 c ++;
 b ++;
 }

 if (c == 2) {
 result = result + a + " * ";
 }
 }
 a++;
 }
 return result;
 }

 }


 /**

 /**









 /**  String result = " ";

 while (number % 2 == 0) {
 System.out.print(2 + " ");
 number /= 2;
 }

 for (int i = 3; i <= Math.sqrt(number); i += 2) {
 while (number % i == 0) {
 System.out.print(i + " * ");
 number = number / i;
 }
 }
 if (number > 2)
 result += "*" + number + "*";
 return result;
 }


 /**  for ( int i = 2; i < number; i++) {
 while(number % i == 0) {
 System.out.println(i + "");
 number = number/i;
 }

 }

 if (number > 2) {
 System.out.println(number);
 }

 **/
