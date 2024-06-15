/*2.Create a Shape class and overload area method to
calculate area of different shapes.(Rectangle, circle
and triangle).*/

import java.util.*;
class shape
{
    float pi=3.14f;
    void rectangle(int l,int b)
    {
        int a;
        a=l*b;
        System.out.println("area="+a);
    }
    void rectangle(float l,float b)
    {
        float a;
        a=l*b;
        System.out.println("area="+a);
    }
    void rectangle(double l,double b)
    {
        double a;
        a=l*b;
        System.out.println("area="+a); 
    }
    void circle(float r)
    {
        float a;
        a=pi*r*r;
        System.out.println("area="+a);
    }
    void triangle(int l,int b)
    {
        int a;
        a=l*b;
        System.out.println("area="+a/2);
    }
    void triangle(float l,float b)
    {
        float a;
        a=l*b;
        System.out.println("area="+(a*0.5f));
    }
    void triangle(double l,double b)
    {
        double a;
        a=l*b;
        System.out.println("area="+(a*0.5f)); 
    }
}
class shape_overloadding_pblmstmt
{
    public static void main(String arg[])
    {
        shape s=new shape();
        s.rectangle(6,7);
        s.rectangle(6.4,6.2);
        s.circle(6.4f);
        s.triangle(2,5);
    }
}