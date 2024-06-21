//abstarct class
abstract class Shape
{
   abstract void draw();
    void show()
    {
        System.out.println("it shows shape class");
    }
}
class Rectangle extends Shape
{
    void draw()
    {
        System.out.println("it's a Rectangleclass");
    }
}
class Circle extends Shape
{
    void draw()
    {
        System.out.println("it's a circle class");
    }
}
class Abstract_example
{
    public static void main(String arg[])
    {
        Shape s=new Rectangle();
        s.draw();
        
        Shape s1=new Circle();
        s1.draw();
        
        s.show();
    }
}