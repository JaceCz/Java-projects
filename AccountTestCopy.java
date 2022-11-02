package Assignment2;

import Assignment1.Account;

import java.util.Scanner;



    /**
     * An AccountTest class that provides a menu choice for the credit, debit and reset methods
     * from the Account class
     */
    public class AccountTestCopy {
        public static void main(String[] args) {
            System.out.println("The Account Portal");

            Scanner input = new Scanner(System.in);

            AccountCopy account = new AccountCopy("Socrates", 39.45);

            System.out.printf("\n%s balance: $%.2f%n", account.getName(), account.getBalance());

            char c;

            do {
                System.out.println("\nPlease make a selection: \n Credit Account (C).\n Debit Account (D).\n Reset Account (R). \n Quit (Q).");
                System.out.print("\nChoice: ");
                c = Character.toUpperCase(input.next().charAt(0));
                switch (c) {
                    case 'C':

                        System.out.print("Enter the amount you would like to credit to the account: ");

                        double depositAmount = input.nextDouble();

                        System.out.printf("%n adding %.2f to the Account balance %n%n", depositAmount);

                        account.deposit(depositAmount);

                        System.out.printf("%s balance: %.2f%n", account.getName(), account.getBalance());
                        break;

                    case 'D':

                        System.out.print("Enter the amount you would like to debit from the account: ");

                        double debitAmount = input.nextDouble();

                        System.out.printf("%n deducing %.2f to the Account balance %n%n", debitAmount);

                        account.debit(debitAmount);

                        System.out.printf("%s balance: %.2f%n", account.getName(), account.getBalance());

                    case 'R':
                        //System.out.print("Press R to reset: ");
                        // String resetAccount = input.next();
                        account.reset();
                        System.out.printf("%s balance: %.2f%n", account.getName(), account.getBalance());
                }
            }
            while (c != 'Q') ;
            System.out.println("\nHave a great Day!");
        }
    }













