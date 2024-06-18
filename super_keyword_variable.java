
	//super keyword
class Bloom
{
    int flowers=234;
}
class Mai extends Bloom
{
    int flowers=456;
    void gun()
    {
        System.out.println("red"+flowers);
        System.out.println("red"+super.flowers);
    }
}
class super_keyword_variable
{
    public static void main(String arg[])
    {
        Mai m=new Mai();
        m.gun();
    }
}