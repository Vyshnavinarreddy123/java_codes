import java.util.*;
class BankException extends Exception
{
    double bal=8900;
     BankException(){}
    BankException(String s)
    {
        super(s);
    }
}
class Bankk_pblm_stmt
{
    
    public static void main (String[] args) 
    {
        double amt;
        BankException b=new BankException();
        double bal1=b.bal;
        System.out.println("enter amount");
        Scanner sc=new Scanner(System.in);
        amt=sc.nextDouble();
        try
        {
           if(bal1<amt)
           throw new BankException("invalid amt");
           else
           throw new BankException("valid amt");
        } 
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }   
}