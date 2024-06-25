//try...catch...final...example
import java.io.*;
import java.util.*;
class try_catch_finally_example
{
    public static void main(String ard[])
    {
        
        int a=9;
        try
        {
            System.out.println(a/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally
        {
            System.out.println("finally always available");
        }
    }
}