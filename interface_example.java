//interface example
interface printable
{
    void print();
}
class interface_example implements printable
{
    public void print()
    {
        System.out.println("3+5");
    }
    public static void main(String ar[])
    {
        interface_example m=new interface_example();
        m.print();
        
    }
}