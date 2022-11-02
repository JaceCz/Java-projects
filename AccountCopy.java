package Assignment2;
import java.lang.*;

/** A modified Account class that adds a method call debit to withdraw money
 * and provides two other methods to credit(add money) and reset account
 *
 * @author 20173559
 */
public class AccountCopy {

    private String name;
    private double balance;

    /** An account constructor that receives 2 parameters
     * @param name
     * @param balance
     */
    public AccountCopy(String name, double balance) {
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    /** A method that credits (adds) only
     * a valid amount to the balance
     */
    public void deposit(double depositAmount) {
        if (depositAmount < 0.0) {
            System.out.println("Please enter a valid amount.");
        } else {
            balance = balance + depositAmount;
        }
    }

    /** A method that debits (deducts) only a
     * valid amount to the balance
     */
    public void debit(double debitAmount) {
        if (debitAmount < 0.0) {
            System.out.println("Please enter a valid debit amount");
        }
        else {
            balance = balance - debitAmount;
        }
    }

    /** A method to reset the balance
     */
    public double reset() {
        return balance;
    }

    /**A method to return the account balance
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /** A method to set the name in the object
     * @param name account name
     */
    public void setName(String name) {
        this.name = name; // store the name
    }

    /** A method to retrieve the name from the object
     * @return name
     */
    public String getName() {
        return name;
    }
}

