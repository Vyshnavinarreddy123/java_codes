/*You are required to design a class BankAccount in Java that simulates a basic bank account.
The class should support the following functionalities:

Initialization:

Create a constructor for the BankAccount class that initializes the account with the account
holder's name and an optional initial balance. If no initial balance is provided, it should
default to zero.
The constructor should ensure that the initial balance cannot be negative. If a negative
initial balance is provided, it should be set to zero.

Deposit:

Implement a method deposit(double amount) that allows adding a specified amount to the account 
balance. The method should ensure that the amount to be deposited is positive.
If a non-positive amount is provided for deposit, the method should not change the balance 
and should simply return without taking any action.

Withdrawal:

Implement a method withdraw(double amount) that allows subtracting a specified amount
from the account balance. The method should ensure that the amount to be withdrawn is
positive and does not exceed the current balance.
If a non-positive amount is provided or if the withdrawal amount is greater than the current balance,
the method should not change the balance and should simply return without taking any action.

Check Balance:

Implement a method getBalance() that returns the current balance of the account.

Account Details:

Implement a method getAccountDetails() that returns a string containing the account holder's name and 
the current balance in the format: "Account holder: [name], Balance: $[balance]".

Requirements:

The BankAccount class should encapsulate the account balance and account holder's name, ensuring that 
these details are protected from direct access outside the class.
Methods for depositing and withdrawing funds should include basic validation to ensure only valid 
operations are performed (e.g., no negative deposits or withdrawals, no overdrafts).
The class should provide clear and understandable methods for interacting with the bank account,
following object-oriented principles.*/



//back problem statement1
import java.util.*;
class BankAccount
{
    String acc_name;
    double int_bal;
    BankAccount(String a)
    {
        acc_name=a;
        int_bal=0.0;
    }
    
    BankAccount(String a,double b)
    {
        acc_name=a;
        int_bal=b;
    }
    
    void deposit(double amount)
    {
        if(amount>0.0)
        {
            int_bal+=amount;
        }
        else
        {
            int_bal+=0;
        }
    }
    
    void withdrawl(double amount)
    {
        if(amount>0.0 && int_bal>=amount)
        {
            int_bal-=amount;
        }
        else
        {
            int_bal-=0;
        }
    }
    
    void getBalance()
    {
        System.out.println("Cuurent_Balance="+int_bal);
    }
    
    void getAccountDetails()
    {
        System.out.println("Account holder: ["+acc_name+"], Balance: $["+int_bal+"]");
    }
}
class Bank_question
{
    public static void main(String arg[])
    {
        BankAccount b;
        String name;
        double int_bal,amount=0.0;
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        name=sc.nextLine();
        System.out.println("enter initial balance in their account");
        int_bal=sc.nextDouble();
        b=new BankAccount(name,int_bal);
        System.out.println("enter 1 for deposit ,2 for withdrawl,3 for Check Balance, 4 for Account Details");
        n=sc.nextInt();
        switch(n)
        {
            case 1:
                {
                    System.out.println("enter amount to deposit");
                    amount=sc.nextDouble();
                    b.deposit(amount);
                    System.out.println("Check Balance:");
                    b.getBalance();
                    System.out.println("Account Details:");
                    b.getAccountDetails();
                    break;
                    
                }
            case 2:
                {
                    System.out.println("enter amount to withdrawl");
                    amount=sc.nextDouble();
                    b.withdrawl(amount);
                    System.out.println("Check Balance:");
                    b.getBalance();
                    System.out.println("Account Details:");
                    b.getAccountDetails();
                    break;
                }
         }
    }
}




















