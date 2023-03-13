package main;
import java.util.ArrayList;

import lib.bankaccounts.BankAccount;
import lib.bankaccounts.InterestAccount;
import lib.bankaccounts.IsaAccount;
import lib.bankaccounts.StudentAccount;

public class BankAccountDemo {

    public static void main(String[] args) {
        /* Testing BankAccount */
    	BankAccount acc = new BankAccount(100);
        System.out.println(acc.toString());
        acc.deposit(50);
        acc.withdraw(40);
        System.out.println(acc.getBalance()); //balance = 110
        acc.withdraw(150);
        System.out.println(acc.getBalance()); //balance = -40

        
        /* Testing InterestAccount */
        InterestAccount intacc = new InterestAccount(3000, 5, 1000);
        System.out.println("\n" + intacc.toString());
        intacc.withdraw(1800);
        System.out.println(intacc.getBalance()); //balance = 1200
        intacc.addInterest();
        System.out.println(intacc.getBalance()); //balance = 1260
        intacc.withdraw(500);
        System.out.println(intacc.getBalance()); //balance = 1260 - no change because of minimum balance

        
        /* Notice how an instance of a sub-class can be assigned
         * to a variable of super-class type. Dynamic method lookup
         * ensures the overridden InterestAccount withdraw(...) method
         * is invoked. However, if you try to invoke the addInterest()
         * method it will not work as BankAccount does not implement it. */
        BankAccount myacc = new InterestAccount(1500, 2, 1000);
        System.out.println("\n" + myacc.toString()); //displays InterestAccount even though stored in BankAccount variable
        System.out.println(myacc.getBalance()); //balance = 1500
        myacc.withdraw(600);
        System.out.println(myacc.getBalance()); //balance = 1500 - no change
        //myacc.addInterest(); // <--- try removing this comment, will give syntax error
        
        
        BankAccount pupil = new StudentAccount(500, 100);
        System.out.println("\n" + pupil.toString());
        System.out.println(pupil.getBalance());
        pupil.withdraw(600);
        System.out.println(pupil.getBalance());
        pupil.withdraw(1);
        System.out.println(pupil.getBalance());
        
        
        
        /* TEST IsaAccount here... */
        
        
        
        /* Create ArrayList to hold different types of bank account. */
        ArrayList<BankAccount> banks = new ArrayList<>();
        //Objects of type BankAccount or any of its subclasses can be added
        banks.add(new BankAccount(3000));  
        banks.add(new InterestAccount(2500, 3, 1000));
        banks.add(new InterestAccount(6000, 5, 5000));
        banks.add(new BankAccount(1200));
        banks.add(new StudentAccount());
        banks.add(new IsaAccount());
        
        System.out.println("\nProcessing bank accounts in list...");
        //different type of object can be processed uniformly, this is known as polymorphism 
        for (BankAccount b : banks) {
        	//subclass instances will either invoke inherited or overridden methods
        	System.out.println("=====\n" + b.toString());
        	System.out.println("Balance = " + b.getBalance());
        	b.deposit(300);
        	System.out.println("Balance = " + b.getBalance());
        	b.withdraw(1500);
        	System.out.println("Balance = " + b.getBalance());
        }
        
        
        IsaAccount account = new IsaAccount();
        account.deposit(999);
        System.out.println("\n" + account.getDepositRemaining());
        account.deposit(1);
        System.out.println(account.getDepositRemaining());
        account.deposit(10);
        System.out.println(account.getDepositRemaining());
        
        StudentAccount a = new StudentAccount(100, 1000);
        StudentAccount b = new StudentAccount(100, 1000);
        System.out.println("\n" + a.equals(b));
        
        
    }
}

