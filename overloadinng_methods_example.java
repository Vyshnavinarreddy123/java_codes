//overloading methods example
import java.util.*;
class Main12
{
    
    void method1(int a)
    {
        System.out.println(a);
    }
    void method1(int a,int b)
    {
        System.out.println(a+b);
    }
    void method1(double r)
    {
        System.out.println(r);
    }
    void method1(float f)
    {
        System.out.println(f);
    }
}
class overloadinng_methods_example
{
    public static void main(String args[])
    {
        Main12 m=new Main12();
        m.method1(4);
        m.method1(7.7);
        m.method1(2,5);
        m.method1(5908776);
        
    }
}