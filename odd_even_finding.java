import java.util.*;
class odd_even_finding
{
    public static void main(String args[])
    {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        a=sc.nextInt();
        if(a%2!=0)
        {
            System.out.println(a+"it is an odd");
        }
        else
        {
            System.out.println(a+"it is an even");
        }
        
    }
}
