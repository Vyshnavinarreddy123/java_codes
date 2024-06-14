import java.util.*;
class Palindrome_checking
{
    public static void main(String arg[])
    {
        int a,r=0,rev=0,or=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        a=sc.nextInt();
        or=a;
        //System.out.println("a="+a);
        while(a>0)
        {
            r=a%10;
            rev=rev*10+r;
            a=a/10;
        }
        //System.out.println("rev="+rev);
         //System.out.println("a="+a);
        if(or==rev)
        {
            System.out.println("it's a palindrome");
        }
        else
        {
            System.out.println("it's not a palindrome");
        }
    }
}
