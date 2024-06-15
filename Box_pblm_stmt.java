/*Create a class “Box” Which contains instance variables width, height and
depth, a parameterized constructor to initialize its instance variables, a
method volume() to calculate the volume of the box and a method display()
to display all the details (width, height, depth and volume) of the box class.
Create a class BoxDemo and provide main method for instantiate a Box
object, initialize the instance variables, calculate volume and display all the
details.*/

import java.util.*;
class Box
{
    int wid,hei,dep,vol;
    Box()
    {}
    Box(int w,int h,int d)
    {
        wid=w;
        hei=h;
        dep=d;
    }
    void volume()
    {
        vol=wid*hei*dep;
        System.out.println("volume="+vol);
    }
    void display()
    {
        System.out.println("depth of box="+dep+"\nbreadth of box="+wid+"\nheight of box="+hei);
    }
}
class Box_pblm_stmt
{
    public static void main(String arg[])
    {
        Box b=new Box(5,6,2);
        b.volume();
        b.display();
    }
}