//super_method
class Bloom
{
    void function()
    {
        System.out.println("1");
    }
}
class Red extends Bloom
{
    void function()
    {
        System.out.println("2");
    }
    void display()
    {
        function();
        super.function();
    }
}
class Super_keyword_method_application
{
    public static void main(String arg[])
    {
        Red r=new Red();
     r.display();   
    }
}