//java program demonstating upcasting
import java.util.*;
class Parent
{
    String mom="maha";
    String dad="viraj";
    
    void display()
    {
        System.out.println("Mothername->"+mom+"\t father name->"+dad);
    }
}
class Child1 extends Parent
{
    String c1="lalithya";
    void display()
    {
        System.out.println("Child_1_name->"+c1);
    }
}
class Child2 extends Parent
{
    String c2="krishna";
    
    void display()
    {
        
        System.out.println("Child_2_name->"+c2);
    }
}
class Upcasting_ex
{
    public static void main(String GFDW[])
    {
        Parent p=new Parent();
        p.display();
        Parent p1=new Child1();
        p1.display();
        Parent p2=new Child2();
        p2.display();
    }
}