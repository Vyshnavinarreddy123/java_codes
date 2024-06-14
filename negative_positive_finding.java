import java.util.*;
class negative_positive_finding
{
    public static void main(String args[])
    {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value");
        a=sc.nextInt();
        if(a<0)
        {
            System.out.println(a+"\t is a negative number");
        }
        else 
        {
            System.out.println(a+"\t is a positive number");
        }
    }
}