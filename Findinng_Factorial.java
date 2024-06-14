//factorial of a given num
import java.util.*;
class Findinng_Factorial
{
    public static void main(String args[])
    {
        float a,f=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        a=sc.nextInt();
        for(float i=1;i<=a;i++)
        {
            f=f*i;
        }
        System.out.println("fact of"+a+" is="+f);
    }
}