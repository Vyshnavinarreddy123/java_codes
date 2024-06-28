/*In this example, the Drawable interface has only one
method. Its implementation is provided by Rectangle and
Circle classes. In a real scenario, an interface is defined by
someone else, but its implementation is provided by
different implementation providers. Moreover, it is used by
someone else. The implementation part is hidden by the
user who uses the interface.*/


 interface Drawable
{
    void area();
}
class Rectangle implements Drawable
{
    int l=8,b=5;
    public void area()
    {
        System.out.println(l*b);
    }
}
class Circle implements Drawable
{
    public void area()
    {
        System.out.println(6*6);
    }
}
class interface_pblm_stmt
{
    public static void main(String arg[])
    {
        Rectangle r=new Rectangle();
        r.area();
        Circle c=new Circle();
        c.area();
    }
}