/*Create a class called Account that has the protected data members
accnumber of int type, balance of double, and constructors for
initialization.

Derive a class called SBAccount and define methods deposit(double),
withdraw(double), calc_interest(). Provide a parameterized constructor
with two parameters account number, and init_balance and assign these
values to the appropriate data members of the class using super class
constructor.

The deposit method should take one double type argument
amount and adds the amount to the balance if the amount is positive. 

The withdraw method, should take one double type argument amount and
checks if balance - amount is greater than Rs.1000/-. If so, it should
subtract the amount from balance. Otherwise it should display error
message.

The calc_interest() method should compute interest for the
balance amount available @ 4% for one year and the interest amount
should be credited to the balance.

Create a class called Customer. The data members of the class are cust_id
of int type, name, and address of string type, and object of SBAccount.
Provide parameterized constructor with cust_id, name, address, account
number, initial balance as parameters for opening a SB account for new
customer. Provide a method transaction(int type) {type may be withdraw,
deposit or calc_interest to perform the requested transaction on the
requested Account object.

To demonstrate all the functionalities of above classes, create a class called
BankDemo and declare a main method to create an array of 5 elements of
Customer objects, and perform manipulations on the objects by depositing
and withdrawing amount from SB account.*/

import java.util.*;
import java.io.*;
class Account
{
    protected int accno;
    protected double bal;
    Account(int a,double n)
    {
        accno=a;
        bal=n;
    }
}

class SBAccount extends Account
{
    double interest;
    
    
    SBAccount(int account_number,double init_balance)
    {
        super(account_number,init_balance);
    }
    
    void deposit(double amt)
    {
        if(amt>0.0)
          bal=bal+amt;
        else
          bal=bal+0;
     
    }
    void withdraw(double amt)
    {
        if(bal- amt>1000)
            bal=bal-amt;
        else
            System.out.println("CHECK YOU BALANCE");
    }
    void calc_interest()
    {
        interest=(bal*4)/100;
        bal+=interest;
    }
}
class Customer 
{
    int cust_id;
    String address,name;
     SBAccount sb;
    
   
    Customer(int c,String a,String n,int ax,double b)
    {
       
        cust_id=c;
        name=n;
        address=a;
         this.sb=new SBAccount(ax,b);
    }
    
    public void transaction(int type) 
    {
        switch (type) 
        {
            case 1:
                sb.deposit(1000);
                break;
            case 2:
                sb.withdraw(500);
                break;
            case 3:
                sb.calc_interest();
                break;
            default:
                System.out.println("Invalid transaction type");
        }
    }
    
}
class BankDemo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int type;
        Customer c[]=new Customer[5];
        c[0] = new Customer(1, "John Doe", "123 Main St", 12345, 5000);
        c[1] = new Customer(2, "Jane Smith", "456 Elm St", 23456, 10000);
        c[2] = new Customer(3, "Bob Johnson", "789 Oak St", 34567, 7500);
        c[3] = new Customer(4, "Alice Williams", "135 Maple St", 45678, 8000);
        c[4] = new Customer(5, "Charlie Brown", "246 Pine St", 56789, 6000);

       for(Customer i:c)
       {
        i.transaction(new Integer((int) (Math.random()*10)%3+1));
        System.out.println("Customer " +i.cust_id + " balance: " +i.sb.bal);
           
       }
    }
}
    
