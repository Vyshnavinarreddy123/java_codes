//overloading constructor example
import java.util.*;
class Student
{
    Student(int a,int b,int v)
    {
        System.out.println(a+b+v);
    }
    Student(int a,int b)
    {
        System.out.println(a+b);
    }
    Student(int a,float b,double c)
    {
        System.out.println("All mixed");
    }
    Student()
    {
        System.out.println("default constructor");
    }
    Student(float b,double v)
    {
        System.out.println("invoked double,float:)))");
    }
    
    
}
class overloadinng_constructor_example
{
    public static void main(String args[])
    {
       Student s1=new Student(),s2=new Student(6.8f,567567),s3=new Student(1,2.2f,234563456),s4=new Student(4,5);
    }  
}