//java pgm describing static Method
import java.util.*;
class Student
{
    int age;
    String name;
    static String cname="gautham";
    void input(int a,String s)
    {
        age=a;
        name=s;
    }
    static void inn()
    {
        cname="seetha";
        //age=3;  non-static variable age cannot be referenced from a static context
       // name="siri"; non-static variable name cannot be referenced from a static context
       //input(2,"lissa"); non-static method input(int,String) cannot be referenced from a static context
    }
    void display()
    {
        System.out.println("name:"+name+"\tage:"+age+"\tcname:"+cname);
    }
}
class static_method_example
{
    public static void main(String arf[])
    {
        Student s=new Student();
        s.input(1,"leela");
        s.display();
    }
}