/*Create an abstract class called Shape2d that has two data
members of type double and two abstract methods area()
and display(). Create two derived classes Rectangle and
Triangle. In both classes define the method area() to
compute the area of that shape and return it as a double
value and define the method display() to display the value
of the data members with appropriate caption and the
calculated area. Create a class called Shape2dDemo and
provide main method to instantiate the objects of Rectangle
and Triangle for demonstration of the above classes.*/
//abstract example
abstract class area
{
    double a,b;
    area(double c,double d)
    {
        a=c;
        b=d;
    }
    abstract void cal_area();
}
class Rectangle extends area
{
    Rectangle(double c,double b)
    {
        super(c,b);
    }
    void cal_area()
    {
        System.out.println("area of rectangle="+a*b);
    }
}
class Triangle extends area
{
    Triangle(double c,double b)
    {
        super(c,b);
    }
    void cal_area()
    {
        System.out.println("area of triangle="+(a*b)/2);
    }
}
class Abstract_area_pblmstmt
{
    public static void main(String arg[])
    {
        area a=new Rectangle(3.567,23.34);
        a.cal_area();
        
        area b=new Triangle(23,4.34);
        b.cal_area();
    }
}
