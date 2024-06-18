//narrowing
import java.util.*;
class Narrowing_concept
{
    public static void main(String args[])
    {
        float a;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        a=sc.nextFloat();
        byte b;
        b=(byte)a;
         System.out.println("a value(float):"+a);
         System.out.println("b value(byte):"+b);
    
    }
}