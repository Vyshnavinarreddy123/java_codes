//find prime or not
import java.util.*;
class prime_or_not_finding
{
    public static void main(String args[])
    {
        int a;
        boolean b=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        a=sc.nextInt();
        for(int i=2;i<a/2;i++)
        {
            if(a%i==0)
            {
                b=false;
                break;
            }
            else
                b=true;
        }
        if(b==true)
        {
            System.out.println("it's a prime number");
        }
        else
        {
            System.out.println("it's not a prime number");   
        }
        
    }
}