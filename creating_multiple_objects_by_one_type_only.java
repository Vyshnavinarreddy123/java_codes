//creating multiple objects by one type only
import java.util.*;
class Rectangle
{
    int len,wid;
    Rectangle(int l,int w)
    {
        len=l;
        wid=w;
    }
    void display()
    {
        System.out.println("len of rectangle="+len+"\nwid of rectangle="+wid);
        System.out.println("area of rectangle="+len*wid);
    }
}
class creating_multiple_objects_by_one_type_only
{
    public static void main(String arg[])
    {
        Rectangle r1=new Rectangle(3,2),r2=new Rectangle(5,6);
        r1.display();
        System.out.println("\n");
        r2.display();
    }
}