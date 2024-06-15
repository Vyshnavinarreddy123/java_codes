/*1.Create a class MyMath and add addition,
multiplication and power methods. Overload all these
methods for different data types. Test these method
from a demo class.*/

import java.util.*;
import java.lang.Math;
class MyMath
{
    void add(int a,int b)
    {
        System.out.println("a+b="+(a+b));
    }
    void mul(int a,int b)
    {
        System.out.println("a*b="+(a*b));
    }
    void sub(int a,int b)
    {
        System.out.println("a-b="+(a-b));
    }
    void power(int a,int b)
    {
         double y=Math.pow(a,b);
        System.out.println("a^b="+y);
    }
    void add(float a,float b)
    {
        System.out.println("a+b="+a+b);
    }
    void mul(float a,float b)
    {
        System.out.println("a*b="+(a*b));
    }
    void sub(float a,float b)
    {
        System.out.println("a-b="+(a-b));
    }
    
}
class Math_pblm_overloadding
{
    public static void main(String arg[])
    {
        MyMath m=new MyMath();
        m.add(9,8);
        m.sub(4,2);
        m.mul(7,3);
        m.power(2,5);
        m.sub(9.8f,5.6f);
    }
}