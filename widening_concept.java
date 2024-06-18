//widening concept=changing the lower size type into upper size type
import java.util.*;
class widening_concept
{
    public static void main(String arg[])
    {
        int a;
        double b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value");
        a=sc.nextInt();
        b=a;
        System.out.println("int value:"+a);
        System.out.println("float value:"+b);
    }
}