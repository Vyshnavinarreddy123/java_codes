//initializing object using reference
import java.util.*;
class initializing_object_using_reference
{
    int a;
    String name;
    public static void main(String arg[])
    {
        // System.out.println("name="+name+" no="+a);//non-static variable name cannot be referenced from a static context
        Main m=new Main();//new keyword allocates memory at running time . it gets heap memory
        m.a=9;
        m.name="lakshmi";
        System.out.println("name="+m.name+" no="+m.a);
        
    }
}