//inheritance basics
import java.util.*;
class Bloom
{
    int a=6;
    void flowers()
    {
        a=a*2;
        System.out.println(a);
    }
}
class Bloom_mom extends Bloom
{
    int b=9;
    void red()
    {
        b=b*3;
        System.out.println(b);
    }
}
class Inheritance_example
{
    public static void main(String arg[])
    {
        Bloom_mom bl=new Bloom_mom();
        bl.flowers();
        bl.red();
        
    }
}